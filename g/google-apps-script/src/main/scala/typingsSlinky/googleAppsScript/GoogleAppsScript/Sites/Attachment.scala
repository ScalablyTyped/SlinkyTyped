package typingsSlinky.googleAppsScript.GoogleAppsScript.Sites

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Sites Attachment such as a file attached to a page.
  *
  * Note that an Attachment is a Blob and can be used anywhere Blob input is expected.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  *
  *     var filesPage = SitesApp.getSite('example.com', 'mysite').getChildByName("files");
  *     var attachments = filesPage.getAttachments();
  *
  *     // DocsList.createFile accepts a blob input. Since an Attachment is just a blob, we can
  *     // just pass it directly to that method
  *     var file = DocsList.createFile(attachments[0]);
  */
@js.native
trait Attachment extends js.Object {
  def deleteAttachment(): Unit = js.native
  def getAs(contentType: String): Blob = js.native
  def getAttachmentType(): AttachmentType = js.native
  def getBlob(): Blob = js.native
  def getContentType(): String = js.native
  def getDatePublished(): Date = js.native
  def getDescription(): String = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def setContentType(contentType: String): Attachment = js.native
  def setDescription(description: String): Attachment = js.native
  def setFrom(blob: BlobSource): Attachment = js.native
  def setParent(parent: Page): Attachment = js.native
  def setTitle(title: String): Attachment = js.native
  def setUrl(url: String): Attachment = js.native
}

object Attachment {
  @scala.inline
  def apply(
    deleteAttachment: () => Unit,
    getAs: String => Blob,
    getAttachmentType: () => AttachmentType,
    getBlob: () => Blob,
    getContentType: () => String,
    getDatePublished: () => Date,
    getDescription: () => String,
    getLastUpdated: () => Date,
    getParent: () => Page,
    getTitle: () => String,
    getUrl: () => String,
    setContentType: String => Attachment,
    setDescription: String => Attachment,
    setFrom: BlobSource => Attachment,
    setParent: Page => Attachment,
    setTitle: String => Attachment,
    setUrl: String => Attachment
  ): Attachment = {
    val __obj = js.Dynamic.literal(deleteAttachment = js.Any.fromFunction0(deleteAttachment), getAs = js.Any.fromFunction1(getAs), getAttachmentType = js.Any.fromFunction0(getAttachmentType), getBlob = js.Any.fromFunction0(getBlob), getContentType = js.Any.fromFunction0(getContentType), getDatePublished = js.Any.fromFunction0(getDatePublished), getDescription = js.Any.fromFunction0(getDescription), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getTitle = js.Any.fromFunction0(getTitle), getUrl = js.Any.fromFunction0(getUrl), setContentType = js.Any.fromFunction1(setContentType), setDescription = js.Any.fromFunction1(setDescription), setFrom = js.Any.fromFunction1(setFrom), setParent = js.Any.fromFunction1(setParent), setTitle = js.Any.fromFunction1(setTitle), setUrl = js.Any.fromFunction1(setUrl))
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteAttachment(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAttachment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAs(value: String => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttachmentType(value: () => AttachmentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachmentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBlob(value: () => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContentType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDatePublished(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDatePublished")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastUpdated(value: () => Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetParent(value: () => Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContentType(value: String => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDescription(value: String => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDescription")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFrom(value: BlobSource => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParent(value: Page => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrl(value: String => Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

