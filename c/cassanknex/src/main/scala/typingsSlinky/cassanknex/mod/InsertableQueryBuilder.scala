package typingsSlinky.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertableQueryBuilder extends js.Object {
  def ifNotExists(): this.type = js.native
  def into(table: String): this.type = js.native
}

object InsertableQueryBuilder {
  @scala.inline
  def apply(ifNotExists: () => InsertableQueryBuilder, into: String => InsertableQueryBuilder): InsertableQueryBuilder = {
    val __obj = js.Dynamic.literal(ifNotExists = js.Any.fromFunction0(ifNotExists), into = js.Any.fromFunction1(into))
    __obj.asInstanceOf[InsertableQueryBuilder]
  }
  @scala.inline
  implicit class InsertableQueryBuilderOps[Self <: InsertableQueryBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfNotExists(value: () => InsertableQueryBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifNotExists")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInto(value: String => InsertableQueryBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("into")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

