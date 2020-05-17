package typingsSlinky.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientSpecificActorInfo extends js.Object {
  /** Actor info specific to particular clients. */
  var clientSpecificActorInfo: js.UndefOr[YoutubeActorInfo] = js.native
  /** The name of the actor, suitable for display. */
  var displayName: js.UndefOr[String] = js.native
  /** The ID of the actor's Person resource. */
  var id: js.UndefOr[String] = js.native
  /** The image representation of the actor. */
  var image: js.UndefOr[Url] = js.native
  /** An object representation of the individual components of name. */
  var name: js.UndefOr[FamilyName] = js.native
  /** The link to the actor's Google profile. */
  var url: js.UndefOr[String] = js.native
  /** Verification status of actor. */
  var verification: js.UndefOr[AdHocVerified] = js.native
}

object ClientSpecificActorInfo {
  @scala.inline
  def apply(): ClientSpecificActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSpecificActorInfo]
  }
  @scala.inline
  implicit class ClientSpecificActorInfoOps[Self <: ClientSpecificActorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientSpecificActorInfo(value: YoutubeActorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSpecificActorInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSpecificActorInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSpecificActorInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: FamilyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVerification(value: AdHocVerified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}

