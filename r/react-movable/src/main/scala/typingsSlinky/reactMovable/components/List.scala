package typingsSlinky.reactMovable.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMovable.anon.Children
import typingsSlinky.reactMovable.anon.Elements
import typingsSlinky.reactMovable.anon.Index
import typingsSlinky.reactMovable.anon.NewIndex
import typingsSlinky.reactMovable.listMod.default
import typingsSlinky.reactMovable.typesMod.IProps
import typingsSlinky.reactMovable.typesMod.IVoiceover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("react-movable/lib/List", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Value] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def beforeDrag(value: /* params */ Elements => Unit): this.type = set("beforeDrag", js.Any.fromFunction1(value))
  }
  
  def withProps[Value](p: IProps[Value]): Builder[Value] = new Builder[Value](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: NewIndex => Unit,
    removableByMove: Boolean,
    renderItem: Index[Value] => TagMod[Any],
    renderList: Children => TagMod[Any],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover
  ): Builder[Value] = {
    val __props = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    new Builder[Value](js.Array(this.component, __props.asInstanceOf[IProps[Value]]))
  }
}

