package typingsSlinky.popperjsCore.typesMod

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import typingsSlinky.popperjsCore.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var Element: org.scalajs.dom.raw.Element = js.native
  
  var HTMLElement: org.scalajs.dom.raw.HTMLElement = js.native
  
  var Node: org.scalajs.dom.raw.Node = js.native
  
  var ShadowRoot: typingsSlinky.std.ShadowRoot = js.native
  
  def addEventListener(`type`: js.Any, listener: js.Any): Unit = js.native
  def addEventListener(`type`: js.Any, listener: js.Any, optionsOrUseCapture: js.Any): Unit = js.native
  
  var devicePixelRatio: Double = js.native
  
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: String): CSSStyleDeclaration = js.native
  @JSName("getComputedStyle")
  var getComputedStyle_Original: FnCall = js.native
  
  var innerHeight: Double = js.native
  
  var innerWidth: Double = js.native
  
  var offsetHeight: Double = js.native
  
  var offsetWidth: Double = js.native
  
  var pageXOffset: Double = js.native
  
  var pageYOffset: Double = js.native
  
  def removeEventListener(`type`: js.Any, listener: js.Any): Unit = js.native
  def removeEventListener(`type`: js.Any, listener: js.Any, optionsOrUseCapture: js.Any): Unit = js.native
  
  var visualViewport: js.UndefOr[VisualViewport] = js.native
}
