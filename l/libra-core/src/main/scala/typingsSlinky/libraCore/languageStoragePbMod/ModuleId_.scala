package typingsSlinky.libraCore.languageStoragePbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/language_storage_pb", "ModuleId")
@js.native
class ModuleId_ () extends Message {
  def getAddress(): js.typedarray.Uint8Array | String = js.native
  def getAddress_asB64(): String = js.native
  def getAddress_asU8(): js.typedarray.Uint8Array = js.native
  def getName(): String = js.native
  def setAddress(value: String): Unit = js.native
  def setAddress(value: js.typedarray.Uint8Array): Unit = js.native
  def setName(value: String): Unit = js.native
}

