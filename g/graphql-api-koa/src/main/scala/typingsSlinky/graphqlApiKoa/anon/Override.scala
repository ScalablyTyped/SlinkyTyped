package typingsSlinky.graphqlApiKoa.anon

import typingsSlinky.graphqlApiKoa.mod.ExecuteOptions
import typingsSlinky.koa.mod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Override[StateT, CustomT] extends js.Object {
  var `override`: js.UndefOr[js.Function1[/* ctx */ ParameterizedContext[StateT, CustomT], ExecuteOptions]] = js.native
}

object Override {
  @scala.inline
  def apply[StateT, CustomT](): Override[StateT, CustomT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Override[StateT, CustomT]]
  }
  @scala.inline
  implicit class OverrideOps[Self[statet, customt] <: Override[statet, customt], StateT, CustomT] (val x: Self[StateT, CustomT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StateT, CustomT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StateT, CustomT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[StateT, CustomT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[StateT, CustomT]) with Other]
    @scala.inline
    def withOverride(value: /* ctx */ ParameterizedContext[StateT, CustomT] => ExecuteOptions): Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverride: Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
  }
  
}

