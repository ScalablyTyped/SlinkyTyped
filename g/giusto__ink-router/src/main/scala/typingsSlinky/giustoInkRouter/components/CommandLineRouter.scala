package typingsSlinky.giustoInkRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.giustoInkRouter.mod.CommandLineRouterProps
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommandLineRouter {
  
  @JSImport("@giusto/ink-router", "CommandLineRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.giustoInkRouter.mod.CommandLineRouter] {
    
    @scala.inline
    def args(value: js.Array[String]): this.type = set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def argsVarargs(value: String*): this.type = set("args", js.Array(value :_*))
    
    @scala.inline
    def initialEntries(value: js.Array[String]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialEntriesVarargs(value: String*): this.type = set("initialEntries", js.Array(value :_*))
    
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: Record[String, _]): this.type = set("options", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CommandLineRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommandLineRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
