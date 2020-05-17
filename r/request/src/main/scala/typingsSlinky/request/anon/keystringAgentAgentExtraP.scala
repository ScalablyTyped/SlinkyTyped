package typingsSlinky.request.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.request.mod.PoolOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[key: string] : node.http.Agent | node.https.Agent} & request.request.ExtraPoolOptions */
@js.native
trait keystringAgentAgentExtraP
  extends /* key */ StringDictionary[Agent | typingsSlinky.node.httpsMod.Agent]
     with PoolOptions {
  var maxSockets: js.UndefOr[Double] = js.native
}

object keystringAgentAgentExtraP {
  @scala.inline
  def apply(): keystringAgentAgentExtraP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keystringAgentAgentExtraP]
  }
  @scala.inline
  implicit class keystringAgentAgentExtraPOps[Self <: keystringAgentAgentExtraP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxSockets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSockets")(js.undefined)
        ret
    }
  }
  
}

