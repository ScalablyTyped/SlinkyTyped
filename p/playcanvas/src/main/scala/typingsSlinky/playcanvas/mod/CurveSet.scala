package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new curve set.
  * @example
  * var curveSet = new pc.CurveSet([
  *     [
  *         [0, 0],
  *         [0.33, 2],
  *         [0.66, 2.6],
  *         [1, 3]
  *     ],
  *     [
  *         [0, 34],
  *         [0.33, 35],
  *         [0.66, 36],
  *         [1, 37]
  *     ]
  * ]);
  * @param [curveKeys] - An array of arrays of keys (pairs of numbers with
  * the time first and value second).
  */
@JSImport("playcanvas", "CurveSet")
@js.native
class CurveSet ()
  extends typingsSlinky.playcanvas.pc.CurveSet {
  def this(curveKeys: js.Array[js.Array[Double]]) = this()
}
