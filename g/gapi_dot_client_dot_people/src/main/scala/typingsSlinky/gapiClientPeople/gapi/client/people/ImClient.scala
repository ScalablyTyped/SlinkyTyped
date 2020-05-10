package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImClient extends js.Object {
  /**
    * Output only. The protocol of the IM client formatted in the viewer's account
    * locale or the `Accept-Language` HTTP header locale.
    */
  var formattedProtocol: js.UndefOr[String] = js.native
  /**
    * Output only. The type of the IM client translated and formatted in the
    * viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /** Metadata about the IM client. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  /**
    * The protocol of the IM client. The protocol can be custom or one of these
    * predefined values:
    *
    * &#42; `aim`
    * &#42; `msn`
    * &#42; `yahoo`
    * &#42; `skype`
    * &#42; `qq`
    * &#42; `googleTalk`
    * &#42; `icq`
    * &#42; `jabber`
    * &#42; `netMeeting`
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The type of the IM client. The type can be custom or one of these
    * predefined values:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /** The user name used in the IM client. */
  var username: js.UndefOr[String] = js.native
}

object ImClient {
  @scala.inline
  def apply(): ImClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImClient]
  }
  @scala.inline
  implicit class ImClientOps[Self <: ImClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withFormattedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: FieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

