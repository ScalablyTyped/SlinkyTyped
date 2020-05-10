package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
@js.native
trait CustomResourceDefinitionVersion extends js.Object {
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See
    * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
    * for details. If no columns are specified, a single column displaying the age of the custom
    * resource is used.
    */
  var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.native
  /**
    * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are
    * served under this version at `/apis/<group>/<version>/...` if `served` is true.
    */
  var name: Input[String] = js.native
  /**
    * schema describes the schema used for validation, pruning, and defaulting of this version of
    * the custom resource.
    */
  var schema: js.UndefOr[Input[CustomResourceValidation]] = js.native
  /**
    * served is a flag enabling/disabling this version from being served via REST APIs
    */
  var served: Input[Boolean] = js.native
  /**
    * storage indicates this version should be used when persisting custom resources to storage.
    * There must be exactly one version with storage=true.
    */
  var storage: Input[Boolean] = js.native
  /**
    * subresources specify what subresources this version of the defined custom resource have.
    */
  var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.native
}

object CustomResourceDefinitionVersion {
  @scala.inline
  def apply(name: Input[String], served: Input[Boolean], storage: Input[Boolean]): CustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], served = served.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionVersion]
  }
  @scala.inline
  implicit class CustomResourceDefinitionVersionOps[Self <: CustomResourceDefinitionVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServed(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("served")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalPrinterColumns(value: Input[js.Array[Input[CustomResourceColumnDefinition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalPrinterColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalPrinterColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalPrinterColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: Input[CustomResourceValidation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSubresources(value: Input[CustomResourceSubresources]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subresources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubresources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subresources")(js.undefined)
        ret
    }
  }
  
}

