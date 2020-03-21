package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeVersionSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type version.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  /**
    * The description of the type version.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * When the version was registered.
    */
  var TimeCreated: js.UndefOr[js.Date] = js.native
  /**
    * The kind of type.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type.
    */
  var TypeName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeName] = js.native
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.native
}

object TypeVersionSummary {
  @scala.inline
  def apply(
    Arn: TypeArn = null,
    Description: Description = null,
    TimeCreated: js.Date = null,
    Type: RegistryType = null,
    TypeName: TypeName = null,
    VersionId: TypeVersionId = null
  ): TypeVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (TimeCreated != null) __obj.updateDynamic("TimeCreated")(TimeCreated.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeVersionSummary]
  }
}

