package typingsSlinky.reactMove.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMove.animateMod.IAnimateProps
import typingsSlinky.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animate {
  
  @JSImport("react-move", "Animate")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMove.mod.Animate] {
    
    @scala.inline
    def enter(value: js.Any): this.type = set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interpolation(
      value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
    ): this.type = set("interpolation", js.Any.fromFunction4(value))
    
    @scala.inline
    def leave(value: js.Any): this.type = set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def update(value: js.Any): this.type = set("update", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IAnimateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: HashMap => ReactElement, start: js.Any): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), start = start.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IAnimateProps]))
  }
}
