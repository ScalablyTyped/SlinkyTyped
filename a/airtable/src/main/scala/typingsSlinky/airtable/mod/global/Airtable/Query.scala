package typingsSlinky.airtable.mod.global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[TFields /* <: js.Object */] extends js.Object {
  def all(): js.Promise[Records[TFields]] = js.native
  def eachPage(pageCallback: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit]): js.Promise[Unit] = js.native
  def firstPage(): js.Promise[Records[TFields]] = js.native
}

object Query {
  @scala.inline
  def apply[TFields](
    all: () => js.Promise[Records[TFields]],
    eachPage: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit],
    firstPage: () => js.Promise[Records[TFields]]
  ): Query[TFields] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), eachPage = js.Any.fromFunction1(eachPage), firstPage = js.Any.fromFunction0(firstPage))
    __obj.asInstanceOf[Query[TFields]]
  }
  @scala.inline
  implicit class QueryOps[Self[tfields] <: Query[tfields], TFields] (val x: Self[TFields]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TFields] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TFields]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TFields] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TFields] with Other]
    @scala.inline
    def withAll(value: () => js.Promise[Records[TFields]]): Self[TFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEachPage(
      value: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit]
    ): Self[TFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachPage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstPage(value: () => js.Promise[Records[TFields]]): Self[TFields] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

