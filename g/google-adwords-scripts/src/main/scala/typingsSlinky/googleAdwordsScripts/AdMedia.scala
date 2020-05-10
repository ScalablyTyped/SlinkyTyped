package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Media
@js.native
trait AdMedia extends js.Object {
  def media(): AdWordsSelector[Media] = js.native
  def newImageBuilder(): ImageBuilder[Media] = js.native
  def newMediaBundleBuilder(): MediaBundleBuilder[Media] = js.native
  def newVideoBuilder(): VideoBuilder[Media] = js.native
}

object AdMedia {
  @scala.inline
  def apply(
    media: () => AdWordsSelector[Media],
    newImageBuilder: () => ImageBuilder[Media],
    newMediaBundleBuilder: () => MediaBundleBuilder[Media],
    newVideoBuilder: () => VideoBuilder[Media]
  ): AdMedia = {
    val __obj = js.Dynamic.literal(media = js.Any.fromFunction0(media), newImageBuilder = js.Any.fromFunction0(newImageBuilder), newMediaBundleBuilder = js.Any.fromFunction0(newMediaBundleBuilder), newVideoBuilder = js.Any.fromFunction0(newVideoBuilder))
    __obj.asInstanceOf[AdMedia]
  }
  @scala.inline
  implicit class AdMediaOps[Self <: AdMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: () => AdWordsSelector[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewImageBuilder(value: () => ImageBuilder[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newImageBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMediaBundleBuilder(value: () => MediaBundleBuilder[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMediaBundleBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewVideoBuilder(value: () => VideoBuilder[Media]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newVideoBuilder")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

