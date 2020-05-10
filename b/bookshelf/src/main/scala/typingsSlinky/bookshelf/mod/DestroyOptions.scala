package typingsSlinky.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyOptions extends SyncOptions {
  /** @default true */
  var require: js.UndefOr[Boolean] = js.native
}

object DestroyOptions {
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  @scala.inline
  implicit class DestroyOptionsOps[Self <: DestroyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require")(js.undefined)
        ret
    }
  }
  
}

