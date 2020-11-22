package typingsSlinky.maxmind.mod

import typingsSlinky.mmdbLib.responseMod.Response
import typingsSlinky.mmdbLib.typesMod.ReaderOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind", "Reader")
@js.native
class Reader[T /* <: Response */] protected ()
  extends typingsSlinky.mmdbLib.mod.default[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: ReaderOptions) = this()
}
