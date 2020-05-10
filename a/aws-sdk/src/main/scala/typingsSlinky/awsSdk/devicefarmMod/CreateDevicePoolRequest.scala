package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDevicePoolRequest extends js.Object {
  /**
    * The device pool's description.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The number of devices that Device Farm can add to your device pool. Device Farm adds devices that are available and meet the criteria that you assign for the rules parameter. Depending on how many devices meet these constraints, your device pool might contain fewer devices than the value for this parameter. By specifying the maximum number of devices, you can control the costs that you incur by running tests.
    */
  var maxDevices: js.UndefOr[Integer] = js.native
  /**
    * The device pool's name.
    */
  var name: Name = js.native
  /**
    * The ARN of the project for the device pool.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * The device pool's rules.
    */
  var rules: Rules = js.native
}

object CreateDevicePoolRequest {
  @scala.inline
  def apply(name: Name, projectArn: AmazonResourceName, rules: Rules): CreateDevicePoolRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevicePoolRequest]
  }
  @scala.inline
  implicit class CreateDevicePoolRequestOps[Self <: CreateDevicePoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: Rules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDevices(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDevices")(js.undefined)
        ret
    }
  }
  
}

