package typingsSlinky.mobxReactDevtools.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.mobxReactDevtools.anon.Bottom
import typingsSlinky.mobxReactDevtools.mobxReactDevtoolsStrings.bottomLeft
import typingsSlinky.mobxReactDevtools.mobxReactDevtoolsStrings.bottomRight
import typingsSlinky.mobxReactDevtools.mobxReactDevtoolsStrings.topLeft
import typingsSlinky.mobxReactDevtools.mobxReactDevtoolsStrings.topRight
import typingsSlinky.mobxReactDevtools.mod.IDevToolProps
import typingsSlinky.mobxReactDevtools.mod.default
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MobxReactDevtools {
  
  @JSImport("mobx-react-devtools", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def highlightTimeout(value: Double): this.type = set("highlightTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noPanel(value: Boolean): this.type = set("noPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: topRight | bottomRight | bottomLeft | topLeft | Bottom): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MobxReactDevtools.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDevToolProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
