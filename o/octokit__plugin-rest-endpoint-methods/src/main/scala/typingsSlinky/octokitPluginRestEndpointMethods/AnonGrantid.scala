package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGrantid extends js.Object {
  var grant_id: AnonRequired = js.native
}

object AnonGrantid {
  @scala.inline
  def apply(grant_id: AnonRequired): AnonGrantid = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrantid]
  }
  @scala.inline
  implicit class AnonGrantidOps[Self <: AnonGrantid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

