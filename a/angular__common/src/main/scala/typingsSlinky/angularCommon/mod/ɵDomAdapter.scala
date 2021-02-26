package typingsSlinky.angularCommon.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.History
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "\u0275DomAdapter")
@js.native
abstract class ɵDomAdapter () extends StObject {
  
  def createElement(tagName: js.Any): HTMLElement = js.native
  def createElement(tagName: js.Any, doc: js.Any): HTMLElement = js.native
  
  def createHtmlDocument(): HTMLDocument = js.native
  
  def dispatchEvent(el: js.Any, evt: js.Any): js.Any = js.native
  
  /** This is the ambient Location definition, NOT Location from @angular/common.  */
  def getBaseHref(doc: Document): String | Null = js.native
  
  def getCookie(name: String): String | Null = js.native
  
  def getDefaultDocument(): Document = js.native
  
  def getGlobalEventTarget(doc: Document, target: String): js.Any = js.native
  
  def getHistory(): History = js.native
  
  def getLocation(): js.Any = js.native
  
  def getProperty(el: Element, name: String): js.Any = js.native
  
  def getUserAgent(): String = js.native
  
  def isElementNode(node: js.Any): Boolean = js.native
  
  def isShadowRoot(node: js.Any): Boolean = js.native
  
  def log(error: js.Any): js.Any = js.native
  
  def logGroup(error: js.Any): js.Any = js.native
  
  def logGroupEnd(): js.Any = js.native
  
  def onAndCancel(el: js.Any, evt: js.Any, listener: js.Any): js.Function = js.native
  
  def performanceNow(): Double = js.native
  
  def remove(el: js.Any): Node = js.native
  
  def resetBaseElement(): Unit = js.native
  
  def supportsCookies(): Boolean = js.native
  
  def supportsDOMEvents(): Boolean = js.native
}
