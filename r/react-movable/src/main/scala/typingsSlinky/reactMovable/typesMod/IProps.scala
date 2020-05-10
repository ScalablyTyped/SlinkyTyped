package typingsSlinky.reactMovable.typesMod

import slinky.core.TagMod
import typingsSlinky.reactMovable.AnonChildren
import typingsSlinky.reactMovable.AnonElements
import typingsSlinky.reactMovable.AnonIndex
import typingsSlinky.reactMovable.AnonNewIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProps[Value] extends js.Object {
  var beforeDrag: js.UndefOr[js.Function1[/* params */ AnonElements, Unit]] = js.native
  var lockVertically: Boolean = js.native
  var removableByMove: Boolean = js.native
  var transitionDuration: Double = js.native
  var values: js.Array[Value] = js.native
  var voiceover: IVoiceover = js.native
  def onChange(meta: AnonNewIndex): Unit = js.native
  def renderItem(params: AnonIndex[Value]): TagMod[Any] = js.native
  def renderList(props: AnonChildren): TagMod[Any] = js.native
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
    voiceover: IVoiceover
  ): IProps[Value] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), removableByMove = removableByMove.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), renderList = js.Any.fromFunction1(renderList), transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps[Value]]
  }
  @scala.inline
  implicit class IPropsOps[Self[value] <: IProps[value], Value] (val x: Self[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Value] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Value] with Other]
    @scala.inline
    def withLockVertically(value: Boolean): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: AnonNewIndex => Unit): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovableByMove(value: Boolean): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderItem(value: AnonIndex[Value] => TagMod[Any]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderList(value: AnonChildren => TagMod[Any]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[Value]): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceover(value: IVoiceover): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDrag(value: /* params */ AnonElements => Unit): Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDrag: Self[Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrag")(js.undefined)
        ret
    }
  }
  
}

