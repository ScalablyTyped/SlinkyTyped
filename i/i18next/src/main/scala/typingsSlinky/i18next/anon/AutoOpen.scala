package typingsSlinky.i18next.anon

import typingsSlinky.i18next.i18nextBooleans.`false`
import typingsSlinky.i18next.i18nextStrings.altKey
import typingsSlinky.i18next.i18nextStrings.ctrlKey
import typingsSlinky.i18next.i18nextStrings.iframe
import typingsSlinky.i18next.i18nextStrings.metaKey
import typingsSlinky.i18next.i18nextStrings.shiftKey
import typingsSlinky.i18next.i18nextStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoOpen extends js.Object {
  /**
    * If set to false you will need to open the editor via API
    * @default true
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to `<body>`
    * @default 'margin-right: 605px;'
    */
  var bodyStyle: js.UndefOr[String] = js.native
  /**
    * Enable by adding querystring locize=true; can be set to another value or turned off by setting to false
    * @default 'locize'
    */
  var enableByQS: js.UndefOr[String | `false`] = js.native
  /**
    * Enable on init without the need of adding querystring locize=true
    * @default false
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to the `<iframe>`
    * @default 'z-index: 2000; position: fixed; top: 0; right: 0; bottom: 0; width: 600px; box-shadow: -3px 0 5px 0 rgba(0,0,0,0.5);'
    */
  var iframeContainerStyle: js.UndefOr[String] = js.native
  /**
    * Styles to adapt layout in iframe mode to your website layout.
    * This will add a style to the parent of `<iframe>`
    * @default 'height: 100%; width: 600px; border: none;'
    */
  var iframeStyle: js.UndefOr[String] = js.native
  /**
    * Use lng in editor, eg. if running with lng=cimode (i18next, locize)
    * @default null
    */
  var lngOverride: js.UndefOr[String | Null] = js.native
  /**
    * Use lng in editor taken from query string, eg. if running with lng=cimode (i18next, locize)
    * @default 'useLng'
    */
  var lngOverrideQS: js.UndefOr[String] = js.native
  /**
    * How the editor will open.
    * Setting to window will open a new window/tab instead
    * @default 'iframe'
    */
  var mode: js.UndefOr[iframe | window] = js.native
  /**
    * Handle when locize saved the edited translations, eg. reload website
    * @default noop
    */
  var onEditorSaved: js.UndefOr[js.Function2[/* lng */ Null, /* ns */ String | js.Array[String], Unit]] = js.native
  /**
    * Turn on/off by pressing key combination. Combine this with `toggleKeyModifier`
    * @default 24 (x)
    */
  var toggleKeyCode: js.UndefOr[Double] = js.native
  /**
    * Turn on/off by pressing key combination. Combine this with `toggleKeyCode`
    * @default 'ctrlKey'
    */
  var toggleKeyModifier: js.UndefOr[ctrlKey | metaKey | altKey | shiftKey] = js.native
}

object AutoOpen {
  @scala.inline
  def apply(): AutoOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoOpen]
  }
  @scala.inline
  implicit class AutoOpenOps[Self <: AutoOpen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableByQS(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableByQS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableByQS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableByQS")(js.undefined)
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
    def withIframeContainerStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLngOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withLngOverrideNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngOverride")(null)
        ret
    }
    @scala.inline
    def withLngOverrideQS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngOverrideQS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngOverrideQS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngOverrideQS")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: iframe | window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorSaved(value: (/* lng */ Null, /* ns */ String | js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorSaved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEditorSaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorSaved")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleKeyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleKeyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleKeyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleKeyModifier(value: ctrlKey | metaKey | altKey | shiftKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleKeyModifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleKeyModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleKeyModifier")(js.undefined)
        ret
    }
  }
  
}

