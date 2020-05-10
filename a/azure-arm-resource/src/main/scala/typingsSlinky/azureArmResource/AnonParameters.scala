package typingsSlinky.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azureArmResource.libModelsMod.Appliance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParameters extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var parameters: js.UndefOr[Appliance] = js.native
}

object AnonParameters {
  @scala.inline
  def apply(): AnonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonParameters]
  }
  @scala.inline
  implicit class AnonParametersOps[Self <: AnonParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Appliance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

