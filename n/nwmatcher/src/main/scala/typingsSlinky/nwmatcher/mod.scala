package typingsSlinky.nwmatcher

import org.scalajs.dom.raw.Element
import typingsSlinky.nwmatcher.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nwmatcher", JSImport.Namespace)
  @js.native
  def apply(global: Document): Matcher = js.native
  
  object global {
    
    object NW {
      
      @JSGlobal("NW.Dom")
      @js.native
      val Dom: Matcher = js.native
    }
  }
  
  @js.native
  trait Matcher extends StObject {
    
    def byClass(className: String): js.Array[Element] = js.native
    def byClass(className: String, from: Element): js.Array[Element] = js.native
    
    // DOM Helpers
    def byId(id: String): Element | Null = js.native
    def byId(id: String, from: Element): Element | Null = js.native
    
    def byName(name: String): js.Array[Element] = js.native
    def byName(name: String, from: Element): js.Array[Element] = js.native
    
    def byTag(tag: String): js.Array[Element] = js.native
    def byTag(tag: String, from: Element): js.Array[Element] = js.native
    
    // DOM Selection
    def first(selector: String): Element | Null = js.native
    def first(selector: String, context: Element): Element | Null = js.native
    
    def getAttribute(element: Element, attribute: String): js.UndefOr[String] = js.native
    
    def hasAttribute(element: Element, attribute: String): Boolean = js.native
    
    def `match`(element: Element, selector: String): Boolean = js.native
    def `match`(element: Element, selector: String, context: Element): Boolean = js.native
    
    def select(selector: String): js.Array[Element] = js.native
    def select(
      selector: String,
      context: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* element */ Element, Unit]
    ): js.Array[Element] = js.native
    def select(selector: String, context: Element): js.Array[Element] = js.native
    def select(selector: String, context: Element, callback: js.Function1[/* element */ Element, Unit]): js.Array[Element] = js.native
  }
}
