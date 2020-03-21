package typingsSlinky.d3Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CurveFactory = /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsSlinky.d3Path.mod.Path_, 
    typingsSlinky.d3Shape.mod.CurveGenerator
  ]
  type CurveFactoryLineOnly = /**
    * Returns a "lines only" curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsSlinky.d3Path.mod.Path_, 
    typingsSlinky.d3Shape.mod.CurveGeneratorLineOnly
  ]
  type RadialArea_[Datum] = typingsSlinky.d3Shape.mod.AreaRadial_[Datum]
  type RadialLine_[Datum] = typingsSlinky.d3Shape.mod.LineRadial_[Datum]
  type RadialLink[This, LinkDatum, NodeDatum] = typingsSlinky.d3Shape.mod.LinkRadial_[This, LinkDatum, NodeDatum]
}
