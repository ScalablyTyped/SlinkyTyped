package typingsSlinky.libraCore.proofPbMod.SparseMerkleProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var bitmap: scala.scalajs.js.typedarray.Uint8Array | String
  var leaf: scala.scalajs.js.typedarray.Uint8Array | String
  var nonDefaultSiblingsList: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(
    bitmap: scala.scalajs.js.typedarray.Uint8Array | String,
    leaf: scala.scalajs.js.typedarray.Uint8Array | String,
    nonDefaultSiblingsList: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

