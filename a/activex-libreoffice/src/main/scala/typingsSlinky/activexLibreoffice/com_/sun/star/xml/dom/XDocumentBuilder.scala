package typingsSlinky.activexLibreoffice.com_.sun.star.xml.dom

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.XEntityResolver
import typingsSlinky.activexLibreoffice.com_.sun.star.xml.sax.XErrorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds a new dom tree */
@js.native
trait XDocumentBuilder extends XInterface {
  
  /** Obtain an instance of a DOMImplementation object. */
  val DOMImplementation: XDOMImplementation = js.native
  
  /** Obtain an instance of a DOMImplementation object. */
  def getDOMImplementation(): XDOMImplementation = js.native
  
  /** Indicates whether or not this parser is configured to understand namespaces. */
  def isNamespaceAware(): Boolean = js.native
  
  /** Indicates whether or not this parser is configured to validate XML documents. */
  def isValidating(): Boolean = js.native
  
  /** Obtain a new instance of a DOM Document object to build a DOM tree with. */
  def newDocument(): XDocument = js.native
  
  /** Parse the content of the given InputStream as an XML document and return a new DOM Document object. */
  def parse(is: XInputStream): XDocument = js.native
  
  /** Parse the content of the given URI as an XML document and return a new DOM Document object. */
  def parseURI(uri: String): XDocument = js.native
  
  /** Specify the EntityResolver to be used to resolve entities present in the XML document to be parsed. */
  def setEntityResolver(er: XEntityResolver): Unit = js.native
  
  /** Specify the ErrorHandler to be used to report errors present in the XML document to be parsed. */
  def setErrorHandler(eh: XErrorHandler): Unit = js.native
}
object XDocumentBuilder {
  
  @scala.inline
  def apply(
    DOMImplementation: XDOMImplementation,
    acquire: () => Unit,
    getDOMImplementation: () => XDOMImplementation,
    isNamespaceAware: () => Boolean,
    isValidating: () => Boolean,
    newDocument: () => XDocument,
    parse: XInputStream => XDocument,
    parseURI: String => XDocument,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEntityResolver: XEntityResolver => Unit,
    setErrorHandler: XErrorHandler => Unit
  ): XDocumentBuilder = {
    val __obj = js.Dynamic.literal(DOMImplementation = DOMImplementation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDOMImplementation = js.Any.fromFunction0(getDOMImplementation), isNamespaceAware = js.Any.fromFunction0(isNamespaceAware), isValidating = js.Any.fromFunction0(isValidating), newDocument = js.Any.fromFunction0(newDocument), parse = js.Any.fromFunction1(parse), parseURI = js.Any.fromFunction1(parseURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEntityResolver = js.Any.fromFunction1(setEntityResolver), setErrorHandler = js.Any.fromFunction1(setErrorHandler))
    __obj.asInstanceOf[XDocumentBuilder]
  }
  
  @scala.inline
  implicit class XDocumentBuilderMutableBuilder[Self <: XDocumentBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDOMImplementation(value: XDOMImplementation): Self = StObject.set(x, "DOMImplementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDOMImplementation(value: () => XDOMImplementation): Self = StObject.set(x, "getDOMImplementation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNamespaceAware(value: () => Boolean): Self = StObject.set(x, "isNamespaceAware", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidating(value: () => Boolean): Self = StObject.set(x, "isValidating", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDocument(value: () => XDocument): Self = StObject.set(x, "newDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParse(value: XInputStream => XDocument): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseURI(value: String => XDocument): Self = StObject.set(x, "parseURI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEntityResolver(value: XEntityResolver => Unit): Self = StObject.set(x, "setEntityResolver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetErrorHandler(value: XErrorHandler => Unit): Self = StObject.set(x, "setErrorHandler", js.Any.fromFunction1(value))
  }
}
