package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkUpload[T] extends js.Object {
  def forCampaignManagement(): T = js.native
  def forOfflineConversions(): T = js.native
  def preview(): Unit = js.native
  def setFileName(fileName: String): T = js.native
}

object BulkUpload {
  @scala.inline
  def apply[T](
    forCampaignManagement: () => T,
    forOfflineConversions: () => T,
    preview: () => Unit,
    setFileName: String => T
  ): BulkUpload[T] = {
    val __obj = js.Dynamic.literal(forCampaignManagement = js.Any.fromFunction0(forCampaignManagement), forOfflineConversions = js.Any.fromFunction0(forOfflineConversions), preview = js.Any.fromFunction0(preview), setFileName = js.Any.fromFunction1(setFileName))
    __obj.asInstanceOf[BulkUpload[T]]
  }
  @scala.inline
  implicit class BulkUploadOps[Self[t] <: BulkUpload[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withForCampaignManagement(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forCampaignManagement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForOfflineConversions(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forOfflineConversions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreview(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFileName(value: String => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

