package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.ReactNodeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactComponentLike extends js.Object {
  var context: js.Any = js.native
  var props: js.Any = js.native
  var refs: js.Any = js.native
  var state: js.Any = js.native
  def forceUpdate(args: js.Any*): js.Any = js.native
  def render(): ReactNodeLike = js.native
  def setState(args: js.Any*): js.Any = js.native
}

object ReactComponentLike {
  @scala.inline
  def apply(
    context: js.Any,
    forceUpdate: /* repeated */ js.Any => js.Any,
    props: js.Any,
    refs: js.Any,
    render: () => ReactNodeLike,
    setState: /* repeated */ js.Any => js.Any,
    state: js.Any
  ): ReactComponentLike = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = js.Any.fromFunction1(forceUpdate), props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactComponentLike]
  }
  @scala.inline
  implicit class ReactComponentLikeOps[Self <: ReactComponentLike] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceUpdate(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: () => ReactNodeLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetState(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

