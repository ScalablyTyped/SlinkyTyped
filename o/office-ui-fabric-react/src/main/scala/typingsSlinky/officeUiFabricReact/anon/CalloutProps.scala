package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutProps extends js.Object {
  /**
    * Default calloutProps is deprecated in favor of private `_defaultCalloutProps`.
    * Remove in next release.
    * @deprecated In favor of private `_defaultCalloutProps`.
    */
  var calloutProps: BeakWidth = js.native
}

object CalloutProps {
  @scala.inline
  def apply(calloutProps: BeakWidth): CalloutProps = {
    val __obj = js.Dynamic.literal(calloutProps = calloutProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  @scala.inline
  implicit class CalloutPropsOps[Self <: CalloutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutProps(value: BeakWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

