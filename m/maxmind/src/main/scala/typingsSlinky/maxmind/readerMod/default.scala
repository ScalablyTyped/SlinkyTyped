package typingsSlinky.maxmind.readerMod

import typingsSlinky.maxmind.mod.OpenOpts
import typingsSlinky.maxmind.responseMod.Response
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind/lib/reader", JSImport.Default)
@js.native
class default[T /* <: Response */] protected () extends Reader[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
}
