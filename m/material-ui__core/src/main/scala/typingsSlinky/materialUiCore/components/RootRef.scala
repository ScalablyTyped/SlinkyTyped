package typingsSlinky.materialUiCore.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.rootRefRootRefMod.RootRefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootRef {
  
  @JSImport("@material-ui/core", "RootRef")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def rootRef(value: (js.Function1[/* instance */ js.Any | Null, Unit]) | ReactRef[js.Any]): this.type = set("rootRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootRefFunction1(value: /* instance */ js.Any | Null => Unit): this.type = set("rootRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def rootRefRefObject(value: ReactRef[js.Any]): this.type = set("rootRef", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RootRef.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RootRefProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
