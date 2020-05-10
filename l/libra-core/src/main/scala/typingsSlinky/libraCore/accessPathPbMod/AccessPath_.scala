package typingsSlinky.libraCore.accessPathPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
@js.native
class AccessPath_ () extends Message {
  def getAddress(): js.typedarray.Uint8Array | String = js.native
  def getAddress_asB64(): String = js.native
  def getAddress_asU8(): js.typedarray.Uint8Array = js.native
  def getPath(): js.typedarray.Uint8Array | String = js.native
  def getPath_asB64(): String = js.native
  def getPath_asU8(): js.typedarray.Uint8Array = js.native
  def setAddress(value: String): Unit = js.native
  def setAddress(value: js.typedarray.Uint8Array): Unit = js.native
  def setPath(value: String): Unit = js.native
  def setPath(value: js.typedarray.Uint8Array): Unit = js.native
}

