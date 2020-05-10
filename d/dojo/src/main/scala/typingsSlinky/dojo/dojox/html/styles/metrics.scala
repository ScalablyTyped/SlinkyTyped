package typingsSlinky.dojo.dojox.html.styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/styles.metrics.html
  *
  *
  */
@js.native
trait metrics extends js.Object {
  /**
    *
    * @param recalculate
    */
  def getCachedFontMeasurements(recalculate: js.Any): js.Any = js.native
  /**
    * Returns an object that has pixel equivilents of standard font size values.
    *
    */
  def getFontMeasurements(): js.Object = js.native
  /**
    *
    */
  def getScrollbar(): js.Object = js.native
  /**
    *
    * @param text
    * @param style
    * @param className               Optional
    */
  def getTextBox(text: String, style: js.Object, className: String): Unit = js.native
  /**
    *
    */
  def initOnFontResize(): Unit = js.native
}

object metrics {
  @scala.inline
  def apply(
    getCachedFontMeasurements: js.Any => js.Any,
    getFontMeasurements: () => js.Object,
    getScrollbar: () => js.Object,
    getTextBox: (String, js.Object, String) => Unit,
    initOnFontResize: () => Unit
  ): metrics = {
    val __obj = js.Dynamic.literal(getCachedFontMeasurements = js.Any.fromFunction1(getCachedFontMeasurements), getFontMeasurements = js.Any.fromFunction0(getFontMeasurements), getScrollbar = js.Any.fromFunction0(getScrollbar), getTextBox = js.Any.fromFunction3(getTextBox), initOnFontResize = js.Any.fromFunction0(initOnFontResize))
    __obj.asInstanceOf[metrics]
  }
  @scala.inline
  implicit class metricsOps[Self <: metrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCachedFontMeasurements(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCachedFontMeasurements")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFontMeasurements(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFontMeasurements")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScrollbar(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextBox(value: (String, js.Object, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextBox")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInitOnFontResize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initOnFontResize")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

