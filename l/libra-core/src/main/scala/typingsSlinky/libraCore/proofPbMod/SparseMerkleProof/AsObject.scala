package typingsSlinky.libraCore.proofPbMod.SparseMerkleProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitmapUint8Array(value: js.typedarray.Uint8Array): Self = this.set("bitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitmap(value: js.typedarray.Uint8Array | String): Self = this.set("bitmap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafUint8Array(value: js.typedarray.Uint8Array): Self = this.set("leaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaf(value: js.typedarray.Uint8Array | String): Self = this.set("leaf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonDefaultSiblingsListVarargs(value: (js.typedarray.Uint8Array | String)*): Self = this.set("nonDefaultSiblingsList", js.Array(value :_*))
    
    @scala.inline
    def setNonDefaultSiblingsList(value: js.Array[js.typedarray.Uint8Array | String]): Self = this.set("nonDefaultSiblingsList", value.asInstanceOf[js.Any])
  }
}
