package typingsSlinky.reactSizeme.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSizeme.mod.SizeMeProps
import typingsSlinky.reactSizeme.mod.SizeMeRenderProps
import typingsSlinky.reactSizeme.reactSizemeStrings.debounce
import typingsSlinky.reactSizeme.reactSizemeStrings.throttle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizeMe {
  
  @scala.inline
  def apply(children: SizeMeProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[SizeMeRenderProps]))
  }
  
  @JSImport("react-sizeme", "SizeMe")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSizeme.mod.SizeMe] {
    
    @scala.inline
    def monitorHeight(value: Boolean): this.type = set("monitorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monitorPosition(value: Boolean): this.type = set("monitorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monitorWidth(value: Boolean): this.type = set("monitorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noPlaceholder(value: Boolean): this.type = set("noPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refreshMode(value: throttle | debounce): this.type = set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def refreshRate(value: Double): this.type = set("refreshRate", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SizeMeRenderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
