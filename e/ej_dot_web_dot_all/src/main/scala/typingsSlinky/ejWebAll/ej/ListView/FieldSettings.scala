package typingsSlinky.ejWebAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldSettings extends js.Object {
  /** Defines the HTML attributes such as id, class, styles for the specific list item.
    */
  var attributes: js.UndefOr[js.Any] = js.native
  /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /** Defines the specific field name which contains id values for the list items.
    */
  var id: js.UndefOr[String] = js.native
  /** Defines the class name for image in that specific list items.
    */
  var imageClass: js.UndefOr[String] = js.native
  /** Defines the URL for the image to be displayed in the list item.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /** To trigger the mousedown event for specific list items.
    */
  var mouseDown: js.UndefOr[String] = js.native
  /** To trigger the mouseup event for specific list items.
    */
  var mouseUP: js.UndefOr[String] = js.native
  /** Defines the URL to be navigated while clicking the list item.
    */
  var navigateUrl: js.UndefOr[String] = js.native
  /** To define the child level of list items inside the parent items.
    */
  var parentPrimaryKey: js.UndefOr[String] = js.native
  /** Specifies whether to retain the selection of the list item.
    */
  var persistSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether to prevent the selection of the list item.
    */
  var preventSelection: js.UndefOr[Boolean] = js.native
  /** To define the first level of list items.
    */
  var primaryKey: js.UndefOr[String] = js.native
  /** Defines the specific field name in the data source to load the list with data.
    */
  var text: js.UndefOr[String] = js.native
}

object FieldSettings {
  @scala.inline
  def apply(): FieldSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSettings]
  }
  @scala.inline
  implicit class FieldSettingsOps[Self <: FieldSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseUP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseUP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUP")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withParentPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentPrimaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentPrimaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
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
  }
  
}

