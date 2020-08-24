package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropName
  extends /* key */ StringDictionary[js.Any] {
  var fromCollapsible: org.scalajs.dom.raw.Element = js.native
  var toCollapsible: org.scalajs.dom.raw.Element = js.native
}

object DictpropName {
  @scala.inline
  def apply(fromCollapsible: org.scalajs.dom.raw.Element, toCollapsible: org.scalajs.dom.raw.Element): DictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropName]
  }
  @scala.inline
  implicit class DictpropNameOps[Self <: DictpropName] (val x: Self) extends AnyVal {
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
    def setFromCollapsible(value: org.scalajs.dom.raw.Element): Self = this.set("fromCollapsible", value.asInstanceOf[js.Any])
    @scala.inline
    def setToCollapsible(value: org.scalajs.dom.raw.Element): Self = this.set("toCollapsible", value.asInstanceOf[js.Any])
  }
  
}

