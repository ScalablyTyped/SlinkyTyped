package typingsSlinky.officeUiFabricReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey extends /* key */ StringDictionary[ReactInstance] {
  var navigatedMonth: HTMLElement = js.native
}

object Dictkey {
  @scala.inline
  def apply(navigatedMonth: HTMLElement): Dictkey = {
    val __obj = js.Dynamic.literal(navigatedMonth = navigatedMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigatedMonth(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedMonth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

