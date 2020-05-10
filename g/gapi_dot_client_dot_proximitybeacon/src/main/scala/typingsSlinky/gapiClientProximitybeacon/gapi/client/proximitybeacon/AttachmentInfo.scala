package typingsSlinky.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentInfo extends js.Object {
  /** An opaque data container for client-provided data. */
  var data: js.UndefOr[String] = js.native
  /**
    * Specifies what kind of attachment this is. Tells a client how to
    * interpret the `data` field. Format is <var>namespace/type</var>, for
    * example <code>scrupulous-wombat-12345/welcome-message</code>
    */
  var namespacedType: js.UndefOr[String] = js.native
}

object AttachmentInfo {
  @scala.inline
  def apply(): AttachmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInfo]
  }
  @scala.inline
  implicit class AttachmentInfoOps[Self <: AttachmentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespacedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespacedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespacedType")(js.undefined)
        ret
    }
  }
  
}

