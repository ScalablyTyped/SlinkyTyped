package typingsSlinky.googleAppsScript.GoogleAppsScript.Content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextOutput object that can be served from a script.
  *
  * Due to security considerations, scripts cannot directly return text content to a browser.
  * Instead, the browser is redirected to googleusercontent.com, which will display it without any
  * further sanitization or manipulation.
  *
  * You can return text content like this:
  *
  *     function doGet() {
  *       return ContentService.createTextOutput("hello world!");
  *     }
  *
  * ContentService
  */
@js.native
trait TextOutput extends js.Object {
  def append(addedContent: String): TextOutput = js.native
  def clear(): TextOutput = js.native
  def downloadAsFile(filename: String): TextOutput = js.native
  def getContent(): String = js.native
  def getFileName(): String = js.native
  def getMimeType(): MimeType = js.native
  def setContent(content: String): TextOutput = js.native
  def setMimeType(mimeType: MimeType): TextOutput = js.native
}

object TextOutput {
  @scala.inline
  def apply(
    append: String => TextOutput,
    clear: () => TextOutput,
    downloadAsFile: String => TextOutput,
    getContent: () => String,
    getFileName: () => String,
    getMimeType: () => MimeType,
    setContent: String => TextOutput,
    setMimeType: MimeType => TextOutput
  ): TextOutput = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), clear = js.Any.fromFunction0(clear), downloadAsFile = js.Any.fromFunction1(downloadAsFile), getContent = js.Any.fromFunction0(getContent), getFileName = js.Any.fromFunction0(getFileName), getMimeType = js.Any.fromFunction0(getMimeType), setContent = js.Any.fromFunction1(setContent), setMimeType = js.Any.fromFunction1(setMimeType))
    __obj.asInstanceOf[TextOutput]
  }
  @scala.inline
  implicit class TextOutputOps[Self <: TextOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: String => TextOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => TextOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDownloadAsFile(value: String => TextOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAsFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFileName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMimeType(value: () => MimeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMimeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => TextOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMimeType(value: MimeType => TextOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMimeType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

