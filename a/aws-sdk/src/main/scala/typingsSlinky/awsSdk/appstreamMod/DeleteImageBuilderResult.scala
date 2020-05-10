package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ImageBuilder] = js.native
}

object DeleteImageBuilderResult {
  @scala.inline
  def apply(): DeleteImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageBuilderResult]
  }
  @scala.inline
  implicit class DeleteImageBuilderResultOps[Self <: DeleteImageBuilderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageBuilder(value: ImageBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilder")(js.undefined)
        ret
    }
  }
  
}

