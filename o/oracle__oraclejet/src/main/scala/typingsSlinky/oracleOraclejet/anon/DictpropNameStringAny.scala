package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameStringAny
  extends /* key */ StringDictionary[js.Any] {
  var item: org.scalajs.dom.raw.Element = js.native
}

object DictpropNameStringAny {
  @scala.inline
  def apply(item: org.scalajs.dom.raw.Element): DictpropNameStringAny = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameStringAny]
  }
  @scala.inline
  implicit class DictpropNameStringAnyOps[Self <: DictpropNameStringAny] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

