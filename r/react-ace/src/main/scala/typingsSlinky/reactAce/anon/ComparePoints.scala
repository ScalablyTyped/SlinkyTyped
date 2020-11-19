package typingsSlinky.reactAce.anon

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.aceBuilds.mod.Ace.Point
import typingsSlinky.aceBuilds.mod.Ace.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComparePoints extends Instantiable4[
      /* startRow */ Double, 
      /* startColumn */ Double, 
      /* endRow */ Double, 
      /* endColumn */ Double, 
      Range
    ] {
  
  def comparePoints(p1: Point, p2: Point): Double = js.native
  
  def fromPoints(start: Point, end: Point): Range = js.native
}
