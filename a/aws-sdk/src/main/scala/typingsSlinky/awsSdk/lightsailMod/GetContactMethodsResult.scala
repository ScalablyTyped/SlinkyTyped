package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactMethodsResult extends js.Object {
  /**
    * An array of objects that describe the contact methods.
    */
  var contactMethods: js.UndefOr[ContactMethodsList] = js.native
}

object GetContactMethodsResult {
  @scala.inline
  def apply(): GetContactMethodsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactMethodsResult]
  }
  @scala.inline
  implicit class GetContactMethodsResultOps[Self <: GetContactMethodsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactMethods(value: ContactMethodsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactMethods")(js.undefined)
        ret
    }
  }
  
}

