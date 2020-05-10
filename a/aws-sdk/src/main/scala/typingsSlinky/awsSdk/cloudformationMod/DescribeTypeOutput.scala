package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTypeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  /**
    * The ID of the default version of the type. The default version is used when the type version is not specified. To set the default version of a type, use  SetTypeDefaultVersion . 
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.native
  /**
    * The deprecation status of the type. Valid values include:    LIVE: The type is registered and can be used in CloudFormation operations, dependent on its provisioning behavior and visibility scope.    DEPRECATED: The type has been deregistered and can no longer be used in CloudFormation operations.   
    */
  var DeprecatedStatus: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DeprecatedStatus] = js.native
  /**
    * The description of the registered type.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The URL of a page providing detailed documentation for this type.
    */
  var DocumentationUrl: js.UndefOr[OptionalSecureUrl] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role used to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an  IAM execution role  that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * When the specified type version was registered.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.native
  /**
    * Contains logging configuration information for a type.
    */
  var LoggingConfig: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.LoggingConfig] = js.native
  /**
    * The provisioning behavior of the type. AWS CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted. Valid values include:    FULLY_MUTABLE: The type includes an update handler to process updates to the type during stack update operations.    IMMUTABLE: The type does not include an update handler, so the type cannot be updated and must instead be replaced during stack update operations.    NON_PROVISIONABLE: The type does not include all of the following handlers, and therefore cannot actually be provisioned.   create   read   delete    
    */
  var ProvisioningType: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ProvisioningType] = js.native
  /**
    * The schema that defines the type. For more information on type schemas, see Resource Provider Schema in the CloudFormation CLI User Guide.
    */
  var Schema: js.UndefOr[TypeSchema] = js.native
  /**
    * The URL of the source code for the type.
    */
  var SourceUrl: js.UndefOr[OptionalSecureUrl] = js.native
  /**
    * When the specified type version was registered.
    */
  var TimeCreated: js.UndefOr[js.Date] = js.native
  /**
    * The kind of type.  Currently the only valid value is RESOURCE.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the registered type.
    */
  var TypeName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeName] = js.native
  /**
    * The scope at which the type is visible and usable in CloudFormation operations. Valid values include:    PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.    PUBLIC: The type is publically visible and usable within any Amazon account.  
    */
  var Visibility: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Visibility] = js.native
}

object DescribeTypeOutput {
  @scala.inline
  def apply(): DescribeTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeOutput]
  }
  @scala.inline
  implicit class DescribeTypeOutputOps[Self <: DescribeTypeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: TypeArn): Self = {
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
    def withDefaultVersionId(value: TypeVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedStatus(value: DeprecatedStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeprecatedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeprecatedStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withDocumentationUrl(value: OptionalSecureUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfig(value: LoggingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningType(value: ProvisioningType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningType")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: TypeSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUrl(value: OptionalSecureUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: RegistryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeName(value: TypeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: Visibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(js.undefined)
        ret
    }
  }
  
}

