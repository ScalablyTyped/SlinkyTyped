package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.messagesMod.IMessage
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/serialize", "deserialize")
  @js.native
  def deserialize(data: String): IMessage[MessageType] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/serialize", "deserialize")
  @js.native
  def deserialize(data: js.typedarray.ArrayBuffer): IMessage[MessageType] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/serialize", "serialize")
  @js.native
  def serialize(msg: IMessage[MessageType]): String | js.typedarray.ArrayBuffer = js.native
}
