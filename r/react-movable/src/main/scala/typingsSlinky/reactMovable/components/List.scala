package typingsSlinky.reactMovable.components

import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMovable.typesMod.BeforeDragParams
import typingsSlinky.reactMovable.typesMod.IProps
import typingsSlinky.reactMovable.typesMod.IVoiceover
import typingsSlinky.reactMovable.typesMod.OnChangeMeta
import typingsSlinky.reactMovable.typesMod.RenderItemParams
import typingsSlinky.reactMovable.typesMod.RenderListParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: OnChangeMeta => Unit,
    removableByMove: Boolean,
    renderItem: RenderItemParams[Value] => ReactElement,
    renderList: RenderListParams => ReactElement,
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover
  ): Builder[Value] = {
    val __props = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    new Builder[Value](js.Array(this.component, __props.asInstanceOf[IProps[Value]]))
  }
  
  @JSImport("react-movable", "List")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Value] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMovable.mod.List[Value]] {
    
    @scala.inline
    def beforeDrag(value: /* params */ BeforeDragParams => Unit): this.type = set("beforeDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def container(value: Element): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerNull: this.type = set("container", null)
  }
  
  def withProps[Value](p: IProps[Value]): Builder[Value] = new Builder[Value](js.Array(this.component, p.asInstanceOf[js.Any]))
}
