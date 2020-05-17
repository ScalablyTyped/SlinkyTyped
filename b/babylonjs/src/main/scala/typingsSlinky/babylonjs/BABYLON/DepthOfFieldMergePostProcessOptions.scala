package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.CircleOfConfusion
import typingsSlinky.babylonjs.anon.Weight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthOfFieldMergePostProcessOptions extends js.Object {
  /**
    * Parameters to perform the merge of bloom effect
    */
  var bloom: js.UndefOr[Weight] = js.native
  /**
    * Parameters to perform the merge of the depth of field effect
    */
  var depthOfField: js.UndefOr[CircleOfConfusion] = js.native
  /**
    * The original image to merge on top of
    */
  var originalFromInput: PostProcess = js.native
}

object DepthOfFieldMergePostProcessOptions {
  @scala.inline
  def apply(originalFromInput: PostProcess): DepthOfFieldMergePostProcessOptions = {
    val __obj = js.Dynamic.literal(originalFromInput = originalFromInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthOfFieldMergePostProcessOptions]
  }
  @scala.inline
  implicit class DepthOfFieldMergePostProcessOptionsOps[Self <: DepthOfFieldMergePostProcessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalFromInput(value: PostProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFromInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBloom(value: Weight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bloom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBloom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bloom")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthOfField(value: CircleOfConfusion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthOfField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthOfField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthOfField")(js.undefined)
        ret
    }
  }
  
}

