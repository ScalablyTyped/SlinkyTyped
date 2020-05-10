package typingsSlinky.nextServer

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.sideEffectMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> & std.Readonly<{  children ? :react.react.ReactNode}> */
@js.native
trait ReadonlySideEffectPropsRe extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.native
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
  val inAmpMode: js.UndefOr[Boolean] = js.native
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ js.Any, State] = js.native
}

object ReadonlySideEffectPropsRe {
  @scala.inline
  def apply(reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): ReadonlySideEffectPropsRe = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[ReadonlySideEffectPropsRe]
  }
  @scala.inline
  implicit class ReadonlySideEffectPropsReOps[Self <: ReadonlySideEffectPropsRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReduceComponentsToState(value: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduceComponentsToState")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleStateChange(value: /* state */ State => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withInAmpMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInAmpMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inAmpMode")(js.undefined)
        ret
    }
  }
  
}

