package typingsSlinky.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardToReplicas extends js.Object {
  var forwardToReplicas: Boolean = js.native
}

object ForwardToReplicas {
  @scala.inline
  def apply(forwardToReplicas: Boolean): ForwardToReplicas = {
    val __obj = js.Dynamic.literal(forwardToReplicas = forwardToReplicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardToReplicas]
  }
  @scala.inline
  implicit class ForwardToReplicasOps[Self <: ForwardToReplicas] (val x: Self) extends AnyVal {
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

