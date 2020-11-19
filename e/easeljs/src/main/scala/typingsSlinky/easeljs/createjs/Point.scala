package typingsSlinky.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  def copy(point: Point): Point = js.native
  
  def setValues(): Point = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: Double): Point = js.native
  def setValues(x: Double): Point = js.native
  def setValues(x: Double, y: Double): Point = js.native
  
  // properties
  var x: Double = js.native
  
  var y: Double = js.native
}
