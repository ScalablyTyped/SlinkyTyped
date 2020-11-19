package typingsSlinky.blueprintjsTable

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table/lib/esm/common/rect", JSImport.Namespace)
@js.native
object rectMod extends js.Object {
  
  @js.native
  class Rect protected () extends js.Object {
    def this(left: Double, top: Double, width: Double, height: Double) = this()
    
    def containsX(clientX: Double): Boolean = js.native
    
    def containsY(clientY: Double): Boolean = js.native
    
    def equals(rect: Rect): Boolean = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    def sizeStyle(): CSSProperties = js.native
    
    def style(): CSSProperties = js.native
    
    def subtractOrigin(anyRect: AnyRect): Rect = js.native
    
    var top: Double = js.native
    
    def union(anyRect: AnyRect): Rect = js.native
    
    var width: Double = js.native
  }
  /* static members */
  @js.native
  object Rect extends js.Object {
    
    var ORIGIN: Rect = js.native
    
    /**
      * Returns the CSS properties representing the absolute positioning of
      * this Rect.
      */
    def style(rect: AnyRect): CSSProperties = js.native
    
    /**
      * Returns a new Rect that subtracts the origin of the second argument
      * from the first.
      */
    def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): Rect = js.native
    
    /**
      * Returns the smallest Rect that entirely contains the supplied rects
      */
    def union(anyRect0: AnyRect, anyRect1: AnyRect): Rect = js.native
    
    /**
      * Given a ClientRect or Rect object, returns a Rect object.
      */
    def wrap(rect: AnyRect): Rect = js.native
  }
  
  type AnyRect = Rect | ClientRect
}
