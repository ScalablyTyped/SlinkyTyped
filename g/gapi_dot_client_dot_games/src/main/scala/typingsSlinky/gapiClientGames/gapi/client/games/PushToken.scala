package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushToken extends js.Object {
  /**
    * The revision of the client SDK used by your application, in the same format that's used by revisions.check. Used to send backward compatible messages.
    * Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible values of PLATFORM_TYPE are:
    * - IOS - Push token is for iOS
    */
  var clientRevision: js.UndefOr[String] = js.native
  /** Unique identifier for this push token. */
  var id: js.UndefOr[PushTokenId] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#pushToken. */
  var kind: js.UndefOr[String] = js.native
  /** The preferred language for notifications that are sent using this token. */
  var language: js.UndefOr[String] = js.native
}

object PushToken {
  @scala.inline
  def apply(): PushToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushToken]
  }
  @scala.inline
  implicit class PushTokenOps[Self <: PushToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRevision")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: PushTokenId): Self = {
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

