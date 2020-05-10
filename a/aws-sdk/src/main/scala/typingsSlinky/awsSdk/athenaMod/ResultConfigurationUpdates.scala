package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultConfigurationUpdates extends js.Object {
  /**
    * The encryption configuration for the query results.
    */
  var EncryptionConfiguration: js.UndefOr[typingsSlinky.awsSdk.athenaMod.EncryptionConfiguration] = js.native
  /**
    * The location in Amazon S3 where your query results are stored, such as s3://path/to/query/bucket/. For more information, see Query Results If workgroup settings override client-side settings, then the query uses the location for the query results and the encryption configuration that are specified for the workgroup. The "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var OutputLocation: js.UndefOr[String] = js.native
  /**
    * If set to "true", indicates that the previously-specified encryption configuration (also known as the client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.native
  /**
    * If set to "true", indicates that the previously-specified query results location (also known as a client-side setting) for queries in this workgroup should be ignored and set to null. If set to "false" or not set, and a value is present in the OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation in the workgroup's ResultConfiguration will be updated with the new value. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var RemoveOutputLocation: js.UndefOr[BoxedBoolean] = js.native
}

object ResultConfigurationUpdates {
  @scala.inline
  def apply(): ResultConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultConfigurationUpdates]
  }
  @scala.inline
  implicit class ResultConfigurationUpdatesOps[Self <: ResultConfigurationUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionConfiguration(value: EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEncryptionConfiguration(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveEncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOutputLocation(value: BoxedBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveOutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOutputLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveOutputLocation")(js.undefined)
        ret
    }
  }
  
}

