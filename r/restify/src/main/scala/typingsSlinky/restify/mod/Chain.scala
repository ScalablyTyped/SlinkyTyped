package typingsSlinky.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain extends js.Object {
  /** Prevents calling next multiple times */
  var onceNext: Boolean = js.native
  /** Throws error when next() is called more than once, enables onceNext option */
  var strictNext: Boolean = js.native
  /** Utilize the given middleware `handler` */
  def add(handler: RequestHandler): Unit = js.native
  /** Returns the number of handlers */
  def count(): Double = js.native
  /** Get handlers of a chain instance */
  def getHandlers(): js.Array[RequestHandler] = js.native
  /** Handle server requests, punting them down the middleware stack. */
  def run(req: Request, res: Response, done: js.Function0[_]): Unit = js.native
}

object Chain {
  @scala.inline
  def apply(
    add: RequestHandler => Unit,
    count: () => Double,
    getHandlers: () => js.Array[RequestHandler],
    onceNext: Boolean,
    run: (Request, Response, js.Function0[_]) => Unit,
    strictNext: Boolean
  ): Chain = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), count = js.Any.fromFunction0(count), getHandlers = js.Any.fromFunction0(getHandlers), onceNext = onceNext.asInstanceOf[js.Any], run = js.Any.fromFunction3(run), strictNext = strictNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  @scala.inline
  implicit class ChainOps[Self <: Chain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: RequestHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHandlers(value: () => js.Array[RequestHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHandlers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnceNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: (Request, Response, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStrictNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

