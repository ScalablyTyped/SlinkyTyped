package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSIOptions extends js.Object {
  /**
    * @prop {string} [resource] -  The resource uri or token audience for which the token is needed.
    * For e.g. it can be:
    * - resourcemanagement endpoint "https://management.azure.com"(default) 
    * - management endpoint "https://management.core.windows.net/"
    */
  var resource: js.UndefOr[String] = js.native
}

object MSIOptions {
  @scala.inline
  def apply(): MSIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIOptions]
  }
  @scala.inline
  implicit class MSIOptionsOps[Self <: MSIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

