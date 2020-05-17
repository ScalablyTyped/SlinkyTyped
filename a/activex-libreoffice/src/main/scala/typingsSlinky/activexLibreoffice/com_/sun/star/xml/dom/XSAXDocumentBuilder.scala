package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds a new dom tree */
@js.native
trait XSAXDocumentBuilder extends XInterface {
  val Document: XDocument = js.native
  val DocumentFragment: XDocumentFragment = js.native
  val State: SAXDocumentBuilderState = js.native
  def endDocumentFragment(): Unit = js.native
  def getDocument(): XDocument = js.native
  def getDocumentFragment(): XDocumentFragment = js.native
  def getState(): SAXDocumentBuilderState = js.native
  def reset(): Unit = js.native
  def startDocumentFragment(ownerDoc: XDocument): Unit = js.native
}

object XSAXDocumentBuilder {
  @scala.inline
  def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: () => Unit,
    endDocumentFragment: () => Unit,
    getDocument: () => XDocument,
    getDocumentFragment: () => XDocumentFragment,
    getState: () => SAXDocumentBuilderState,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reset: () => Unit,
    startDocumentFragment: XDocument => Unit
  ): XSAXDocumentBuilder = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], DocumentFragment = DocumentFragment.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), endDocumentFragment = js.Any.fromFunction0(endDocumentFragment), getDocument = js.Any.fromFunction0(getDocument), getDocumentFragment = js.Any.fromFunction0(getDocumentFragment), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), startDocumentFragment = js.Any.fromFunction1(startDocumentFragment))
    __obj.asInstanceOf[XSAXDocumentBuilder]
  }
  @scala.inline
  implicit class XSAXDocumentBuilderOps[Self <: XSAXDocumentBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentFragment(value: XDocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: SAXDocumentBuilderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDocumentFragment(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDocumentFragment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDocument(value: () => XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDocumentFragment(value: () => XDocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentFragment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => SAXDocumentBuilderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartDocumentFragment(value: XDocument => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDocumentFragment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

