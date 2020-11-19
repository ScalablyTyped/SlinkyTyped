package typingsSlinky.libraCore.proofPbMod

import typingsSlinky.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
@js.native
class SparseMerkleProof_ () extends Message {
  
  def addNonDefaultSiblings(value: String): js.typedarray.Uint8Array | String = js.native
  def addNonDefaultSiblings(value: String, index: Double): js.typedarray.Uint8Array | String = js.native
  def addNonDefaultSiblings(value: js.typedarray.Uint8Array): js.typedarray.Uint8Array | String = js.native
  def addNonDefaultSiblings(value: js.typedarray.Uint8Array, index: Double): js.typedarray.Uint8Array | String = js.native
  
  def clearNonDefaultSiblingsList(): Unit = js.native
  
  def getBitmap(): js.typedarray.Uint8Array | String = js.native
  
  def getBitmap_asB64(): String = js.native
  
  def getBitmap_asU8(): js.typedarray.Uint8Array = js.native
  
  def getLeaf(): js.typedarray.Uint8Array | String = js.native
  
  def getLeaf_asB64(): String = js.native
  
  def getLeaf_asU8(): js.typedarray.Uint8Array = js.native
  
  def getNonDefaultSiblingsList(): js.Array[js.typedarray.Uint8Array | String] = js.native
  
  def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
  
  def getNonDefaultSiblingsList_asU8(): js.Array[js.typedarray.Uint8Array] = js.native
  
  def setBitmap(value: String): Unit = js.native
  def setBitmap(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setLeaf(value: String): Unit = js.native
  def setLeaf(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Unit = js.native
}
