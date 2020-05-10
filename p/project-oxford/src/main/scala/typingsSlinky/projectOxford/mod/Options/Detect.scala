package typingsSlinky.projectOxford.mod.Options

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detect extends js.Object {
   // Analyze face landmarks?
  var analyzesAge: js.UndefOr[Boolean] = js.native
   // Stream of an image to be used
  var analyzesFaceLandmarks: js.UndefOr[Boolean] = js.native
   // Analyze age?
  var analyzesGender: js.UndefOr[Boolean] = js.native
   // Analyze gender?
  var analyzesHeadPose: js.UndefOr[Boolean] = js.native
   // URL to image to be used
  var path: js.UndefOr[String] = js.native
   // Path to image to be used
  var stream: js.UndefOr[Stream] = js.native
  var url: js.UndefOr[String] = js.native
}

object Detect {
  @scala.inline
  def apply(): Detect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detect]
  }
  @scala.inline
  implicit class DetectOps[Self <: Detect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzesAge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzesAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesAge")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzesFaceLandmarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesFaceLandmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzesFaceLandmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesFaceLandmarks")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzesGender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesGender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzesGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesGender")(js.undefined)
        ret
    }
    @scala.inline
    def withAnalyzesHeadPose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesHeadPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzesHeadPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyzesHeadPose")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
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
  }
  
}

