package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticIpsResult extends js.Object {
  /**
    * An ElasticIps object that describes the specified Elastic IP addresses.
    */
  var ElasticIps: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ElasticIps] = js.native
}

object DescribeElasticIpsResult {
  @scala.inline
  def apply(): DescribeElasticIpsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticIpsResult]
  }
  @scala.inline
  implicit class DescribeElasticIpsResultOps[Self <: DescribeElasticIpsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElasticIps(value: ElasticIps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIps")(js.undefined)
        ret
    }
  }
  
}

