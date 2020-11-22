package typingsSlinky.popperjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popperjsCore.typesMod.Modifier
import typingsSlinky.popperjsCore.typesMod.OptionsGeneric
import typingsSlinky.popperjsCore.typesMod.PositioningStrategy
import typingsSlinky.popperjsCore.typesMod.StateRects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/types.State> */
@js.native
trait PartialStateAttributes extends js.Object {
  
  var attributes: js.UndefOr[StringDictionary[StringDictionary[String | Boolean]]] = js.native
  
  var elements: js.UndefOr[Arrow] = js.native
  
  var modifiersData: js.UndefOr[Dictkey] = js.native
  
  var options: js.UndefOr[OptionsGeneric[_]] = js.native
  
  var orderedModifiers: js.UndefOr[js.Array[Modifier[_, _]]] = js.native
  
  var placement: js.UndefOr[typingsSlinky.popperjsCore.enumsMod.Placement] = js.native
  
  var rects: js.UndefOr[StateRects] = js.native
  
  var reset: js.UndefOr[Boolean] = js.native
  
  var scrollParents: js.UndefOr[Popper] = js.native
  
  var strategy: js.UndefOr[PositioningStrategy] = js.native
  
  var styles: js.UndefOr[StringDictionary[PartialCSSStyleDeclaratio]] = js.native
}
object PartialStateAttributes {
  
  @scala.inline
  def apply(): PartialStateAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateAttributes]
  }
  
  @scala.inline
  implicit class PartialStateAttributesOps[Self <: PartialStateAttributes] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setElements(value: Arrow): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setModifiersData(value: Dictkey): Self = this.set("modifiersData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiersData: Self = this.set("modifiersData", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsGeneric[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOrderedModifiersVarargs(value: (Modifier[js.Any, js.Any])*): Self = this.set("orderedModifiers", js.Array(value :_*))
    
    @scala.inline
    def setOrderedModifiers(value: js.Array[Modifier[_, _]]): Self = this.set("orderedModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderedModifiers: Self = this.set("orderedModifiers", js.undefined)
    
    @scala.inline
    def setPlacement(value: typingsSlinky.popperjsCore.enumsMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setRects(value: StateRects): Self = this.set("rects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRects: Self = this.set("rects", js.undefined)
    
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setScrollParents(value: Popper): Self = this.set("scrollParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollParents: Self = this.set("scrollParents", js.undefined)
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[PartialCSSStyleDeclaratio]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
