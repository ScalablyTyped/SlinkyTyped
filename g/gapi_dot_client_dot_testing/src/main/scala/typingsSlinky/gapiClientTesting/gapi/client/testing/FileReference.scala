package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileReference extends js.Object {
  /**
    * A path to a file in Google Cloud Storage.
    * Example: gs://build-app-1414623860166/app-debug-unaligned.apk
    */
  var gcsPath: js.UndefOr[String] = js.native
}

object FileReference {
  @scala.inline
  def apply(): FileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileReference]
  }
  @scala.inline
  implicit class FileReferenceOps[Self <: FileReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGcsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcsPath")(js.undefined)
        ret
    }
  }
  
}

