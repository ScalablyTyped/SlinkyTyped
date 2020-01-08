package typingsSlinky.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectParents extends js.Object {
  var MaxResults: js.UndefOr[NumberResults] = js.native
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
  var ObjectReference: typingsSlinky.awsDashSdk.clientsClouddirectoryMod.ObjectReference = js.native
}

object BatchListObjectParents {
  @scala.inline
  def apply(ObjectReference: ObjectReference, MaxResults: Int | Double = null, NextToken: NextToken = null): BatchListObjectParents = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectParents]
  }
}

