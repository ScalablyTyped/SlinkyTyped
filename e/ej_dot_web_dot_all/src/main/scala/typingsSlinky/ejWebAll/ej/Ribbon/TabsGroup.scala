package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroup extends js.Object {
  /** Specifies the alignment of controls in the groups in 'row' type or 'column' type. Value for row type is &quot;ej.Ribbon.AlignType.Rows&quot; and for column type is
    * &quot;ej.Ribbon.alignType.columns&quot;.
    * @Default {ej.Ribbon.AlignType.Rows}
    */
  var alignType: js.UndefOr[AlignType | String] = js.native
  /** Specifies the Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls to the groups in the ribbon control.
    * @Default {Array}
    */
  var content: js.UndefOr[js.Array[TabsGroupsContent]] = js.native
  /** Specifies the ID of custom items to be placed in the groups.
    * @Default {null}
    */
  var contentID: js.UndefOr[String] = js.native
  /** Specifies the HTML contents to place into the groups.
    * @Default {null}
    */
  var customContent: js.UndefOr[String] = js.native
  /** Specifies the group expander for groups in the ribbon control. Set &quot;true&quot; to enable the group expander.
    * @Default {false}
    */
  var enableGroupExpander: js.UndefOr[Boolean] = js.native
  /** Sets custom setting to the groups in the ribbon control.
    * @Default {Object}
    */
  var groupExpanderSettings: js.UndefOr[TabsGroupsGroupExpanderSettings] = js.native
  /** Specifies the text to the groups in the ribbon control.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the custom items such as div, table, controls by using the &quot;custom&quot; type.
    * @Default {null}
    */
  var `type`: js.UndefOr[String] = js.native
}

object TabsGroup {
  @scala.inline
  def apply(): TabsGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroup]
  }
  @scala.inline
  implicit class TabsGroupOps[Self <: TabsGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignType(value: AlignType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignType")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: js.Array[TabsGroupsContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentID")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContent")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupExpander(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupExpander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupExpander: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupExpander")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupExpanderSettings(value: TabsGroupsGroupExpanderSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpanderSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupExpanderSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupExpanderSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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
  }
  
}

