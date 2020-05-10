package typingsSlinky.apolloServerCore

import typingsSlinky.apolloServerCore.typesMod.GraphQLServiceEngineConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEngine extends js.Object {
  var engine: js.UndefOr[GraphQLServiceEngineConfig] = js.native
}

object AnonEngine {
  @scala.inline
  def apply(): AnonEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEngine]
  }
  @scala.inline
  implicit class AnonEngineOps[Self <: AnonEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEngine(value: GraphQLServiceEngineConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
  }
  
}

