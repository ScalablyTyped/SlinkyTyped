package typingsSlinky.pulumiAws.mskConfigurationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationArgs extends js.Object {
  /**
    * Description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: Input[js.Array[Input[String]]] = js.native
  /**
    * Name of the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: Input[String] = js.native
}

object ConfigurationArgs {
  @scala.inline
  def apply(kafkaVersions: Input[js.Array[Input[String]]], serverProperties: Input[String]): ConfigurationArgs = {
    val __obj = js.Dynamic.literal(kafkaVersions = kafkaVersions.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationArgs]
  }
  @scala.inline
  implicit class ConfigurationArgsOps[Self <: ConfigurationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKafkaVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerProperties(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
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
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

