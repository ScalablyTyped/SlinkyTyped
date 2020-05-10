package typingsSlinky.bagpipes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeworksOptions extends js.Object {
  /**
    * Adds to the pre and post queues, respectively.
    * Ensures a pipe gets fitted before or after the main execution pipeline.
    */
  var affinity: Affinity = js.native
}

object PipeworksOptions {
  @scala.inline
  def apply(affinity: Affinity): PipeworksOptions = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeworksOptions]
  }
  @scala.inline
  implicit class PipeworksOptionsOps[Self <: PipeworksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffinity(value: Affinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

