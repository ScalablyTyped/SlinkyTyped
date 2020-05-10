package typingsSlinky.dojo.dojo.base.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/window.global.html
  *
  * Alias for the current window. 'global' can be modified
  * for temporary context shifting. See also withGlobal().
  * Use this rather than referring to 'window' to ensure your code runs
  * correctly in managed contexts.
  *
  */
@js.native
trait global extends js.Object {
  /**
    *
    */
  @JSName("$")
  def $(): js.Any = js.native
  /**
    *
    * @param start
    * @param data
    * @param responseCode
    * @param errorMsg
    */
  def GoogleSearchStoreCallback_undefined_NaN(start: js.Any, data: js.Any, responseCode: js.Any, errorMsg: js.Any): Unit = js.native
  /**
    *
    */
  def jQuery(): js.Any = js.native
  /**
    *
    */
  def swfIsInHTML(): Unit = js.native
  /**
    *
    */
  def undefined_onload(): Unit = js.native
}

object global {
  @scala.inline
  def apply(
    $: () => js.Any,
    GoogleSearchStoreCallback_undefined_NaN: (js.Any, js.Any, js.Any, js.Any) => Unit,
    jQuery: () => js.Any,
    swfIsInHTML: () => Unit,
    undefined_onload: () => Unit
  ): global = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction0($), GoogleSearchStoreCallback_undefined_NaN = js.Any.fromFunction4(GoogleSearchStoreCallback_undefined_NaN), jQuery = js.Any.fromFunction0(jQuery), swfIsInHTML = js.Any.fromFunction0(swfIsInHTML), undefined_onload = js.Any.fromFunction0(undefined_onload))
    __obj.asInstanceOf[global]
  }
  @scala.inline
  implicit class globalOps[Self <: global] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoogleSearchStoreCallback_undefined_NaN(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoogleSearchStoreCallback_undefined_NaN")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withJQuery(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSwfIsInHTML(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfIsInHTML")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUndefined_onload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined_onload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

