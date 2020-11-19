package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new curve set.
  * @param [curveKeys] - An array of arrays of keys (pairs of numbers with
  * the time first and value second).
  */
@JSImport("playcanvas", "CurveSet")
@js.native
class CurveSet ()
  extends typingsSlinky.playcanvas.pc.CurveSet {
  def this(curveKeys: js.Array[js.Array[Double]]) = this()
}
