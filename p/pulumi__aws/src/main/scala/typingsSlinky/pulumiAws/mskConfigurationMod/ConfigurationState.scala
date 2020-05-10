package typingsSlinky.pulumiAws.mskConfigurationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: js.UndefOr[Input[Double]] = js.native
  /**
    * Name of the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: js.UndefOr[Input[String]] = js.native
}

object ConfigurationState {
  @scala.inline
  def apply(): ConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationState]
  }
  @scala.inline
  implicit class ConfigurationStateOps[Self <: ConfigurationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
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
    def withKafkaVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKafkaVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kafkaVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestRevision(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRevision")(js.undefined)
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
    @scala.inline
    def withServerProperties(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverProperties")(js.undefined)
        ret
    }
  }
  
}

