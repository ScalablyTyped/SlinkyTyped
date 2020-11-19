package typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification of general document events.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.DocumentHandler** with some smaller adaptations.
  */
@js.native
trait XDocumentHandler extends XInterface {
  
  /** receives notification of character data. */
  def characters(aChars: String): Unit = js.native
  
  /** receives notification of the end of a document. */
  def endDocument(): Unit = js.native
  
  /** receives notification of the end of an element. */
  def endElement(aName: String): Unit = js.native
  
  /** receives notification of white space that can be ignored. */
  def ignorableWhitespace(aWhitespaces: String): Unit = js.native
  
  /** receives notification of a processing instruction. */
  def processingInstruction(aTarget: String, aData: String): Unit = js.native
  
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): Unit = js.native
  
  /** receives notification of the beginning of a document. */
  def startDocument(): Unit = js.native
  
  /** receives notification of the beginning of an element . */
  def startElement(aName: String, xAttribs: XAttributeList): Unit = js.native
}
object XDocumentHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    characters: String => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit
  ): XDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
    __obj.asInstanceOf[XDocumentHandler]
  }
  
  @scala.inline
  implicit class XDocumentHandlerOps[Self <: XDocumentHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCharacters(value: String => Unit): Self = this.set("characters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndDocument(value: () => Unit): Self = this.set("endDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndElement(value: String => Unit): Self = this.set("endElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnorableWhitespace(value: String => Unit): Self = this.set("ignorableWhitespace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessingInstruction(value: (String, String) => Unit): Self = this.set("processingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDocumentLocator(value: XLocator => Unit): Self = this.set("setDocumentLocator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDocument(value: () => Unit): Self = this.set("startDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartElement(value: (String, XAttributeList) => Unit): Self = this.set("startElement", js.Any.fromFunction2(value))
  }
}
