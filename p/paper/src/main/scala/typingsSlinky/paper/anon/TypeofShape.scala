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

@js.native
trait TypeofShape extends js.Object {
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Shape.Circle] = js.native
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Shape.Ellipse] = js.native
  var Rectangle: Instantiable2[
    /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typingsSlinky.paper.paper.Shape.Rectangle
  ] = js.native
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
  @scala.inline
  implicit class TypeofShapeOps[Self <: TypeofShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircle(value: Instantiable2[/* center */ Point, /* radius */ Double, Circle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipse(value: Instantiable1[/* rectangle */ Rectangle, Ellipse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(
      value: Instantiable2[
          /* rectangle */ Rectangle, 
          js.UndefOr[/* radius */ Size], 
          typingsSlinky.paper.paper.Shape.Rectangle
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

