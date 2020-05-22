package typingsSlinky.reactMovable.typesMod

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.reactMovable.anon.Children
import typingsSlinky.reactMovable.anon.Elements
import typingsSlinky.reactMovable.anon.Index
import typingsSlinky.reactMovable.anon.NewIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ Elements, Unit]] = js.undefined
  var container: js.UndefOr[Element | Null] = js.undefined
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: NewIndex): Unit
  def renderItem(params: Index[Value]): TagMod[Any]
  def renderList(props: Children): TagMod[Any]
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: NewIndex => Unit,
    removableByMove: Boolean,
    renderItem: Index[Value] => TagMod[Any],
    renderList: Children => TagMod[Any],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ Elements => Unit = null,
    container: js.UndefOr[Null | Element] = js.undefined
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps[Value]]
  }
}

