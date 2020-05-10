package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachObjectResponse extends js.Object {
  /**
    * The ObjectIdentifier that was detached from the object.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}

object DetachObjectResponse {
  @scala.inline
  def apply(): DetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachObjectResponse]
  }
  @scala.inline
  implicit class DetachObjectResponseOps[Self <: DetachObjectResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetachedObjectIdentifier(value: ObjectIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachedObjectIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetachedObjectIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetachedObjectIdentifier")(js.undefined)
        ret
    }
  }
  
}

