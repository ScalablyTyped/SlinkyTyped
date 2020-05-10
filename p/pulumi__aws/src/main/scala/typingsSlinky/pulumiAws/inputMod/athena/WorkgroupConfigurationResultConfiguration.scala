package typingsSlinky.pulumiAws.inputMod.athena

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupConfigurationResultConfiguration extends js.Object {
  /**
    * Configuration block with encryption settings. Documented below.
    */
  var encryptionConfiguration: js.UndefOr[Input[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]] = js.native
  /**
    * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
    */
  var outputLocation: js.UndefOr[Input[String]] = js.native
}

object WorkgroupConfigurationResultConfiguration {
  @scala.inline
  def apply(): WorkgroupConfigurationResultConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkgroupConfigurationResultConfiguration]
  }
  @scala.inline
  implicit class WorkgroupConfigurationResultConfigurationOps[Self <: WorkgroupConfigurationResultConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionConfiguration(value: Input[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputLocation")(js.undefined)
        ret
    }
  }
  
}

