package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.li.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.listMod.ArtworkSizesT
import typingsSlinky.baseui.listMod.ListOverrides
import typingsSlinky.baseui.listMod.MenuAdapterPropsT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuAdapter {
  
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isHighlighted: Boolean,
    $size: String,
    item: js.Any,
    onClick: SyntheticMouseEvent[HTMLLIElement] => js.Any,
    onMouseEnter: SyntheticMouseEvent[HTMLLIElement] => js.Any
  ): Builder = {
    val __props = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuAdapterPropsT]))
  }
  
  @JSImport("baseui/list", "MenuAdapter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def artwork(value: ReactElement): this.type = set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def artworkReactElement(value: ReactElement): this.type = set("artwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def artworkSize(value: ArtworkSizesT | Double): this.type = set("artworkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endEnhancer(value: ReactElement): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endEnhancerReactElement(value: ReactElement): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: ListOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sublist(value: Boolean): this.type = set("sublist", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuAdapterPropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
