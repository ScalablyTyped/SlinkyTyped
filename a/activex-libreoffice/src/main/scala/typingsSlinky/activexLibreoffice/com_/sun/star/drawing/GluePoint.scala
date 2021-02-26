package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link GluePoint} could be attached to a shape or to a page.
  *
  * If a {@link GluePoint} is attached to a shape, it is moved when the shape moves. The ends of connectors can be attached to {@link GluePoint} .
  * @deprecated Deprecated
  * @see GluePoint2
  */
@js.native
trait GluePoint extends StObject {
  
  /** The alignment of a `GluePoint` defines how the position of the point is affected by resizing the parent `Shape` . */
  var Alignment: Double = js.native
  
  /** This is the direction in which the connector line leaves the {@link GluePoint} . */
  var EscapeDirection: Double = js.native
  
  /** This is the position of this {@link GluePoint} . */
  var Position: Point = js.native
  
  /** If this is `TRUE` , then the position of this {@link GluePoint} is absolute on a page and is not relative to a shape. */
  var PositionAbsolute: Boolean = js.native
}
object GluePoint {
  
  @scala.inline
  def apply(Alignment: Double, EscapeDirection: Double, Position: Point, PositionAbsolute: Boolean): GluePoint = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], EscapeDirection = EscapeDirection.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionAbsolute = PositionAbsolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[GluePoint]
  }
  
  @scala.inline
  implicit class GluePointMutableBuilder[Self <: GluePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeDirection(value: Double): Self = StObject.set(x, "EscapeDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionAbsolute(value: Boolean): Self = StObject.set(x, "PositionAbsolute", value.asInstanceOf[js.Any])
  }
}
