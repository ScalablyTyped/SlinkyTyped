package typingsSlinky.popmotion.multiMod

import typingsSlinky.popmotion.typesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiProps[A, T, V, I] extends js.Object {
  def getCount(actions: A): Double = js.native
  def getFirst(subs: T): ColdSubscription = js.native
  def getOutput(): V = js.native
  def mapApi(subs: T, methodName: String): js.Function1[/* repeated */ js.Any, V] = js.native
  def setProp(output: V, name: I, value: js.Any): js.Any = js.native
  def startActions(actions: A, starter: ActionStarter[I]): T = js.native
}

object MultiProps {
  @scala.inline
  def apply[A, T, V, I](
    getCount: A => Double,
    getFirst: T => ColdSubscription,
    getOutput: () => V,
    mapApi: (T, String) => js.Function1[/* repeated */ js.Any, V],
    setProp: (V, I, js.Any) => js.Any,
    startActions: (A, ActionStarter[I]) => T
  ): MultiProps[A, T, V, I] = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction1(getCount), getFirst = js.Any.fromFunction1(getFirst), getOutput = js.Any.fromFunction0(getOutput), mapApi = js.Any.fromFunction2(mapApi), setProp = js.Any.fromFunction3(setProp), startActions = js.Any.fromFunction2(startActions))
    __obj.asInstanceOf[MultiProps[A, T, V, I]]
  }
  @scala.inline
  implicit class MultiPropsOps[Self[a, t, v, i] <: MultiProps[a, t, v, i], A, T, V, I] (val x: Self[A, T, V, I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, T, V, I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, T, V, I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, T, V, I]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, T, V, I]) with Other]
    @scala.inline
    def withGetCount(value: A => Double): Self[A, T, V, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFirst(value: T => ColdSubscription): Self[A, T, V, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirst")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOutput(value: () => V): Self[A, T, V, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutput")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMapApi(value: (T, String) => js.Function1[/* repeated */ js.Any, V]): Self[A, T, V, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapApi")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetProp(value: (V, I, js.Any) => js.Any): Self[A, T, V, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProp")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStartActions(value: (A, ActionStarter[I]) => T): Self[A, T, V, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startActions")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

