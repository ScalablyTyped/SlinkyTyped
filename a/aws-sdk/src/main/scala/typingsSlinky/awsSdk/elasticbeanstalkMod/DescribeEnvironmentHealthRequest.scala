package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentHealthRequest extends js.Object {
  /**
    * Specify the response elements to return. To retrieve all attributes, set to All. If no attribute names are specified, returns the name of the environment.
    */
  var AttributeNames: js.UndefOr[EnvironmentHealthAttributes] = js.native
  /**
    * Specify the environment by ID. You must specify either this or an EnvironmentName, or both.
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * Specify the environment by name. You must specify either this or an EnvironmentName, or both.
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
}

object DescribeEnvironmentHealthRequest {
  @scala.inline
  def apply(): DescribeEnvironmentHealthRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentHealthRequest]
  }
  @scala.inline
  implicit class DescribeEnvironmentHealthRequestOps[Self <: DescribeEnvironmentHealthRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeNames(value: EnvironmentHealthAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentId(value: EnvironmentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentName(value: EnvironmentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentName")(js.undefined)
        ret
    }
  }
  
}

