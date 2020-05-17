package typingsSlinky.paper.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.paper.paper.Path.Arc
import typingsSlinky.paper.paper.Path.Circle
import typingsSlinky.paper.paper.Path.Ellipse
import typingsSlinky.paper.paper.Path.Line
import typingsSlinky.paper.paper.Path.RegularPolygon
import typingsSlinky.paper.paper.Path.Star
import typingsSlinky.paper.paper.Point
import typingsSlinky.paper.paper.Rectangle
import typingsSlinky.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPath extends js.Object {
  var Arc: Instantiable3[
    /* from */ Point, 
    /* through */ Point, 
    /* to */ Point, 
    typingsSlinky.paper.paper.Path.Arc
  ] = js.native
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Path.Circle] = js.native
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Path.Ellipse] = js.native
  var Line: Instantiable2[/* from */ Point, /* to */ Point, typingsSlinky.paper.paper.Path.Line] = js.native
  var Rectangle: Instantiable2[
    /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typingsSlinky.paper.paper.Path.Rectangle
  ] = js.native
  var RegularPolygon: Instantiable3[
    /* center */ Point, 
    /* sides */ Double, 
    /* radius */ Double, 
    typingsSlinky.paper.paper.Path.RegularPolygon
  ] = js.native
  var Star: Instantiable4[
    /* center */ Point, 
    /* points */ Double, 
    /* radius1 */ Double, 
    /* radius2 */ Double, 
    typingsSlinky.paper.paper.Path.Star
  ] = js.native
}

object TypeofPath {
  @scala.inline
  def apply(
    Arc: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc],
    Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
    Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
    Line: Instantiable2[/* from */ Point, /* to */ Point, Line],
    Rectangle: Instantiable2[
      /* rectangle */ Rectangle, 
      js.UndefOr[/* radius */ Size], 
      typingsSlinky.paper.paper.Path.Rectangle
    ],
    RegularPolygon: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon],
    Star: Instantiable4[
      /* center */ Point, 
      /* points */ Double, 
      /* radius1 */ Double, 
      /* radius2 */ Double, 
      Star
    ]
  ): TypeofPath = {
    val __obj = js.Dynamic.literal(Arc = Arc.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], RegularPolygon = RegularPolygon.asInstanceOf[js.Any], Star = Star.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPath]
  }
  @scala.inline
  implicit class TypeofPathOps[Self <: TypeofPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArc(value: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arc")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withLine(value: Instantiable2[/* from */ Point, /* to */ Point, Line]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRectangle(
      value: Instantiable2[
          /* rectangle */ Rectangle, 
          js.UndefOr[/* radius */ Size], 
          typingsSlinky.paper.paper.Path.Rectangle
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegularPolygon(value: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegularPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStar(
      value: Instantiable4[
          /* center */ Point, 
          /* points */ Double, 
          /* radius1 */ Double, 
          /* radius2 */ Double, 
          Star
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Star")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

