package typingsSlinky.mmdbLib.mod

import typingsSlinky.mmdbLib.responseMod.Response
import typingsSlinky.mmdbLib.typesMod.ReaderOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mmdb-lib", JSImport.Default)
@js.native
class default[T /* <: Response */] protected () extends Reader[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: ReaderOptions) = this()
}
