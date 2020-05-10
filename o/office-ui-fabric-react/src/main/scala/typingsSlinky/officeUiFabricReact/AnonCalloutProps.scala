package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalloutProps extends js.Object {
  /**
    * Default calloutProps is deprecated in favor of private `_defaultCalloutProps`.
    * Remove in next release.
    * @deprecated In favor of private `_defaultCalloutProps`.
    */
  var calloutProps: AnonBeakWidth = js.native
}

object AnonCalloutProps {
  @scala.inline
  def apply(calloutProps: AnonBeakWidth): AnonCalloutProps = {
    val __obj = js.Dynamic.literal(calloutProps = calloutProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalloutProps]
  }
  @scala.inline
  implicit class AnonCalloutPropsOps[Self <: AnonCalloutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutProps(value: AnonBeakWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

