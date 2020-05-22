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

trait TypeofPath extends js.Object {
  var Arc: Instantiable3[
    /* from */ Point, 
    /* through */ Point, 
    /* to */ Point, 
    typingsSlinky.paper.paper.Path.Arc
  ]
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Path.Circle]
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Path.Ellipse]
  var Line: Instantiable2[/* from */ Point, /* to */ Point, typingsSlinky.paper.paper.Path.Line]
  var Rectangle: Instantiable2[
    /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typingsSlinky.paper.paper.Path.Rectangle
  ]
  var RegularPolygon: Instantiable3[
    /* center */ Point, 
    /* sides */ Double, 
    /* radius */ Double, 
    typingsSlinky.paper.paper.Path.RegularPolygon
  ]
  var Star: Instantiable4[
    /* center */ Point, 
    /* points */ Double, 
    /* radius1 */ Double, 
    /* radius2 */ Double, 
    typingsSlinky.paper.paper.Path.Star
  ]
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
}

