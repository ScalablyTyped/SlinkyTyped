package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAndroidDetails extends js.Object {
  /** Flag indicating whether the anti-piracy check is enabled. */
  var enablePiracyCheck: js.UndefOr[Boolean] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceAndroidDetails. */
  var kind: js.UndefOr[String] = js.native
  /** Android package name which maps to Google Play URL. */
  var packageName: js.UndefOr[String] = js.native
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.native
}

object InstanceAndroidDetails {
  @scala.inline
  def apply(): InstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAndroidDetails]
  }
  @scala.inline
  implicit class InstanceAndroidDetailsOps[Self <: InstanceAndroidDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablePiracyCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePiracyCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePiracyCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePiracyCheck")(js.undefined)
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
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferred(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(js.undefined)
        ret
    }
  }
  
}

