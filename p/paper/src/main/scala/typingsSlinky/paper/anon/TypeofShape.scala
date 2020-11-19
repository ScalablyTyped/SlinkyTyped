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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofShape extends js.Object {
  
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Shape.Circle] = js.native
  
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Shape.Ellipse] = js.native
  
  var Rectangle: Instantiable2[
    /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
    /* radius */ js.UndefOr[Size], 
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
      /* radius */ js.UndefOr[Size], 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCircle(value: Instantiable2[/* center */ Point, /* radius */ Double, Circle]): Self = this.set("Circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipse(value: Instantiable1[/* rectangle */ Rectangle, Ellipse]): Self = this.set("Ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangle(
      value: Instantiable2[
          /* rectangle */ Rectangle, 
          /* radius */ js.UndefOr[Size], 
          typingsSlinky.paper.paper.Shape.Rectangle
        ]
    ): Self = this.set("Rectangle", value.asInstanceOf[js.Any])
  }
}
