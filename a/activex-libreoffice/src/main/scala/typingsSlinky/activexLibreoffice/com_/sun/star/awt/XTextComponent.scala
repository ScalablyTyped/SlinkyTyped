package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text of a component and makes it possible to register event listeners. */
@js.native
trait XTextComponent extends XInterface {
  /** returns the currently set maximum text length. */
  var MaxTextLen: Double = js.native
  /** returns the currently selected text. */
  val SelectedText: String = js.native
  /** returns the current user selection. */
  var Selection: typingsSlinky.activexLibreoffice.com_.sun.star.awt.Selection = js.native
  /** returns the text of the component. */
  var Text: String = js.native
  /** registers a text event listener. */
  def addTextListener(l: XTextListener): Unit = js.native
  /** returns the currently set maximum text length. */
  def getMaxTextLen(): Double = js.native
  /** returns the currently selected text. */
  def getSelectedText(): String = js.native
  /** returns the current user selection. */
  def getSelection(): Selection = js.native
  /** returns the text of the component. */
  def getText(): String = js.native
  /** inserts text at the specified position. */
  def insertText(Sel: Selection, Text: String): Unit = js.native
  /** returns if the text is editable by the user. */
  def isEditable(): Boolean = js.native
  /** unregisters a text event listener. */
  def removeTextListener(l: XTextListener): Unit = js.native
  /** makes the text editable for the user or read-only. */
  def setEditable(bEditable: Boolean): Unit = js.native
  /** sets the maximum text length. */
  def setMaxTextLen(nLen: Double): Unit = js.native
  /** sets the user selection. */
  def setSelection(aSelection: Selection): Unit = js.native
  /** sets the text of the component. */
  def setText(aText: String): Unit = js.native
}

object XTextComponent {
  @scala.inline
  def apply(
    MaxTextLen: Double,
    SelectedText: String,
    Selection: Selection,
    Text: String,
    acquire: () => Unit,
    addTextListener: XTextListener => Unit,
    getMaxTextLen: () => Double,
    getSelectedText: () => String,
    getSelection: () => Selection,
    getText: () => String,
    insertText: (Selection, String) => Unit,
    isEditable: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextListener: XTextListener => Unit,
    setEditable: Boolean => Unit,
    setMaxTextLen: Double => Unit,
    setSelection: Selection => Unit,
    setText: String => Unit
  ): XTextComponent = {
    val __obj = js.Dynamic.literal(MaxTextLen = MaxTextLen.asInstanceOf[js.Any], SelectedText = SelectedText.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTextListener = js.Any.fromFunction1(addTextListener), getMaxTextLen = js.Any.fromFunction0(getMaxTextLen), getSelectedText = js.Any.fromFunction0(getSelectedText), getSelection = js.Any.fromFunction0(getSelection), getText = js.Any.fromFunction0(getText), insertText = js.Any.fromFunction2(insertText), isEditable = js.Any.fromFunction0(isEditable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextListener = js.Any.fromFunction1(removeTextListener), setEditable = js.Any.fromFunction1(setEditable), setMaxTextLen = js.Any.fromFunction1(setMaxTextLen), setSelection = js.Any.fromFunction1(setSelection), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XTextComponent]
  }
  @scala.inline
  implicit class XTextComponentOps[Self <: XTextComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxTextLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxTextLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddTextListener(value: XTextListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTextListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMaxTextLen(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxTextLen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: () => Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertText(value: (Selection, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsEditable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEditable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveTextListener(value: XTextListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTextListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEditable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEditable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaxTextLen(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxTextLen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelection(value: Selection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

