package typingsSlinky.lokijs

import typingsSlinky.lokijs.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LokiObj extends js.Object {
  @JSName("$loki")
  var $loki: Double = js.native
  var meta: Created = js.native
}

object LokiObj {
  @scala.inline
  def apply($loki: Double, meta: Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiObj]
  }
  @scala.inline
  implicit class LokiObjOps[Self <: LokiObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$loki(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$loki")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: Created): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

