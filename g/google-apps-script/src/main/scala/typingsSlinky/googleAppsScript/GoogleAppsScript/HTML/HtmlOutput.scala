package typingsSlinky.googleAppsScript.GoogleAppsScript.HTML

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HtmlOutput object that can be served from a script. Due to security considerations,
  * scripts cannot directly return HTML to a browser. Instead, they must sanitize it so that it
  * cannot perform malicious actions. You can return sanitized HTML like this:
  *
  *     function doGet() {
  *       return HtmlService.createHtmlOutput('<b>Hello, world!</b>');
  *     }
  *
  * HtmlOutput
  * iframe
  * sandboxing
  * guide to restrictions in HTML service
  */
@js.native
trait HtmlOutput extends js.Object {
  def addMetaTag(name: String, content: String): HtmlOutput = js.native
  def append(addedContent: String): HtmlOutput = js.native
  def appendUntrusted(addedContent: String): HtmlOutput = js.native
  def asTemplate(): HtmlTemplate = js.native
  def clear(): HtmlOutput = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContent(): String = js.native
  def getFaviconUrl(): String = js.native
  def getHeight(): Integer = js.native
  def getMetaTags(): js.Array[HtmlOutputMetaTag] = js.native
  def getTitle(): String = js.native
  def getWidth(): Integer = js.native
  def setContent(content: String): HtmlOutput = js.native
  def setFaviconUrl(iconUrl: String): HtmlOutput = js.native
  def setHeight(height: Integer): HtmlOutput = js.native
  def setSandboxMode(mode: SandboxMode): HtmlOutput = js.native
  def setTitle(title: String): HtmlOutput = js.native
  def setWidth(width: Integer): HtmlOutput = js.native
  def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput = js.native
}

object HtmlOutput {
  @scala.inline
  def apply(
    addMetaTag: (String, String) => HtmlOutput,
    append: String => HtmlOutput,
    appendUntrusted: String => HtmlOutput,
    asTemplate: () => HtmlTemplate,
    clear: () => HtmlOutput,
    getAs: String => Blob,
    getBlob: () => Blob,
    getContent: () => String,
    getFaviconUrl: () => String,
    getHeight: () => Integer,
    getMetaTags: () => js.Array[HtmlOutputMetaTag],
    getTitle: () => String,
    getWidth: () => Integer,
    setContent: String => HtmlOutput,
    setFaviconUrl: String => HtmlOutput,
    setHeight: Integer => HtmlOutput,
    setSandboxMode: SandboxMode => HtmlOutput,
    setTitle: String => HtmlOutput,
    setWidth: Integer => HtmlOutput,
    setXFrameOptionsMode: XFrameOptionsMode => HtmlOutput
  ): HtmlOutput = {
    val __obj = js.Dynamic.literal(addMetaTag = js.Any.fromFunction2(addMetaTag), append = js.Any.fromFunction1(append), appendUntrusted = js.Any.fromFunction1(appendUntrusted), asTemplate = js.Any.fromFunction0(asTemplate), clear = js.Any.fromFunction0(clear), getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getContent = js.Any.fromFunction0(getContent), getFaviconUrl = js.Any.fromFunction0(getFaviconUrl), getHeight = js.Any.fromFunction0(getHeight), getMetaTags = js.Any.fromFunction0(getMetaTags), getTitle = js.Any.fromFunction0(getTitle), getWidth = js.Any.fromFunction0(getWidth), setContent = js.Any.fromFunction1(setContent), setFaviconUrl = js.Any.fromFunction1(setFaviconUrl), setHeight = js.Any.fromFunction1(setHeight), setSandboxMode = js.Any.fromFunction1(setSandboxMode), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth), setXFrameOptionsMode = js.Any.fromFunction1(setXFrameOptionsMode))
    __obj.asInstanceOf[HtmlOutput]
  }
  @scala.inline
  implicit class HtmlOutputOps[Self <: HtmlOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddMetaTag(value: (String, String) => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addMetaTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppend(value: String => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendUntrusted(value: String => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendUntrusted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsTemplate(value: () => HtmlTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClear(value: () => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAs(value: String => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetBlob(value: () => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFaviconUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFaviconUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHeight(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMetaTags(value: () => js.Array[HtmlOutputMetaTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetaTags")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFaviconUrl(value: String => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFaviconUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHeight(value: Integer => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSandboxMode(value: SandboxMode => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSandboxMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWidth(value: Integer => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXFrameOptionsMode(value: XFrameOptionsMode => HtmlOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXFrameOptionsMode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

