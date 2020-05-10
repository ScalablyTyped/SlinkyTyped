package typingsSlinky.libraCore.proofPbMod.SparseMerkleProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var bitmap: js.typedarray.Uint8Array | String = js.native
  var leaf: js.typedarray.Uint8Array | String = js.native
  var nonDefaultSiblingsList: js.Array[js.typedarray.Uint8Array | String] = js.native
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
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitmapUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitmap(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeafUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeaf(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonDefaultSiblingsList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

