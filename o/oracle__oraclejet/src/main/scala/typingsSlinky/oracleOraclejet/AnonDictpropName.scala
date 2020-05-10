package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictpropName
  extends /* key */ StringDictionary[js.Any] {
  var fromCollapsible: Element = js.native
  var toCollapsible: Element = js.native
}

object AnonDictpropName {
  @scala.inline
  def apply(fromCollapsible: Element, toCollapsible: Element): AnonDictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictpropName]
  }
  @scala.inline
  implicit class AnonDictpropNameOps[Self <: AnonDictpropName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromCollapsible(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCollapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToCollapsible(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCollapsible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

