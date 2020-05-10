package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationRequest extends js.Object {
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * 
    The versions of Apache Kafka with which you can use this MSK configuration.
    
    */
  var KafkaVersions: listOfString = js.native
  /**
    * 
    The name of the configuration.
    
    */
  var Name: string = js.native
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: _Blob = js.native
}

object CreateConfigurationRequest {
  @scala.inline
  def apply(KafkaVersions: listOfString, Name: string, ServerProperties: _Blob): CreateConfigurationRequest = {
    val __obj = js.Dynamic.literal(KafkaVersions = KafkaVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServerProperties = ServerProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationRequest]
  }
  @scala.inline
  implicit class CreateConfigurationRequestOps[Self <: CreateConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKafkaVersions(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
  }
  
}

