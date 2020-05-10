package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetNamedQueryOutput extends js.Object {
  /**
    * Information about the named query IDs submitted.
    */
  var NamedQueries: js.UndefOr[NamedQueryList] = js.native
  /**
    * Information about provided query IDs.
    */
  var UnprocessedNamedQueryIds: js.UndefOr[UnprocessedNamedQueryIdList] = js.native
}

object BatchGetNamedQueryOutput {
  @scala.inline
  def apply(): BatchGetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetNamedQueryOutput]
  }
  @scala.inline
  implicit class BatchGetNamedQueryOutputOps[Self <: BatchGetNamedQueryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedQueries(value: NamedQueryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedQueries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueries")(js.undefined)
        ret
    }
    @scala.inline
    def withUnprocessedNamedQueryIds(value: UnprocessedNamedQueryIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedNamedQueryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedNamedQueryIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedNamedQueryIds")(js.undefined)
        ret
    }
  }
  
}

