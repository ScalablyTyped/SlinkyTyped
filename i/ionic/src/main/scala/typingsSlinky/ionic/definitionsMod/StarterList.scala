package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.AnonIdName
import typingsSlinky.ionic.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarterList extends js.Object {
  var integrations: js.Array[AnonIdName] = js.native
  var starters: js.Array[AnonType] = js.native
}

object StarterList {
  @scala.inline
  def apply(integrations: js.Array[AnonIdName], starters: js.Array[AnonType]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterList]
  }
  @scala.inline
  implicit class StarterListOps[Self <: StarterList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntegrations(value: js.Array[AnonIdName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarters(value: js.Array[AnonType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

