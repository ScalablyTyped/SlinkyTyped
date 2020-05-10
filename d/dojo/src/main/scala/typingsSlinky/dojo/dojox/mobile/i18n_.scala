package typingsSlinky.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/i18n.html
  *
  * An internationalization utility for applications based on dojox/mobile.
  *
  */
@js.native
trait i18n_ extends js.Object {
  /**
    * These properties can be specified for any widget once the dojox/mobile/i18n module is loaded.
    *
    */
  var I18NProperties: js.Object = js.native
  /**
    * Loads an nls resource bundle and returns an array of localized
    * resources.
    *
    * @param packageName
    * @param bundleName
    * @param locale               Optional
    */
  def load(packageName: String, bundleName: String, locale: String): Unit = js.native
  /**
    * Accumulates the given localized resources in an array and returns
    * it.
    *
    * @param bundle
    */
  def registerBundle(bundle: js.Array[_]): Unit = js.native
}

object i18n_ {
  @scala.inline
  def apply(
    I18NProperties: js.Object,
    load: (String, String, String) => Unit,
    registerBundle: js.Array[_] => Unit
  ): i18n_ = {
    val __obj = js.Dynamic.literal(I18NProperties = I18NProperties.asInstanceOf[js.Any], load = js.Any.fromFunction3(load), registerBundle = js.Any.fromFunction1(registerBundle))
    __obj.asInstanceOf[i18n_]
  }
  @scala.inline
  implicit class i18n_Ops[Self <: i18n_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI18NProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("I18NProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRegisterBundle(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerBundle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

