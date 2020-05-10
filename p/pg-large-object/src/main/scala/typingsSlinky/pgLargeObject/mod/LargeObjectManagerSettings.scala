package typingsSlinky.pgLargeObject.mod

import typingsSlinky.pg.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LargeObjectManagerSettings extends js.Object {
  var pg: js.UndefOr[Client] = js.native
  var pgPromise: js.UndefOr[js.Object] = js.native
}

object LargeObjectManagerSettings {
  @scala.inline
  def apply(): LargeObjectManagerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LargeObjectManagerSettings]
  }
  @scala.inline
  implicit class LargeObjectManagerSettingsOps[Self <: LargeObjectManagerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPg(value: Client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pg")(js.undefined)
        ret
    }
    @scala.inline
    def withPgPromise(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPgPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgPromise")(js.undefined)
        ret
    }
  }
  
}

