package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.headerNavigationMod.HeaderNavigationOverrides
import typingsSlinky.baseui.headerNavigationMod.HeaderNavigationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderNavigation {
  
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.headerNavigationMod.HeaderNavigation] {
    
    @scala.inline
    def overrides(value: HeaderNavigationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HeaderNavigation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderNavigationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
