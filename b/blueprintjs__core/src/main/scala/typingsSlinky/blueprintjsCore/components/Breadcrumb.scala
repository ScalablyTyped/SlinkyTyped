package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  @JSImport("@blueprintjs/core", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def current(value: Boolean): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: IconName | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconNull: this.type = set("icon", null)
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* event */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Breadcrumb.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IBreadcrumbProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
