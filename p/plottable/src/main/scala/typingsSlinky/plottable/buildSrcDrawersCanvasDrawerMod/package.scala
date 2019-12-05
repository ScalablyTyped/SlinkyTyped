package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDrawersCanvasDrawerMod {
  import org.scalajs.dom.raw.CanvasRenderingContext2D
  import typingsSlinky.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector

  type CanvasDrawStep = js.Function3[
    /* context */ CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ AttributeToAppliedProjector, 
    Unit
  ]
}
