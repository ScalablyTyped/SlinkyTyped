package typingsSlinky.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonForwardToReplicas extends js.Object {
  var forwardToReplicas: Boolean = js.native
}

object AnonForwardToReplicas {
  @scala.inline
  def apply(forwardToReplicas: Boolean): AnonForwardToReplicas = {
    val __obj = js.Dynamic.literal(forwardToReplicas = forwardToReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardToReplicas]
  }
  @scala.inline
  implicit class AnonForwardToReplicasOps[Self <: AnonForwardToReplicas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForwardToReplicas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardToReplicas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

