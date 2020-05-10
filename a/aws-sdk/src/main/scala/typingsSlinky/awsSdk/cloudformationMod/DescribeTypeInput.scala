package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTypeInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  /**
    * The kind of type.  Currently the only valid value is RESOURCE. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TypeName] = js.native
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered. If you specify a VersionId, DescribeType returns information about that specific type version. Otherwise, it returns information about the default type version.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.native
}

object DescribeTypeInput {
  @scala.inline
  def apply(): DescribeTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeInput]
  }
  @scala.inline
  implicit class DescribeTypeInputOps[Self <: DescribeTypeInput] (val x: Self) extends AnyVal {
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
    def withVersionId(value: TypeVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionId")(js.undefined)
        ret
    }
  }
  
}

