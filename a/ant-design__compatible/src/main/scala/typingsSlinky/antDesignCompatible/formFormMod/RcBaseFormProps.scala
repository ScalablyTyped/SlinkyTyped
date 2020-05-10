package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RcBaseFormProps extends js.Object {
  var wrappedComponentRef: js.UndefOr[js.Any] = js.native
}

object RcBaseFormProps {
  @scala.inline
  def apply(): RcBaseFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RcBaseFormProps]
  }
  @scala.inline
  implicit class RcBaseFormPropsOps[Self <: RcBaseFormProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrappedComponentRef(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrappedComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrappedComponentRef")(js.undefined)
        ret
    }
  }
  
}

