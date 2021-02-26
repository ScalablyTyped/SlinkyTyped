package typingsSlinky.baseui.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.layoutGridMod.ALIGNMENT
import typingsSlinky.baseui.layoutGridMod.BEHAVIOR
import typingsSlinky.baseui.layoutGridMod.Responsive
import typingsSlinky.baseui.layoutGridMod.StyledGridProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.styletronReact.mod.StyleProp
import typingsSlinky.styletronReact.mod.StyletronBase
import typingsSlinky.styletronReact.mod.StyletronComponentInjectedProps
import typingsSlinky.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledGrid {
  
  @JSImport("baseui/layout-grid", "StyledGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def $align(value: Responsive[ALIGNMENT]): this.type = set("$align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $alignVarargs(value: ALIGNMENT*): this.type = set("$align", js.Array(value :_*))
    
    @scala.inline
    def $as(value: StyletronBase): this.type = set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $asComponentClass(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $asFunctionComponent(value: ReactComponentClass[js.Any]): this.type = set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $behavior(value: BEHAVIOR): this.type = set("$behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $gridGutters(value: Responsive[Double]): this.type = set("$gridGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $gridGuttersVarargs(value: Double*): this.type = set("$gridGutters", js.Array(value :_*))
    
    @scala.inline
    def $gridMargins(value: Responsive[Double]): this.type = set("$gridMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $gridMarginsVarargs(value: Double*): this.type = set("$gridMargins", js.Array(value :_*))
    
    @scala.inline
    def $gridMaxWidth(value: Double): this.type = set("$gridMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $gridUnit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSLengthUnitT */ js.Any
    ): this.type = set("$gridUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $style(value: StyleProp[StyledGridProps]): this.type = set("$style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def $styleFunction1(value: StyledGridProps => StyleObject): this.type = set("$style", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: StyledGrid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[StyledGridProps with StyletronComponentInjectedProps[StyledGridProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
