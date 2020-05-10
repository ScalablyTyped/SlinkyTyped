package typingsSlinky.awsSdkRoute53IdNormalizerMiddleware.mod

import typingsSlinky.awsSdkRoute53IdNormalizerMiddleware.AnonAliasTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var ResourceRecordSet: AnonAliasTarget = js.native
}

object Change {
  @scala.inline
  def apply(ResourceRecordSet: AnonAliasTarget): Change = {
    val __obj = js.Dynamic.literal(ResourceRecordSet = ResourceRecordSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceRecordSet(value: AnonAliasTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRecordSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

