package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRevisionResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * 
    The revision number.
    
    */
  var Revision: js.UndefOr[long] = js.native
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: js.UndefOr[_Blob] = js.native
}

object DescribeConfigurationRevisionResponse {
  @scala.inline
  def apply(): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationRevisionResponseOps[Self <: DescribeConfigurationRevisionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revision")(js.undefined)
        ret
    }
    @scala.inline
    def withServerPropertiesUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerProperties(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerProperties")(js.undefined)
        ret
    }
  }
  
}

