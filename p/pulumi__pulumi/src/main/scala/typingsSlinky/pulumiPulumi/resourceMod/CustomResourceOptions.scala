package typingsSlinky.pulumiPulumi.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomResourceOptions extends ResourceOptions {
  /**
    * The names of outputs for this resource that should be treated as secrets. This augments the list that
    * the resource provider and pulumi engine already determine based on inputs to your resource. It can be used
    * to mark certain ouputs as a secrets on a per resource basis.
    */
  var additionalSecretOutputs: js.UndefOr[js.Array[String]] = js.native
  /**
    * When set to true, deleteBeforeReplace indicates that this resource should be deleted before its replacement
    * is created when replacement is necessary.
    */
  var deleteBeforeReplace: js.UndefOr[Boolean] = js.native
  /**
    * When provided with a resource ID, import indicates that this resource's provider should import its state from
    * the cloud resource with the given ID. The inputs to the resource's constructor must align with the resource's
    * current state. Once a resource has been imported, the import property must be removed from the resource's
    * options.
    */
  var `import`: js.UndefOr[ID] = js.native
}

object CustomResourceOptions {
  @scala.inline
  def apply(): CustomResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceOptions]
  }
  @scala.inline
  implicit class CustomResourceOptionsOps[Self <: CustomResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalSecretOutputs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSecretOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalSecretOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalSecretOutputs")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteBeforeReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBeforeReplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteBeforeReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBeforeReplace")(js.undefined)
        ret
    }
    @scala.inline
    def withImport(value: ID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("import")(js.undefined)
        ret
    }
  }
  
}

