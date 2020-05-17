package typingsSlinky.formik.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dirty[Values] extends js.Object {
  var dirty: Boolean = js.native
  var initialValues: Values = js.native
  var isValid: Boolean = js.native
}

object Dirty {
  @scala.inline
  def apply[Values](dirty: Boolean, initialValues: Values, isValid: Boolean): Dirty[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirty[Values]]
  }
  @scala.inline
  implicit class DirtyOps[Self[values] <: Dirty[values], Values] (val x: Self[Values]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Values] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Values]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Values] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Values] with Other]
    @scala.inline
    def withDirty(value: Boolean): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialValues(value: Values): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

