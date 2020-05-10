package typingsSlinky.actionsOnGoogle.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputContext[TParameters /* <: Parameters */] extends js.Object {
  /** @public */
  var lifespan: Double = js.native
  /** @public */
  var parameters: js.UndefOr[TParameters] = js.native
}

object OutputContext {
  @scala.inline
  def apply[TParameters](lifespan: Double): OutputContext[TParameters] = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputContext[TParameters]]
  }
  @scala.inline
  implicit class OutputContextOps[Self[tparameters] <: OutputContext[tparameters], TParameters] (val x: Self[TParameters]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParameters] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParameters]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParameters] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParameters] with Other]
    @scala.inline
    def withLifespan(value: Double): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifespan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: TParameters): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

