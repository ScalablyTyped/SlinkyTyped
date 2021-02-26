package typingsSlinky.overlayscrollbars.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.overlayscrollbars.mod.BlockBehavior
import typingsSlinky.overlayscrollbars.mod.JQuery
import typingsSlinky.overlayscrollbars.mod.Margin
import typingsSlinky.overlayscrollbars.mod.ScrollBehavior
import typingsSlinky.overlayscrollbars.mod._Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends _Coordinates {
  
  var block: js.UndefOr[BlockBehavior | XY | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.native
  
  var el: HTMLElement | JQuery = js.native
  
  var margin: js.UndefOr[
    Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.native
  
  var scroll: js.UndefOr[ScrollBehavior | Y | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.native
}
object Block {
  
  @scala.inline
  def apply(el: HTMLElement | JQuery): Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockBehavior | XY | (js.Tuple2[BlockBehavior, BlockBehavior])): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setEl(value: HTMLElement | JQuery): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElHTMLElement(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setScroll(value: ScrollBehavior | Y | (js.Tuple2[ScrollBehavior, ScrollBehavior])): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
