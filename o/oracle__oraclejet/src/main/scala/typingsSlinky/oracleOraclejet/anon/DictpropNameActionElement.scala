package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.add
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.remove
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameActionElement
  extends /* key */ StringDictionary[js.Any] {
  var action: add | remove | update = js.native
  var element: org.scalajs.dom.raw.Element = js.native
}

object DictpropNameActionElement {
  @scala.inline
  def apply(action: add | remove | update, element: org.scalajs.dom.raw.Element): DictpropNameActionElement = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameActionElement]
  }
  @scala.inline
  implicit class DictpropNameActionElementOps[Self <: DictpropNameActionElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: add | remove | update): Self = {
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
  }
  
}

