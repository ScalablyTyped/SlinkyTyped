package typingsSlinky.googleGax.gaxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientConfig extends js.Object {
  var interfaces: js.UndefOr[StringDictionary[ServiceConfig]] = js.native
}

object ClientConfig {
  @scala.inline
  def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  @scala.inline
  implicit class ClientConfigOps[Self <: ClientConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterfaces(value: StringDictionary[ServiceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.undefined)
        ret
    }
  }
  
}

