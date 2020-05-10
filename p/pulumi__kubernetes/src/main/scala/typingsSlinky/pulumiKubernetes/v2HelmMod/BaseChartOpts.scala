package typingsSlinky.pulumiKubernetes.v2HelmMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Inputs
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChartOpts extends js.Object {
  /**
    * The optional kubernetes api versions used for Capabilities.APIVersions.
    */
  var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The optional namespace to install chart resources into.
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.native
  /**
    * Optional array of transformations to apply to resources that will be created by this chart prior to
    * creation. Allows customization of the chart behaviour without directly modifying the chart itself.
    *
    * @example
    * ```typescript
    * transformations: [
    * (obj: any, opts: pulumi.CustomResourceOptions) => {
    *        if (obj.kind === "Deployment" && obj.metadata.name == "cert-manager") {
    *            opts.aliases = [
    *                "urn:pulumi:dev::example::kubernetes:helm.sh/v2:Chart$kubernetes:apps/v1beta1:Deployment::default/cert-manager",
    *            ];
    *        }
    *
    *        if (obj.metadata) {
    *            obj.metadata.namespace = namespaceName;
    *        } else {
    *            obj.metadata = {namespace: namespaceName};
    *        }
    *    },
    * ]
    * ```
    */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.native
  /**
    * Overrides for chart values.
    */
  var values: js.UndefOr[Inputs] = js.native
}

object BaseChartOpts {
  @scala.inline
  def apply(): BaseChartOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartOpts]
  }
  @scala.inline
  implicit class BaseChartOptsOps[Self <: BaseChartOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformations(value: js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: Inputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

