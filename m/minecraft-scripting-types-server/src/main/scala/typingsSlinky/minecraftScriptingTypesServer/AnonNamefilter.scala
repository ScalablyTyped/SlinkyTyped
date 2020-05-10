package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.MinecraftTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNamefilter extends js.Object {
  /**
    * List of special names that will cause the events defined in 'on_named' to fire
    */
  var name_filter: js.Array[String] = js.native
  /**
    * Event to be called when this entity acquires the name specified in 'name_filter'
    */
  var on_named: MinecraftTrigger | String = js.native
}

object AnonNamefilter {
  @scala.inline
  def apply(name_filter: js.Array[String], on_named: MinecraftTrigger | String): AnonNamefilter = {
    val __obj = js.Dynamic.literal(name_filter = name_filter.asInstanceOf[js.Any], on_named = on_named.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNamefilter]
  }
  @scala.inline
  implicit class AnonNamefilterOps[Self <: AnonNamefilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName_filter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn_named(value: MinecraftTrigger | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_named")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

