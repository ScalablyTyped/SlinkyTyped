package typingsSlinky.pulumiAws.getConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: String = js.native
  /**
    * Description of the configuration.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.Array[String] = js.native
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: Double = js.native
  val name: String = js.native
  /**
    * Contents of the server.properties file.
    */
  val serverProperties: String = js.native
}

object GetConfigurationResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    id: String,
    kafkaVersions: js.Array[String],
    latestRevision: Double,
    name: String,
    serverProperties: String
  ): GetConfigurationResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kafkaVersions = kafkaVersions.asInstanceOf[js.Any], latestRevision = latestRevision.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationResult]
  }
  @scala.inline
  implicit class GetConfigurationResultOps[Self <: GetConfigurationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKafkaVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestRevision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

