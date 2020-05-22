package typingsSlinky.libraCore.proofPbMod.SparseMerkleProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var bitmap: js.typedarray.Uint8Array | String
  var leaf: js.typedarray.Uint8Array | String
  var nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(
    bitmap: js.typedarray.Uint8Array | String,
    leaf: js.typedarray.Uint8Array | String,
    nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

