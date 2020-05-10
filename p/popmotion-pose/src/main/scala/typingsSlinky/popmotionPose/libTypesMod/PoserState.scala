package typingsSlinky.popmotionPose.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoserState[V, A, C, P] extends js.Object {
  var activeActions: ActiveActions[C] = js.native
  var activePoses: ActivePoses = js.native
  var children: ChildPosers[V, A, C, P] = js.native
  var props: Props = js.native
  var values: ValueMap[V] = js.native
}

object PoserState {
  @scala.inline
  def apply[V, A, C, P](
    activeActions: ActiveActions[C],
    activePoses: ActivePoses,
    children: ChildPosers[V, A, C, P],
    props: Props,
    values: ValueMap[V]
  ): PoserState[V, A, C, P] = {
    val __obj = js.Dynamic.literal(activeActions = activeActions.asInstanceOf[js.Any], activePoses = activePoses.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoserState[V, A, C, P]]
  }
  @scala.inline
  implicit class PoserStateOps[Self[v, a, c, p] <: PoserState[v, a, c, p], V, A, C, P] (val x: Self[V, A, C, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, A, C, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, A, C, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, A, C, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, A, C, P]) with Other]
    @scala.inline
    def withActiveActions(value: ActiveActions[C]): Self[V, A, C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePoses(value: ActivePoses): Self[V, A, C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePoses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ChildPosers[V, A, C, P]): Self[V, A, C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: Props): Self[V, A, C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: ValueMap[V]): Self[V, A, C, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

