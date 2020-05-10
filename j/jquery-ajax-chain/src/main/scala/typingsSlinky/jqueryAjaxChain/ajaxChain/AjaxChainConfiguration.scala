package typingsSlinky.jqueryAjaxChain.ajaxChain

import typingsSlinky.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of key/value pairs that configure the AjaxChain request; 'ajaxSettings' is mandatory.
  */
@js.native
trait AjaxChainConfiguration extends js.Object {
  /**
    * jQuery $.ajax method settings (required).
    */
  var ajaxSettings: JQueryAjaxSettings = js.native
  /**
    * Returning a truthy value (String) allows to append a string to the next queued
    * Ajax call 'url' property value specified in original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var appendToUrl: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.native
  /**
    * Returning a truthy value allows to prevent the related Ajax call from being executed,
    * passing the former as a parameter to any registered handler(s); useful to create
    * caching mechanisms (optional).
    */
  var hasCache: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.native
  /**
    * Returning a truthy value determines any registered fail callback(s) to be called immediately,
    * passing the former as an argument to the latter; the queue is then rejected (optional).
    */
  var hasErrors: js.UndefOr[js.Function1[/* response */ js.Any, _]] = js.native
  /**
    * Returning a truthy value prevents the queue from further progressing to the succeeding
    * Ajax calls; the queue is then resolved (optional).
    */
  var hasHaltingCapabilities: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.native
  /**
    * Returning a truthy value prevents the queue from being halted in case of Ajax error (optional).
    */
  var isSkippable: js.UndefOr[js.Function1[/* response */ js.Any, Boolean]] = js.native
  /**
    * Configuration object label (optional).
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Returning a truthy value (Object) allows to arbitrarily overwrite the next queued Ajax call
    * 'data' property value specified in the original jQuery $.ajax method configuration
    * object ('ajaxSettings') (optional).
    */
  var transform: js.UndefOr[js.Function1[/* response */ js.Any, String | js.Object | js.Array[js.Object]]] = js.native
}

object AjaxChainConfiguration {
  @scala.inline
  def apply(ajaxSettings: JQueryAjaxSettings): AjaxChainConfiguration = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxChainConfiguration]
  }
  @scala.inline
  implicit class AjaxChainConfigurationOps[Self <: AjaxChainConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxSettings(value: JQueryAjaxSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendToUrl(value: /* response */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendToUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCache(value: /* response */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCache")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCache")(js.undefined)
        ret
    }
    @scala.inline
    def withHasErrors(value: /* response */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasErrors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withHasHaltingCapabilities(value: /* response */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHaltingCapabilities")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasHaltingCapabilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHaltingCapabilities")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSkippable(value: /* response */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsSkippable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* response */ js.Any => String | js.Object | js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

