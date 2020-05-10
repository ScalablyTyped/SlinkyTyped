package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Testers extends js.Object {
  var googleGroups: js.UndefOr[js.Array[String]] = js.native
  var googlePlusCommunities: js.UndefOr[js.Array[String]] = js.native
}

object Testers {
  @scala.inline
  def apply(): Testers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Testers]
  }
  @scala.inline
  implicit class TestersOps[Self <: Testers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoogleGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePlusCommunities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusCommunities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlusCommunities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusCommunities")(js.undefined)
        ret
    }
  }
  
}

