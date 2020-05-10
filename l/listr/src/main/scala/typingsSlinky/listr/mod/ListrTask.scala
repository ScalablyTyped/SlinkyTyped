package typingsSlinky.listr.mod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrTask[Ctx] extends js.Object {
  var enabled: js.UndefOr[
    js.Function1[/* ctx */ Ctx, Boolean | js.Promise[Boolean] | Observable_[Boolean]]
  ] = js.native
  var skip: js.UndefOr[js.Function1[/* ctx */ Ctx, Unit | Boolean | String | js.Promise[Boolean]]] = js.native
  var title: String = js.native
  def task(ctx: Ctx, task: ListrTaskWrapper[Ctx]): Unit | ListrTaskResult[Ctx] = js.native
}

object ListrTask {
  @scala.inline
  def apply[Ctx](task: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx], title: String): ListrTask[Ctx] = {
    val __obj = js.Dynamic.literal(task = js.Any.fromFunction2(task), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrTask[Ctx]]
  }
  @scala.inline
  implicit class ListrTaskOps[Self[ctx] <: ListrTask[ctx], Ctx] (val x: Self[Ctx]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Ctx] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Ctx]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Ctx] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Ctx] with Other]
    @scala.inline
    def withTask(value: (Ctx, ListrTaskWrapper[Ctx]) => Unit | ListrTaskResult[Ctx]): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: /* ctx */ Ctx => Boolean | js.Promise[Boolean] | Observable_[Boolean]): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnabled: Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: /* ctx */ Ctx => Unit | Boolean | String | js.Promise[Boolean]): Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkip: Self[Ctx] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
  }
  
}

