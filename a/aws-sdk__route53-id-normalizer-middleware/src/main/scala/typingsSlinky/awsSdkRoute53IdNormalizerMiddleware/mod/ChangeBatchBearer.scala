package typingsSlinky.awsSdkRoute53IdNormalizerMiddleware.mod

import typingsSlinky.awsSdkRoute53IdNormalizerMiddleware.anon.Changes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeBatchBearer extends js.Object {
  var ChangeBatch: Changes = js.native
}

object ChangeBatchBearer {
  @scala.inline
  def apply(ChangeBatch: Changes): ChangeBatchBearer = {
    val __obj = js.Dynamic.literal(ChangeBatch = ChangeBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatchBearer]
  }
  @scala.inline
  implicit class ChangeBatchBearerOps[Self <: ChangeBatchBearer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeBatch(value: Changes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeBatch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

