package typingsSlinky.ace.global.AceAjax

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.ace.AceAjax.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new `Range` object with the given starting and ending row and column points.
  * @param startRow The starting row
  * @param startColumn The starting column
  * @param endRow The ending row
  * @param endColumn The ending column
  **/
@JSGlobal("AceAjax.Range")
@js.native
object Range
  extends Instantiable4[
      /* startRow */ Double, 
      /* startColumn */ Double, 
      /* endRow */ Double, 
      /* endColumn */ Double, 
      typingsSlinky.ace.AceAjax.Range
    ] {
  
  def fromPoints(pos1: Position, pos2: Position): typingsSlinky.ace.AceAjax.Range = js.native
}
