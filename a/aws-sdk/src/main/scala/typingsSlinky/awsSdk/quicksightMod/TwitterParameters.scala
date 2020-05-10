package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterParameters extends js.Object {
  /**
    * Maximum number of rows to query Twitter.
    */
  var MaxRows: PositiveInteger = js.native
  /**
    * Twitter query string.
    */
  var Query: typingsSlinky.awsSdk.quicksightMod.Query = js.native
}

object TwitterParameters {
  @scala.inline
  def apply(MaxRows: PositiveInteger, Query: Query): TwitterParameters = {
    val __obj = js.Dynamic.literal(MaxRows = MaxRows.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterParameters]
  }
  @scala.inline
  implicit class TwitterParametersOps[Self <: TwitterParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRows(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

