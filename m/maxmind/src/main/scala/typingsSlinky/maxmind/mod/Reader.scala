package typingsSlinky.maxmind.mod

import typingsSlinky.maxmind.responseMod.Response
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: Response */] protected ()
  extends typingsSlinky.maxmind.readerMod.default[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
}

