package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text and formatting of a fixed hyperlink field. */
@js.native
trait XFixedHyperlink extends XInterface {
  /** returns the alignment of the text in the control. */
  var Alignment: Double = js.native
  /** returns the text of the control. */
  var Text: String = js.native
  /** returns the url of the control. */
  var URL: String = js.native
  /** registers an event handler for click action event. */
  def addActionListener(l: XActionListener): Unit = js.native
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double = js.native
  /** returns the text of the control. */
  def getText(): String = js.native
  /** returns the url of the control. */
  def getURL(): String = js.native
  /** unregisters an event handler for click action event. */
  def removeActionListener(l: XActionListener): Unit = js.native
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit = js.native
  /** sets the text of the control. */
  def setText(Text: String): Unit = js.native
  /** sets the url of the control. */
  def setURL(URL: String): Unit = js.native
}

object XFixedHyperlink {
  @scala.inline
  def apply(
    Alignment: Double,
    Text: String,
    URL: String,
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    getAlignment: () => Double,
    getText: () => String,
    getURL: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setAlignment: Double => Unit,
    setText: String => Unit,
    setURL: String => Unit
  ): XFixedHyperlink = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), getAlignment = js.Any.fromFunction0(getAlignment), getText = js.Any.fromFunction0(getText), getURL = js.Any.fromFunction0(getURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setAlignment = js.Any.fromFunction1(setAlignment), setText = js.Any.fromFunction1(setText), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[XFixedHyperlink]
  }
  @scala.inline
  implicit class XFixedHyperlinkOps[Self <: XFixedHyperlink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddActionListener(value: XActionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addActionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAlignment(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetURL(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getURL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveActionListener(value: XActionListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeActionListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAlignment(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlignment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetURL(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setURL")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

