package typingsSlinky.grommet.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.grommetStrings.window
import typingsSlinky.grommet.infiniteScrollMod.InfiniteScrollProps
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InfiniteScroll {
  
  @JSImport("grommet/es6", "InfiniteScroll")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.InfiniteScroll] {
    
    @scala.inline
    def itemsVarargs(value: (String | Double | ReactElement | (Record[String, js.Any]))*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def items(value: js.Array[String | Double | ReactElement | (Record[String, _])]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMore(value: () => Unit): this.type = set("onMore", js.Any.fromFunction0(value))
    
    @scala.inline
    def renderMarker(value: /* marker */ ReactElement => ReactElement): this.type = set("renderMarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableAncestorReactElement(value: ReactElement): this.type = set("scrollableAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollableAncestor(value: ReactElement | window): this.type = set("scrollableAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Double): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InfiniteScrollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InfiniteScroll.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
