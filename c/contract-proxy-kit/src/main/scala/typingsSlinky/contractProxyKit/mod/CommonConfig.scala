package typingsSlinky.contractProxyKit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonConfig extends js.Object {
  var networks: js.UndefOr[StringDictionary[NetworkConfigEntry]] = js.native
}

object CommonConfig {
  @scala.inline
  def apply(): CommonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonConfig]
  }
  @scala.inline
  implicit class CommonConfigOps[Self <: CommonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworks(value: StringDictionary[NetworkConfigEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networks")(js.undefined)
        ret
    }
  }
  
}

