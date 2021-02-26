package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDOMNode extends StObject {
  
  @JSName("MSHTML.IHTMLDOMNode_typekey")
  var MSHTMLDotIHTMLDOMNode_typekey: IHTMLDOMNode = js.native
  
  def appendChild(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  val attributes: js.Any = js.native
  
  val childNodes: js.Any = js.native
  
  def cloneNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  val firstChild: IHTMLDOMNode = js.native
  
  def hasChildNodes(): Boolean = js.native
  
  def insertBefore(newChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  def insertBefore(newChild: IHTMLDOMNode, refChild: js.Any): IHTMLDOMNode = js.native
  
  val lastChild: IHTMLDOMNode = js.native
  
  val nextSibling: IHTMLDOMNode = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  var nodeValue: js.Any = js.native
  
  val parentNode: IHTMLDOMNode = js.native
  
  val previousSibling: IHTMLDOMNode = js.native
  
  def removeChild(oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  /** @param fDeep [fDeep=false] */
  def removeNode(): IHTMLDOMNode = js.native
  def removeNode(fDeep: Boolean): IHTMLDOMNode = js.native
  
  def replaceChild(newChild: IHTMLDOMNode, oldChild: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def replaceNode(replacement: IHTMLDOMNode): IHTMLDOMNode = js.native
  
  def swapNode(otherNode: IHTMLDOMNode): IHTMLDOMNode = js.native
}
