package typingsSlinky.dojo.dojox.mobile.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/i18n.I18NProperties.html
  *
  * These properties can be specified for any widget once the dojox/mobile/i18n module is loaded.
  *
  */
@js.native
trait I18NProperties extends js.Object {
  /**
    * Disables localization by dojox/mobile/i18n for the widget on which the property is set.
    *
    */
  var mblNoConv: Boolean = js.native
}

object I18NProperties {
  @scala.inline
  def apply(mblNoConv: Boolean): I18NProperties = {
    val __obj = js.Dynamic.literal(mblNoConv = mblNoConv.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18NProperties]
  }
  @scala.inline
  implicit class I18NPropertiesOps[Self <: I18NProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMblNoConv(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mblNoConv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

