package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLTransformResponse extends js.Object {
  /**
    * The unique identifier for the transform that was updated.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object UpdateMLTransformResponse {
  @scala.inline
  def apply(): UpdateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMLTransformResponse]
  }
  @scala.inline
  implicit class UpdateMLTransformResponseOps[Self <: UpdateMLTransformResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformId(value: HashString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformId")(js.undefined)
        ret
    }
  }
  
}

