package typingsSlinky.antd.utilsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.antd.affixMod.default
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserverEntity extends js.Object {
  var affixList: js.Array[default] = js.native
  var eventHandlers: StringDictionary[js.Any] = js.native
  var target: HTMLElement | Window_ = js.native
}

object ObserverEntity {
  @scala.inline
  def apply(
    affixList: js.Array[default],
    eventHandlers: StringDictionary[js.Any],
    target: HTMLElement | Window_
  ): ObserverEntity = {
    val __obj = js.Dynamic.literal(affixList = affixList.asInstanceOf[js.Any], eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverEntity]
  }
  @scala.inline
  implicit class ObserverEntityOps[Self <: ObserverEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffixList(value: js.Array[default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventHandlers(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement | Window_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

