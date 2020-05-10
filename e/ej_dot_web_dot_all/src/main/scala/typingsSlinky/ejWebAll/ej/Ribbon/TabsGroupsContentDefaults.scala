package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentDefaults extends js.Object {
  /** Specifies the controls height such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the controls size such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {false}
    */
  var isBig: js.UndefOr[Boolean] = js.native
  /** Specifies the controls type such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {ej.Ribbon.Type.Button}
    */
  var `type`: js.UndefOr[String] = js.native
  /** Specifies the controls width such as Syncfusion button,split button,dropdown list,toggle button in the subgroup of  the ribbon tab.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object TabsGroupsContentDefaults {
  @scala.inline
  def apply(): TabsGroupsContentDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentDefaults]
  }
  @scala.inline
  implicit class TabsGroupsContentDefaultsOps[Self <: TabsGroupsContentDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBig")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

