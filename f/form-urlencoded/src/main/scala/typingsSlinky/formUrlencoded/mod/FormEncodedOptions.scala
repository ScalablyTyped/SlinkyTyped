package typingsSlinky.formUrlencoded.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormEncodedOptions extends js.Object {
  var ignorenull: js.UndefOr[Boolean] = js.native
  var skipIndex: js.UndefOr[Boolean] = js.native
  var sorted: js.UndefOr[Boolean] = js.native
}

object FormEncodedOptions {
  @scala.inline
  def apply(): FormEncodedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormEncodedOptions]
  }
  @scala.inline
  implicit class FormEncodedOptionsOps[Self <: FormEncodedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnorenull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorenull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorenull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorenull")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSorted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
  }
  
}

