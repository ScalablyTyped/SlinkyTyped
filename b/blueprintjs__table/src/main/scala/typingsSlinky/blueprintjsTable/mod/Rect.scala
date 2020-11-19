package typingsSlinky.blueprintjsTable.mod

import typingsSlinky.blueprintjsTable.rectMod.AnyRect
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Rect")
@js.native
class Rect protected ()
  extends typingsSlinky.blueprintjsTable.commonMod.Rect {
  def this(left: Double, top: Double, width: Double, height: Double) = this()
}
/* static members */
@JSImport("@blueprintjs/table", "Rect")
@js.native
object Rect extends js.Object {
  
  var ORIGIN: typingsSlinky.blueprintjsTable.rectMod.Rect = js.native
  
  /**
    * Returns the CSS properties representing the absolute positioning of
    * this Rect.
    */
  def style(rect: AnyRect): CSSProperties = js.native
  
  /**
    * Returns a new Rect that subtracts the origin of the second argument
    * from the first.
    */
  def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typingsSlinky.blueprintjsTable.rectMod.Rect = js.native
  
  /**
    * Returns the smallest Rect that entirely contains the supplied rects
    */
  def union(anyRect0: AnyRect, anyRect1: AnyRect): typingsSlinky.blueprintjsTable.rectMod.Rect = js.native
  
  /**
    * Given a ClientRect or Rect object, returns a Rect object.
    */
  def wrap(rect: AnyRect): typingsSlinky.blueprintjsTable.rectMod.Rect = js.native
}
