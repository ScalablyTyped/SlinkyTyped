package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateObjectResponse extends js.Object {
  /**
    * The identifier that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}

object CreateObjectResponse {
  @scala.inline
  def apply(): CreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateObjectResponse]
  }
  @scala.inline
  implicit class CreateObjectResponseOps[Self <: CreateObjectResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectIdentifier")(js.undefined)
        ret
    }
  }
  
}

