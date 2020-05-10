package typingsSlinky.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Position")
@js.native
class Position protected ()
  extends typingsSlinky.estree.mod.Position {
  def this(line: Double, col: Double) = this()
  def offset(n: Double): Position = js.native
}

