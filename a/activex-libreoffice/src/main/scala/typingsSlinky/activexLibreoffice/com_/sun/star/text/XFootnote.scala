package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a footnote within a {@link Text} .
  * @see Footnote
  */
@js.native
trait XFootnote extends XTextContent {
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  var Label: String = js.native
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  def getLabel(): String = js.native
  /** sets the label of the footnote. */
  def setLabel(aLabel: String): Unit = js.native
}

object XFootnote {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    Label: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getLabel: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setLabel: String => Unit
  ): XFootnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getLabel = js.Any.fromFunction0(getLabel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[XFootnote]
  }
  @scala.inline
  implicit class XFootnoteOps[Self <: XFootnote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

