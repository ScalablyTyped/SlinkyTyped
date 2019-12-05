package typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod

import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
@js.native
class SparseMerkleProof_ () extends Message {
  def addNonDefaultSiblings(value: String): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def addNonDefaultSiblings(value: String, index: Double): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def addNonDefaultSiblings(value: Uint8Array): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def addNonDefaultSiblings(value: Uint8Array, index: Double): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def clearNonDefaultSiblingsList(): Unit = js.native
  def getBitmap(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getBitmap_asB64(): String = js.native
  def getBitmap_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getLeaf(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getLeaf_asB64(): String = js.native
  def getLeaf_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getNonDefaultSiblingsList(): js.Array[scala.scalajs.js.typedarray.Uint8Array | String] = js.native
  def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
  def getNonDefaultSiblingsList_asU8(): js.Array[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def setBitmap(value: String): Unit = js.native
  def setBitmap(value: Uint8Array): Unit = js.native
  def setLeaf(value: String): Unit = js.native
  def setLeaf(value: Uint8Array): Unit = js.native
  def setNonDefaultSiblingsList(value: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]): Unit = js.native
}

