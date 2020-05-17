package typingsSlinky.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Likelihood extends js.Object {
  var likelihood: Double = js.native
}

object Likelihood {
  @scala.inline
  def apply(likelihood: Double): Likelihood = {
    val __obj = js.Dynamic.literal(likelihood = likelihood.asInstanceOf[js.Any])
    __obj.asInstanceOf[Likelihood]
  }
  @scala.inline
  implicit class LikelihoodOps[Self <: Likelihood] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLikelihood(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihood")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

