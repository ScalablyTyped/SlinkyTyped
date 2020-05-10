package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Results extends js.Object {
  /** List of build step digests, in order corresponding to build step indices. */
  var buildStepImages: js.UndefOr[js.Array[String]] = js.native
  /** Images that were built as a part of the build. */
  var images: js.UndefOr[js.Array[BuiltImage]] = js.native
}

object Results {
  @scala.inline
  def apply(): Results = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Results]
  }
  @scala.inline
  implicit class ResultsOps[Self <: Results] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildStepImages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStepImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildStepImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildStepImages")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[BuiltImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
  }
  
}

