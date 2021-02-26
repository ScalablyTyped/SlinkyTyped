package typingsSlinky.giustoInkRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.giustoInkRouter.anon.Hash
import typingsSlinky.giustoInkRouter.mod.RouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  @JSImport("@giusto/ink-router", "Router")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.giustoInkRouter.mod.Router] {
    
    @scala.inline
    def getUserConfirmation(value: () => Unit): this.type = set("getUserConfirmation", js.Any.fromFunction0(value))
    
    @scala.inline
    def initialEntries(value: js.Array[String | Hash]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialEntriesVarargs(value: (String | Hash)*): this.type = set("initialEntries", js.Array(value :_*))
    
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyLength(value: Double): this.type = set("keyLength", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Router.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
