package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileLobApp extends MobileApp {
  // The internal committed content version.
  var committedContentVersion: js.UndefOr[String] = js.native
  // The list of content versions for this app.
  var contentVersions: js.UndefOr[js.Array[MobileAppContent]] = js.native
  // The name of the main Lob application file.
  var fileName: js.UndefOr[String] = js.native
  // The total size, including all uploaded files.
  var size: js.UndefOr[Double] = js.native
}

object MobileLobApp {
  @scala.inline
  def apply(): MobileLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileLobApp]
  }
  @scala.inline
  implicit class MobileLobAppOps[Self <: MobileLobApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommittedContentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committedContentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommittedContentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committedContentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withContentVersions(value: js.Array[MobileAppContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

