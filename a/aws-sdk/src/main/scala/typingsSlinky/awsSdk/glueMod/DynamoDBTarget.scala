package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBTarget extends js.Object {
  /**
    * The name of the DynamoDB table to crawl.
    */
  var Path: js.UndefOr[typingsSlinky.awsSdk.glueMod.Path] = js.native
}

object DynamoDBTarget {
  @scala.inline
  def apply(): DynamoDBTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamoDBTarget]
  }
  @scala.inline
  implicit class DynamoDBTargetOps[Self <: DynamoDBTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
  }
  
}

