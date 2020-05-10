package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A UI element contains a key (label) and a value (content). And this element
  * may also contain some actions such as onclick button.
  */
@js.native
trait SchemaKeyValue extends js.Object {
  /**
    * The text of the bottom label. Formatted text supported.
    */
  var bottomLabel: js.UndefOr[String] = js.native
  /**
    * A button that can be clicked to trigger an action.
    */
  var button: js.UndefOr[SchemaButton] = js.native
  /**
    * The text of the content. Formatted text supported and always required.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * If the content should be multiline.
    */
  var contentMultiline: js.UndefOr[Boolean] = js.native
  /**
    * An enum value that will be replaced by the Chat API with the
    * corresponding icon image.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * The icon specified by a URL.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The onclick action. Only the top label, bottom label and content region
    * are clickable.
    */
  var onClick: js.UndefOr[SchemaOnClick] = js.native
  /**
    * The text of the top label. Formatted text supported.
    */
  var topLabel: js.UndefOr[String] = js.native
}

object SchemaKeyValue {
  @scala.inline
  def apply(): SchemaKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValue]
  }
  @scala.inline
  implicit class SchemaKeyValueOps[Self <: SchemaKeyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: SchemaButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
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
    def withContentMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: SchemaOnClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLabel")(js.undefined)
        ret
    }
  }
  
}

