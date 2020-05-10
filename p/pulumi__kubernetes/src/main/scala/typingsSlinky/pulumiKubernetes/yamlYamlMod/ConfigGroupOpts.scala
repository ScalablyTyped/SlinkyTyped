package typingsSlinky.pulumiKubernetes.yamlYamlMod

import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigGroupOpts extends js.Object {
  /** Set of paths or a URLs that uniquely identify files. */
  var files: js.UndefOr[js.Array[String] | String] = js.native
  /** JavaScript objects representing Kubernetes resources. */
  var objs: js.UndefOr[js.Array[_] | js.Any] = js.native
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
  /** YAML text containing Kubernetes resource definitions. */
  var yaml: js.UndefOr[js.Array[String] | String] = js.native
}

object ConfigGroupOpts {
  @scala.inline
  def apply(): ConfigGroupOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigGroupOpts]
  }
  @scala.inline
  implicit class ConfigGroupOptsOps[Self <: ConfigGroupOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withObjs(value: js.Array[_] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objs")(js.undefined)
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
    def withYaml(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(js.undefined)
        ret
    }
  }
  
}

