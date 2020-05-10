package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceWebDetails extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#instanceWebDetails. */
  var kind: js.UndefOr[String] = js.native
  /** Launch URL for the game. */
  var launchUrl: js.UndefOr[String] = js.native
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.native
}

object InstanceWebDetails {
  @scala.inline
  def apply(): InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWebDetails]
  }
  @scala.inline
  implicit class InstanceWebDetailsOps[Self <: InstanceWebDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLaunchUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUrl")(js.undefined)
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

