package typingsSlinky.materialUiCore.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.rootRefRootRefMod.RootRefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootRef {
  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def rootRefRefObject(value: ReactRef[js.Any]): this.type = set("rootRef", value.asInstanceOf[js.Any])
    @scala.inline
    def rootRefFunction1(value: /* instance */ js.Any | Null => Unit): this.type = set("rootRef", js.Any.fromFunction1(value))
    @scala.inline
    def rootRef(value: (js.Function1[/* instance */ js.Any | Null, Unit]) | ReactRef[js.Any]): this.type = set("rootRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RootRefProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RootRef.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

