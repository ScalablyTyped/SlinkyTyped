package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTablesResponse extends js.Object {
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of the requested Table objects. The SearchTables response returns only the tables that you have access to.
    */
  var TableList: js.UndefOr[typingsSlinky.awsSdk.glueMod.TableList] = js.native
}

object SearchTablesResponse {
  @scala.inline
  def apply(): SearchTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTablesResponse]
  }
  @scala.inline
  implicit class SearchTablesResponseOps[Self <: SearchTablesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTableList(value: TableList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableList")(js.undefined)
        ret
    }
  }
  
}

