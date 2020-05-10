package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMLTransformResponse extends js.Object {
  /**
    * The unique identifier of the transform that was deleted.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object DeleteMLTransformResponse {
  @scala.inline
  def apply(): DeleteMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMLTransformResponse]
  }
  @scala.inline
  implicit class DeleteMLTransformResponseOps[Self <: DeleteMLTransformResponse] (val x: Self) extends AnyVal {
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

