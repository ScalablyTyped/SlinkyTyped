package typingsSlinky.reactMdTabs.useTabIndicatorStyleMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactMdTabs.reactMdTabsStrings.center
import typingsSlinky.reactMdTabs.reactMdTabsStrings.left
import typingsSlinky.reactMdTabs.reactMdTabsStrings.right
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRef
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.ItemRefList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var activeIndex: Double = js.native
  
  var align: left | center | right = js.native
  
  var itemRefs: ItemRefList[HTMLElement] = js.native
  
  var ref: js.UndefOr[Ref[HTMLDivElement | Null]] = js.native
  
  var style: js.UndefOr[typingsSlinky.react.mod.CSSProperties] = js.native
  
  var totalTabs: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    align: left | center | right,
    itemRefs: ItemRefList[HTMLElement],
    totalTabs: Double
  ): Options = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], align = align.asInstanceOf[js.Any], itemRefs = itemRefs.asInstanceOf[js.Any], totalTabs = totalTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemRefsVarargs(value: ItemRef[HTMLElement]*): Self = this.set("itemRefs", js.Array(value :_*))
    
    @scala.inline
    def setItemRefs(value: ItemRefList[HTMLElement]): Self = this.set("itemRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTabs(value: Double): Self = this.set("totalTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefRefObject(value: ReactRef[HTMLDivElement | Null]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLDivElement | Null]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setStyle(value: typingsSlinky.react.mod.CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
