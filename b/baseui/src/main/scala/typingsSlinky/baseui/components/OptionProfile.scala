package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ListItemProfile
import typingsSlinky.baseui.menuMod.OptionProfileProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionProfile {
  
  @JSImport("baseui/menu", "OptionProfile")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getChildMenu(value: /* item */ js.Any => ReactElement): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: ListItemProfile): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resetMenu(value: () => Unit): this.type = set("resetMenu", js.Any.fromFunction0(value))
  }
  
  def withProps(p: OptionProfileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => String | ReactComponentClass[_],
    getProfileItemImgText: js.Any => String,
    getProfileItemLabels: js.Any => typingsSlinky.baseui.anon.Body,
    item: js.Any
  ): Builder = {
    val __props = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionProfileProps]))
  }
}
