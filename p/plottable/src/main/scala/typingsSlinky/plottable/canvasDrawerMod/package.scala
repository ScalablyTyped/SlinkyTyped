package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object canvasDrawerMod {
  
  type CanvasDrawStep = js.Function3[
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ typingsSlinky.plottable.interfacesMod.AttributeToAppliedProjector, 
    scala.Unit
  ]
}
