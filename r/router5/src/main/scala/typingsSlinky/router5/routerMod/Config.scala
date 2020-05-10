package typingsSlinky.router5.routerMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var decoders: Record[String, _] = js.native
  var defaultParams: Record[String, _] = js.native
  var encoders: Record[String, _] = js.native
  var forwardMap: Record[String, _] = js.native
}

object Config {
  @scala.inline
  def apply(
    decoders: Record[String, _],
    defaultParams: Record[String, _],
    encoders: Record[String, _],
    forwardMap: Record[String, _]
  ): Config = {
    val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], defaultParams = defaultParams.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], forwardMap = forwardMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoders(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultParams(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForwardMap(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

