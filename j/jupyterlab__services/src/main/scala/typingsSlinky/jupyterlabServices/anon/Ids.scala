package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ids extends js.Object {
  var ids: js.Array[String] = js.native
  var values: js.Array[IPlugin] = js.native
}

object Ids {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IPlugin]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  @scala.inline
  implicit class IdsOps[Self <: Ids] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[IPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

