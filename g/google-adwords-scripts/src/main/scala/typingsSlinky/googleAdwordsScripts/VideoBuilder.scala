package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoBuilder[Media] extends AdWordsBuilder[Media] {
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder[Media] = js.native
}

object VideoBuilder {
  @scala.inline
  def apply[Media](build: () => AdWordsOperation[Media], withYouTubeVideoId: String => VideoBuilder[Media]): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withYouTubeVideoId = js.Any.fromFunction1(withYouTubeVideoId))
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
  @scala.inline
  implicit class VideoBuilderOps[Self[media] <: VideoBuilder[media], Media] (val x: Self[Media]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Media] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Media]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Media] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Media] with Other]
    @scala.inline
    def withWithYouTubeVideoId(value: String => VideoBuilder[Media]): Self[Media] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withYouTubeVideoId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

