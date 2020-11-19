package typingsSlinky.jestSerializer

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("v8", JSImport.Namespace)
@js.native
object v8Mod extends js.Object {
  
  def deserialize(value: Buffer): js.Any = js.native
  
  def serialize(value: js.Any): Buffer = js.native
}
