package typingsSlinky.ffmpegConcat.mod

import typingsSlinky.ffmpegConcat.ffmpegConcatStrings.jpg
import typingsSlinky.ffmpegConcat.ffmpegConcatStrings.png
import typingsSlinky.ffmpegConcat.ffmpegConcatStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcatOptions extends js.Object {
  var audio: js.UndefOr[String] = js.native
  var cleanupFrames: js.UndefOr[Boolean] = js.native
  var concurrency: js.UndefOr[Double] = js.native
  var frameFormat: js.UndefOr[jpg | png | raw] = js.native
  var log: js.UndefOr[js.Function1[/* stdout */ String, Unit]] = js.native
  var output: String = js.native
  var tempDir: js.UndefOr[String] = js.native
  var transition: js.UndefOr[Transition] = js.native
  var transitions: js.UndefOr[js.Array[Transition]] = js.native
  var videos: js.Array[String] = js.native
}

object ConcatOptions {
  @scala.inline
  def apply(output: String, videos: js.Array[String]): ConcatOptions = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatOptions]
  }
  @scala.inline
  implicit class ConcatOptionsOps[Self <: ConcatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideos(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanupFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanupFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameFormat(value: jpg | png | raw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: /* stdout */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withTempDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTempDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDir")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: js.Array[Transition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(js.undefined)
        ret
    }
  }
  
}

