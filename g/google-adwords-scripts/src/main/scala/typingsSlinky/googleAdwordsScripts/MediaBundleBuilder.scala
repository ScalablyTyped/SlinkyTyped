package typingsSlinky.googleAdwordsScripts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaBundleBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): MediaBundleBuilder[Media] = js.native
  def withName(name: String): MediaBundleBuilder[Media] = js.native
}

object MediaBundleBuilder {
  @scala.inline
  def apply[Media](
    build: () => AdWordsOperation[Media],
    withData: Blob => MediaBundleBuilder[Media],
    withName: String => MediaBundleBuilder[Media]
  ): MediaBundleBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withData = js.Any.fromFunction1(withData), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[MediaBundleBuilder[Media]]
  }
  @scala.inline
  implicit class MediaBundleBuilderOps[Self[media] <: MediaBundleBuilder[media], Media] (val x: Self[Media]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Media] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Media]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Media] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Media] with Other]
    @scala.inline
    def withWithData(value: Blob => MediaBundleBuilder[Media]): Self[Media] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => MediaBundleBuilder[Media]): Self[Media] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

