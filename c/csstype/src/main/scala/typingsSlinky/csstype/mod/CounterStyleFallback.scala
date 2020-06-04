package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CounterStyleFallback extends js.Object {
  var additiveSymbols: js.UndefOr[String | js.Array[String]] = js.undefined
  var fallback: js.UndefOr[String | js.Array[String]] = js.undefined
  var negative: js.UndefOr[String | js.Array[String]] = js.undefined
  var pad: js.UndefOr[String | js.Array[String]] = js.undefined
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  var range: js.UndefOr[CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]] = js.undefined
  var speakAs: js.UndefOr[CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]] = js.undefined
  var suffix: js.UndefOr[String | js.Array[String]] = js.undefined
  var symbols: js.UndefOr[String | js.Array[String]] = js.undefined
  var system: js.UndefOr[CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]] = js.undefined
}

object CounterStyleFallback {
  @scala.inline
  def apply(): CounterStyleFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleFallback]
  }
  @scala.inline
  implicit class CounterStyleFallbackOps[Self <: CounterStyleFallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditiveSymbols(value: String | js.Array[String]): Self = this.set("additiveSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditiveSymbols: Self = this.set("additiveSymbols", js.undefined)
    @scala.inline
    def setFallback(value: String | js.Array[String]): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setNegative(value: String | js.Array[String]): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setPad(value: String | js.Array[String]): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setPrefix(value: String | js.Array[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setRange(value: CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSpeakAs(value: CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]): Self = this.set("speakAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakAs: Self = this.set("speakAs", js.undefined)
    @scala.inline
    def setSuffix(value: String | js.Array[String]): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSymbols(value: String | js.Array[String]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    @scala.inline
    def setSystem(value: CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

