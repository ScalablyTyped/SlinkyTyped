package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.close
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndCallback
  extends /* key */ StringDictionary[js.Any] {
  var action: open | close = js.native
  var element: org.scalajs.dom.raw.Element = js.native
  def endCallback(): Unit = js.native
}

object EndCallback {
  @scala.inline
  def apply(action: open | close, element: org.scalajs.dom.raw.Element, endCallback: () => Unit): EndCallback = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], endCallback = js.Any.fromFunction0(endCallback))
    __obj.asInstanceOf[EndCallback]
  }
  @scala.inline
  implicit class EndCallbackOps[Self <: EndCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: open | close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

