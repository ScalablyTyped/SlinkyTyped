package typingsSlinky.pulumiKubernetes.yamlYamlMod

import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigFileOpts extends js.Object {
  /** Path or a URL that uniquely identifies a file. */
  var file: js.UndefOr[String] = js.native
  /**
    * An optional prefix for the auto-generated resource names.
    * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
    */
  var resourcePrefix: js.UndefOr[String] = js.native
  /**
    * A set of transformations to apply to Kubernetes resource definitions before registering
    * with engine.
    *
    * @example
    * ```typescript
    * transformations: [
    * (obj: any, opts: pulumi.CustomResourceOptions) => {
    *        if (obj.kind === "Deployment" && obj.metadata.name == "cert-manager") {
    *            opts.aliases = [
    *                "urn:pulumi:dev::example::kubernetes:yaml:ConfigFile$kubernetes:apps/v1beta1:Deployment::default/cert-manager",
    *            ];
    *        }
    *        if (obj.kind === "Deployment" && obj.metadata.name == "cert-manager-cainjector") {
    *            opts.aliases = [
    *                "urn:pulumi:dev::example::kubernetes:yaml:ConfigFile$kubernetes:apps/v1beta1:Deployment::default/cert-manager-cainjector",
    *            ];
    *        }
    *    },
    * ]
    * ```
    */
  var transformations: js.UndefOr[js.Array[js.Function2[/* o */ _, /* opts */ CustomResourceOptions, Unit]]] = js.native
}

object ConfigFileOpts {
  @scala.inline
  def apply(): ConfigFileOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFileOpts]
  }
  @scala.inline
  implicit class ConfigFileOptsOps[Self <: ConfigFileOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
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
  }
  
}

