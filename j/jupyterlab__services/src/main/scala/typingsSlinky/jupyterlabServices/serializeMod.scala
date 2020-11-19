package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.messagesMod.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernel/serialize", JSImport.Namespace)
@js.native
object serializeMod extends js.Object {
  
  def deserialize(data: String): IMessage[MessageType] = js.native
  def deserialize(data: js.typedarray.ArrayBuffer): IMessage[MessageType] = js.native
  
  def serialize(msg: IMessage[MessageType]): String | js.typedarray.ArrayBuffer = js.native
}
