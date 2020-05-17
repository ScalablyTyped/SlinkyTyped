package typingsSlinky.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait basicWriter extends js.Object {
  def attribute(attName: String, attValue: String): Unit = js.native
  def closeTag(tagName: String): Unit = js.native
  def comment(comment: String): Unit = js.native
  def getHtml(reset: Boolean): String = js.native
  def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
  def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def text(text: String): Unit = js.native
  def write(data: String): Unit = js.native
}

object basicWriter {
  @scala.inline
  def apply(
    attribute: (String, String) => Unit,
    closeTag: String => Unit,
    comment: String => Unit,
    getHtml: Boolean => String,
    openTag: (String, StringDictionary[String]) => Unit,
    openTagClose: (String, Boolean) => Unit,
    reset: () => Unit,
    text: String => Unit,
    write: String => Unit
  ): basicWriter = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), closeTag = js.Any.fromFunction1(closeTag), comment = js.Any.fromFunction1(comment), getHtml = js.Any.fromFunction1(getHtml), openTag = js.Any.fromFunction2(openTag), openTagClose = js.Any.fromFunction2(openTagClose), reset = js.Any.fromFunction0(reset), text = js.Any.fromFunction1(text), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[basicWriter]
  }
  @scala.inline
  implicit class basicWriterOps[Self <: basicWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCloseTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComment(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHtml(value: Boolean => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenTag(value: (String, StringDictionary[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpenTagClose(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTagClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

