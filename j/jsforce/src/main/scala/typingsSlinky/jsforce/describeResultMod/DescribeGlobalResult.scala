package typingsSlinky.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalResult extends js.Object {
  var encoding: String = js.native
  var maxBatchSize: Double = js.native
  var sobjects: js.Array[DescribeGlobalSObjectResult] = js.native
}

object DescribeGlobalResult {
  @scala.inline
  def apply(encoding: String, maxBatchSize: Double, sobjects: js.Array[DescribeGlobalSObjectResult]): DescribeGlobalResult = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], maxBatchSize = maxBatchSize.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalResult]
  }
  @scala.inline
  implicit class DescribeGlobalResultOps[Self <: DescribeGlobalResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSobjects(value: js.Array[DescribeGlobalSObjectResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sobjects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

