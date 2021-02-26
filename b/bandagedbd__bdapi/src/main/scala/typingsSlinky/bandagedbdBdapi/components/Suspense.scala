package typingsSlinky.bandagedbdBdapi.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.SuspenseProps
import typingsSlinky.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Suspense {
  
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Suspense")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def fallback(value: NonNullable[ReactElement]): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fallbackNull: this.type = set("fallback", null)
    
    @scala.inline
    def fallbackReactElement(value: ReactElement): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unstable_expectedLoadTime(value: Double): this.type = set("unstable_expectedLoadTime", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Suspense.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SuspenseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
