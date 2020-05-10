package typingsSlinky.popmotion.chainableMod

import typingsSlinky.popmotion.chainableTypesMod.Predicate
import typingsSlinky.popmotion.chainableTypesMod.Props
import typingsSlinky.popmotion.observerTypesMod.Middleware
import typingsSlinky.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chainable[T] extends js.Object {
  var props: Props = js.native
  def applyMiddleware(middleware: Middleware): T = js.native
  def create(props: Props): T = js.native
  def filter(predicate: Predicate): T = js.native
  def pipe(funcs: Update*): T = js.native
  def `while`(predicate: Predicate): T = js.native
}

object Chainable {
  @scala.inline
  def apply[T](
    applyMiddleware: Middleware => T,
    create: Props => T,
    filter: Predicate => T,
    pipe: /* repeated */ Update => T,
    props: Props,
    `while`: Predicate => T
  ): Chainable[T] = {
    val __obj = js.Dynamic.literal(applyMiddleware = js.Any.fromFunction1(applyMiddleware), create = js.Any.fromFunction1(create), filter = js.Any.fromFunction1(filter), pipe = js.Any.fromFunction1(pipe), props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("while")(js.Any.fromFunction1(`while`))
    __obj.asInstanceOf[Chainable[T]]
  }
  @scala.inline
  implicit class ChainableOps[Self[t] <: Chainable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withApplyMiddleware(value: Middleware => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMiddleware")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: Props => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: Predicate => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPipe(value: /* repeated */ Update => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProps(value: Props): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhile(value: Predicate => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("while")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

