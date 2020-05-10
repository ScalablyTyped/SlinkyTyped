package typingsSlinky.keystonejsKeystone

import typingsSlinky.keystonejsKeystone.mod.BaseAuthStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfig[ListNames /* <: String */] extends js.Object {
  var config: js.UndefOr[js.Any] = js.native
  var list: ListNames = js.native
  var `type`: BaseAuthStrategy = js.native
}

object AnonConfig {
  @scala.inline
  def apply[ListNames](list: ListNames, `type`: BaseAuthStrategy): AnonConfig[ListNames] = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig[ListNames]]
  }
  @scala.inline
  implicit class AnonConfigOps[Self[listnames] <: AnonConfig[listnames], ListNames] (val x: Self[ListNames]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ListNames] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ListNames]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ListNames] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ListNames] with Other]
    @scala.inline
    def withList(value: ListNames): Self[ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: BaseAuthStrategy): Self[ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Any): Self[ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self[ListNames] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

