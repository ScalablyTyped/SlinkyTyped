package typingsSlinky.firebaseFirestore.simpleDbMod

import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterateOptions extends js.Object {
  /** Index to iterate over (else primary keys will be iterated) */
  var index: js.UndefOr[String] = js.native
  /** If true, values aren't read while iterating. */
  var keysOnly: js.UndefOr[Boolean] = js.native
  /** IndxedDB Range to iterate over (else entire store will be iterated) */
  var range: js.UndefOr[IDBKeyRange] = js.native
  /** If true, iterate over the store in reverse. */
  var reverse: js.UndefOr[Boolean] = js.native
}

object IterateOptions {
  @scala.inline
  def apply(): IterateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterateOptions]
  }
  @scala.inline
  implicit class IterateOptionsOps[Self <: IterateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeysOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: IDBKeyRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.undefined)
        ret
    }
  }
  
}

