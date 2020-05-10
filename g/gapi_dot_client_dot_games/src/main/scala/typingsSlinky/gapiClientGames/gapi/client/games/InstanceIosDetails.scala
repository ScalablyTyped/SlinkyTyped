package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceIosDetails extends js.Object {
  /** Bundle identifier. */
  var bundleIdentifier: js.UndefOr[String] = js.native
  /** iTunes App ID. */
  var itunesAppId: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceIosDetails. */
  var kind: js.UndefOr[String] = js.native
  /** Indicates that this instance is the default for new installations on iPad devices. */
  var preferredForIpad: js.UndefOr[Boolean] = js.native
  /** Indicates that this instance is the default for new installations on iPhone devices. */
  var preferredForIphone: js.UndefOr[Boolean] = js.native
  /** Flag to indicate if this instance supports iPad. */
  var supportIpad: js.UndefOr[Boolean] = js.native
  /** Flag to indicate if this instance supports iPhone. */
  var supportIphone: js.UndefOr[Boolean] = js.native
}

object InstanceIosDetails {
  @scala.inline
  def apply(): InstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIosDetails]
  }
  @scala.inline
  implicit class InstanceIosDetailsOps[Self <: InstanceIosDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withItunesAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItunesAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itunesAppId")(js.undefined)
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
    def withPreferredForIpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredForIpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredForIpad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredForIpad")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredForIphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredForIphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredForIphone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredForIphone")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportIpad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportIpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportIpad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportIpad")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportIphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportIphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportIphone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportIphone")(js.undefined)
        ret
    }
  }
  
}

