package typingsSlinky.postmanCollection.mod

import typingsSlinky.postmanCollection.AnonPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfigDefinition extends PropertyDefinition {
  var host: js.UndefOr[String] = js.native
  var `match`: js.UndefOr[String | AnonPattern | UrlMatchPattern] = js.native
  var port: js.UndefOr[Double] = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
}

object ProxyConfigDefinition {
  @scala.inline
  def apply(): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
  @scala.inline
  implicit class ProxyConfigDefinitionOps[Self <: ProxyConfigDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: String | AnonPattern | UrlMatchPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
  }
  
}

