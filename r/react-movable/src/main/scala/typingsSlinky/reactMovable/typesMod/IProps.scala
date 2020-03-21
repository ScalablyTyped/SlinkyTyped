package typingsSlinky.reactMovable.typesMod

import slinky.core.TagMod
import typingsSlinky.reactMovable.AnonChildren
import typingsSlinky.reactMovable.AnonElements
import typingsSlinky.reactMovable.AnonIndex
import typingsSlinky.reactMovable.AnonNewIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ AnonElements, Unit]] = js.undefined
  var lockVertically: Boolean
  var removableByMove: Boolean
  var transitionDuration: Double
  var values: js.Array[Value]
  var voiceover: IVoiceover
  def onChange(meta: AnonNewIndex): Unit
  def renderItem(params: AnonIndex[Value]): TagMod[Any]
  def renderList(props: AnonChildren): TagMod[Any]
}

object IProps {
  @scala.inline
  def apply[Value](
    lockVertically: Boolean,
    onChange: AnonNewIndex => Unit,
    removableByMove: Boolean,
    renderItem: AnonIndex[Value] => TagMod[Any],
    renderList: AnonChildren => TagMod[Any],
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    beforeDrag: /* params */ AnonElements => Unit = null
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1(beforeDrag))
    __obj.asInstanceOf[IProps[Value]]
  }
}

