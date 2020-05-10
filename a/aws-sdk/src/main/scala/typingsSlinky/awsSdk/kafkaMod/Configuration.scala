package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: string = js.native
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.Date = js.native
  /**
    * 
    The description of the configuration.
    
    */
  var Description: string = js.native
  /**
    * 
    An array of the versions of Apache Kafka with which you can use this MSK configuration. You can use this configuration for an MSK cluster only if the Apache Kafka version specified for the cluster appears in this array.
    
    */
  var KafkaVersions: listOfString = js.native
  /**
    * 
    Latest revision of the configuration.
    
    */
  var LatestRevision: ConfigurationRevision = js.native
  /**
    * 
    The name of the configuration.
    
    */
  var Name: string = js.native
}

object Configuration {
  @scala.inline
  def apply(
    Arn: string,
    CreationTime: js.Date,
    Description: string,
    KafkaVersions: listOfString,
    LatestRevision: ConfigurationRevision,
    Name: string
  ): Configuration = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], KafkaVersions = KafkaVersions.asInstanceOf[js.Any], LatestRevision = LatestRevision.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKafkaVersions(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KafkaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestRevision(value: ConfigurationRevision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

