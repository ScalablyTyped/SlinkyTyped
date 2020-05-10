package typingsSlinky.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "SourceLocation")
@js.native
class SourceLocation protected ()
  extends typingsSlinky.estree.mod.SourceLocation {
  def this(p: Parser, start: Position, end: Position) = this()
}

