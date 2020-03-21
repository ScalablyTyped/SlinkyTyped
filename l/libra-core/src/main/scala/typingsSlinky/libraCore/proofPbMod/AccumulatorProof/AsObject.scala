package typingsSlinky.libraCore.proofPbMod.AccumulatorProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var bitmap: String
  var nonDefaultSiblingsList: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(bitmap: String, nonDefaultSiblingsList: js.Array[scala.scalajs.js.typedarray.Uint8Array | String]): AsObject = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

