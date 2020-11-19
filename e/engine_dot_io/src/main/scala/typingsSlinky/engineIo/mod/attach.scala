package typingsSlinky.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("engine.io", "attach")
@js.native
object attach extends js.Object {
  
  def apply(http: typingsSlinky.node.netMod.Server): Server = js.native
  def apply(http: typingsSlinky.node.netMod.Server, opts: ServerAttachOptions): Server = js.native
}
