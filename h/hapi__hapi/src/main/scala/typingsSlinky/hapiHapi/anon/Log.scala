package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.hapiHapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  var log: js.UndefOr[js.Array[String] | `false`] = js.native
  var request: js.UndefOr[js.Array[String] | `false`] = js.native
}

object Log {
  @scala.inline
  def apply(): Log = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
  }
  
}

