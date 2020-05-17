package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the information about tab stops.
  */
@js.native
trait TabsSettings extends js.Object {
  /**
    * Specifies the default distance between tab stops.
    */
  var defaultTabStop: Double = js.native
  /**
    * Gets or sets a list of tab stops.
    */
  var tabs: js.Array[TabSettings] = js.native
}

object TabsSettings {
  @scala.inline
  def apply(defaultTabStop: Double, tabs: js.Array[TabSettings]): TabsSettings = {
    val __obj = js.Dynamic.literal(defaultTabStop = defaultTabStop.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsSettings]
  }
  @scala.inline
  implicit class TabsSettingsOps[Self <: TabsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTabStop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTabStop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabs(value: js.Array[TabSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

