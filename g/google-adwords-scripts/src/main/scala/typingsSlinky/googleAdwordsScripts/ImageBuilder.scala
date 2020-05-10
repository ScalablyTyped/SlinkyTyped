package typingsSlinky.googleAdwordsScripts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): ImageBuilder[Media] = js.native
  def withName(name: String): ImageBuilder[Media] = js.native
}

object ImageBuilder {
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: Blob => ImageBuilder[Media],
    withName: String => ImageBuilder[Media]
  ): ImageBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ImageBuilder[Media]]
  }
  @scala.inline
  implicit class ImageBuilderOps[Self[media] <: ImageBuilder[media], Media] (val x: Self[Media]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Media] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Media]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Media] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Media] with Other]
    @scala.inline
    def withWithData(value: Blob => ImageBuilder[Media]): Self[Media] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => ImageBuilder[Media]): Self[Media] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

