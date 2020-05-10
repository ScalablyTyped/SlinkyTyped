package typingsSlinky.i18next.mod

import typingsSlinky.i18next.i18nextBooleans.`false`
import typingsSlinky.i18next.i18nextStrings.default
import typingsSlinky.i18next.i18nextStrings.fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactOptions extends js.Object {
  /**
    * Set which events trigger a re-render, can be set to false or string of events
    * @default 'languageChanged loaded'
    */
  var bindI18n: js.UndefOr[String | `false`] = js.native
  /**
    * Set which events on store trigger a re-render, can be set to false or string of events
    * @default 'added removed'
    */
  var bindStore: js.UndefOr[String | `false`] = js.native
  /**
    * Set it to the default parent element created by the Trans component.
    * @default 'div'
    */
  var defaultTransParent: js.UndefOr[String] = js.native
  /**
    * Function to generate an i18nKey from the defaultValue (or Trans children)
    * when no key is provided.
    * By default, the defaultValue (Trans text) itself is used as the key.
    * If you want to require keys for all translations, supply a function
    * that always throws an error.
    * @default undefined
    */
  var hashTransKey: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], js.UndefOr[_]]] = js.native
  /**
    * Set it to fallback to let passed namespaces to translated hoc act as fallbacks
    * @default 'default'
    */
  var nsMode: js.UndefOr[default | fallback] = js.native
  /**
    * Set fallback value for Trans components without children
    * @default undefined
    */
  var transEmptyNodeValue: js.UndefOr[String] = js.native
  /**
    * Which nodes not to convert in defaultValue generation in the Trans component.
    * @default ['br', 'strong', 'i', 'p']
    */
  var transKeepBasicHtmlNodesFor: js.UndefOr[js.Array[String]] = js.native
  /**
    * Convert eg. <br/> found in translations to a react component of type br
    * @default true
    */
  var transSupportBasicHtmlNodes: js.UndefOr[Boolean] = js.native
  /**
    * Set it to false if you do not want to use Suspense
    * @default true
    */
  var useSuspense: js.UndefOr[Boolean] = js.native
  /**
    * Set to true if you like to wait for loaded in every translated hoc
    * @default false
    */
  @JSName("wait")
  var wait_FReactOptions: js.UndefOr[Boolean] = js.native
}

object ReactOptions {
  @scala.inline
  def apply(): ReactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactOptions]
  }
  @scala.inline
  implicit class ReactOptionsOps[Self <: ReactOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindI18n(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindI18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindI18n")(js.undefined)
        ret
    }
    @scala.inline
    def withBindStore(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindStore")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTransParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTransParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTransParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTransParent")(js.undefined)
        ret
    }
    @scala.inline
    def withHashTransKey(value: /* defaultValue */ js.UndefOr[js.Any] => js.UndefOr[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashTransKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHashTransKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashTransKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNsMode(value: default | fallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTransEmptyNodeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transEmptyNodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransEmptyNodeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transEmptyNodeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTransKeepBasicHtmlNodesFor(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transKeepBasicHtmlNodesFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransKeepBasicHtmlNodesFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transKeepBasicHtmlNodesFor")(js.undefined)
        ret
    }
    @scala.inline
    def withTransSupportBasicHtmlNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transSupportBasicHtmlNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransSupportBasicHtmlNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transSupportBasicHtmlNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSuspense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSuspense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSuspense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSuspense")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
  }
  
}

