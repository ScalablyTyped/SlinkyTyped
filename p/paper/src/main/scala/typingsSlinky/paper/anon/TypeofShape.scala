package typingsSlinky.paper.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.paper.paper.Point
import typingsSlinky.paper.paper.Rectangle
import typingsSlinky.paper.paper.Shape.Circle
import typingsSlinky.paper.paper.Shape.Ellipse
import typingsSlinky.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofShape extends js.Object {
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Shape.Circle]
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Shape.Ellipse]
  var Rectangle: Instantiable2[
    /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typingsSlinky.paper.paper.Shape.Rectangle
  ]
}

object TypeofShape {
  @scala.inline
  def apply(
    Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
    Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
    Rectangle: Instantiable2[
      /* rectangle */ Rectangle, 
      js.UndefOr[/* radius */ Size], 
      typingsSlinky.paper.paper.Shape.Rectangle
    ]
  ): TypeofShape = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofShape]
  }
}

