package typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives notification of sax document events from a {@link XFastParser} */
@js.native
trait XFastDocumentHandler extends XFastContextHandler {
  /** called by the parser after the last XML element of a stream is processed. */
  def endDocument(): Unit = js.native
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): Unit = js.native
  /** called by the parser when parsing of an XML stream is started. */
  def startDocument(): Unit = js.native
}

object XFastDocumentHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    characters: String => Unit,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endDocument: () => Unit,
    endFastElement: Double => Unit,
    endUnknownElement: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: () => Unit,
    startFastElement: (Double, XFastAttributeList) => Unit,
    startUnknownElement: (String, String, XFastAttributeList) => Unit
  ): XFastDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endDocument = js.Any.fromFunction0(endDocument), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
    __obj.asInstanceOf[XFastDocumentHandler]
  }
  @scala.inline
  implicit class XFastDocumentHandlerOps[Self <: XFastDocumentHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDocument(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDocumentLocator(value: XLocator => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocumentLocator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartDocument(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDocument")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

