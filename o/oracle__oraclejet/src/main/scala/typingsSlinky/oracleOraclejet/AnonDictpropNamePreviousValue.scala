package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictpropNamePreviousValue
  extends /* key */ StringDictionary[js.Any] {
  var previousValue: js.Any = js.native
  var value: js.Any = js.native
}

object AnonDictpropNamePreviousValue {
  @scala.inline
  def apply(previousValue: js.Any, value: js.Any): AnonDictpropNamePreviousValue = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictpropNamePreviousValue]
  }
  @scala.inline
  implicit class AnonDictpropNamePreviousValueOps[Self <: AnonDictpropNamePreviousValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

