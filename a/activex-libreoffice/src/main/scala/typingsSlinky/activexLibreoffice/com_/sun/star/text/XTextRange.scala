package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the object's position in a text.
  *
  * It represents a text range. The beginning and end of the range may be identical.
  */
@js.native
trait XTextRange extends XInterface {
  /** @returns a text range which contains only the end of this text range. */
  val End: XTextRange = js.native
  /** @returns a text range which contains only the start of this text range. */
  val Start: XTextRange = js.native
  /** @returns the string that is included in this text range. */
  var String: java.lang.String = js.native
  /** @returns a text range which contains only the end of this text range. */
  def getEnd(): XTextRange = js.native
  /** @returns a text range which contains only the start of this text range. */
  def getStart(): XTextRange = js.native
  /** @returns the string that is included in this text range. */
  def getString(): String = js.native
  /** @returns the text interface in which the text position is contained. */
  def getText(): XText = js.native
  /**
    * the whole string of characters of this piece of text is replaced.
    *
    * All styles are removed when applying this method.
    */
  def setString(aString: String): Unit = js.native
}

object XTextRange {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XTextRange = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XTextRange]
  }
  @scala.inline
  implicit class XTextRangeOps[Self <: XTextRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: XTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("End")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: XTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEnd(value: () => XTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStart(value: () => XTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => XText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

