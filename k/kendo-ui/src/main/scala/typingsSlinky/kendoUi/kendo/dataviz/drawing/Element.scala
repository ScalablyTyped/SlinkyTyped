package typingsSlinky.kendoUi.kendo.dataviz.drawing

import typingsSlinky.kendoUi.kendo.Class
import typingsSlinky.kendoUi.kendo.geometry.Point
import typingsSlinky.kendoUi.kendo.geometry.Transformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends Class {
  
  def bbox(): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  
  def clip(): typingsSlinky.kendoUi.kendo.drawing.Path = js.native
  def clip(clip: typingsSlinky.kendoUi.kendo.drawing.Path): Unit = js.native
  
  def clippedBBox(): typingsSlinky.kendoUi.kendo.geometry.Rect = js.native
  
  def containsPoint(point: Point): Boolean = js.native
  
  def opacity(): Double = js.native
  def opacity(opacity: Double): Unit = js.native
  
  var options: ElementOptions = js.native
  
  var parent: typingsSlinky.kendoUi.kendo.drawing.Group = js.native
  
  def transform(): Transformation = js.native
  def transform(transform: Transformation): Unit = js.native
  
  def visible(): Boolean = js.native
  def visible(visible: Boolean): Unit = js.native
}
