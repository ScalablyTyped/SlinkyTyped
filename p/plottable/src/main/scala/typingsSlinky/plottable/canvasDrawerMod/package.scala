package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object canvasDrawerMod {
  type CanvasDrawStep = js.Function3[
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ typingsSlinky.plottable.interfacesMod.AttributeToAppliedProjector, 
    scala.Unit
  ]
}
