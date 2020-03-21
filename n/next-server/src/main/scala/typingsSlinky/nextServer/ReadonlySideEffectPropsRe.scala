package typingsSlinky.nextServer

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.sideEffectMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> & std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlySideEffectPropsRe extends js.Object {
  val children: js.UndefOr[TagMod[Any]] = js.undefined
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  val inAmpMode: js.UndefOr[Boolean] = js.undefined
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ js.Any, State]
}

object ReadonlySideEffectPropsRe {
  @scala.inline
  def apply(
    reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State,
    children: TagMod[Any] = null,
    handleStateChange: /* state */ State => Unit = null,
    inAmpMode: js.UndefOr[Boolean] = js.undefined
  ): ReadonlySideEffectPropsRe = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (handleStateChange != null) __obj.updateDynamic("handleStateChange")(js.Any.fromFunction1(handleStateChange))
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySideEffectPropsRe]
  }
}

