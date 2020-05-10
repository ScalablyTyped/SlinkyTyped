package typingsSlinky.datatablesNetButtons.DataTables

import typingsSlinky.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtomSettingsCommon extends js.Object {
  /**
    * Action to take when the button is activated
    */
  var action: js.UndefOr[FunctionButtonAction] = js.native
  /**
    * Ensure that any requirements have been satisfied before initialising a button
    */
  var available: js.UndefOr[FunctionButtonAvailable] = js.native
  /**
    * Set the class name for the button
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Function that is called when the button is destroyed
    */
  var destroy: js.UndefOr[FunctionButtonInit] = js.native
  /**
    * Set a button's initial enabled state
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Define which button type the button should be based on
    */
  var extend: js.UndefOr[String] = js.native
  /**
    * Initialisation function that can be used to add events specific to this button
    */
  var init: js.UndefOr[FunctionButtonInit] = js.native
  /**
    * Define an activation key for a button
    */
  var key: js.UndefOr[String | ButtonKey] = js.native
  /**
    * Set a name for each selection
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Unique namespace for every button
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * The text to show in the button
    */
  var text: js.UndefOr[String | FunctionButtonText] = js.native
  /**
    * Button 'title' attribute text
    */
  var titleAttr: js.UndefOr[String] = js.native
}

object ButtomSettingsCommon {
  @scala.inline
  def apply(): ButtomSettingsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtomSettingsCommon]
  }
  @scala.inline
  implicit class ButtomSettingsCommonOps[Self <: ButtomSettingsCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailable(value: (/* dt */ Api, /* config */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | ButtonKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFunction3(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withText(value: String | FunctionButtonText): Self = {
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
    def withTitleAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAttr")(js.undefined)
        ret
    }
  }
  
}

