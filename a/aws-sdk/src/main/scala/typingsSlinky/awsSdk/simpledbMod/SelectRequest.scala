package typingsSlinky.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectRequest extends js.Object {
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  /**
    * A string informing Amazon SimpleDB where to start the next list of ItemNames.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The expression used to query the domain.
    */
  var SelectExpression: String = js.native
}

object SelectRequest {
  @scala.inline
  def apply(SelectExpression: String): SelectRequest = {
    val __obj = js.Dynamic.literal(SelectExpression = SelectExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRequest]
  }
  @scala.inline
  implicit class SelectRequestOps[Self <: SelectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsistentRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistentRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistentRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsistentRead")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

