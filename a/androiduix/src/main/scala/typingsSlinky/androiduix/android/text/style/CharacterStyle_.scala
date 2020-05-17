package typingsSlinky.androiduix.android.text.style

import typingsSlinky.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharacterStyle_ extends js.Object {
  var mType: js.Symbol = js.native
  def getUnderlying(): CharacterStyle = js.native
  def updateDrawState(tp: TextPaint): Unit = js.native
}

object CharacterStyle_ {
  @scala.inline
  def apply(getUnderlying: () => CharacterStyle, mType: js.Symbol, updateDrawState: TextPaint => Unit): CharacterStyle_ = {
    val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState))
    __obj.asInstanceOf[CharacterStyle_]
  }
  @scala.inline
  implicit class CharacterStyle_Ops[Self <: CharacterStyle_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUnderlying(value: () => CharacterStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnderlying")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMType(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateDrawState(value: TextPaint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDrawState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

