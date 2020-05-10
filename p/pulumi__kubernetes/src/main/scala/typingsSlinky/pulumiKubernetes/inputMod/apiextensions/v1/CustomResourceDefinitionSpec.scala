package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
@js.native
trait CustomResourceDefinitionSpec extends js.Object {
  /**
    * conversion defines conversion settings for the CRD.
    */
  var conversion: js.UndefOr[Input[CustomResourceConversion]] = js.native
  /**
    * group is the API group of the defined custom resource. The custom resources are served
    * under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form
    * `<names.plural>.<group>`).
    */
  var group: Input[String] = js.native
  /**
    * names specify the resource and kind names for the custom resource.
    */
  var names: Input[CustomResourceDefinitionNames] = js.native
  /**
    * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI
    * schema should be preserved when persisting to storage. apiVersion, kind, metadata and known
    * fields inside metadata are always preserved. This field is deprecated in favor of setting
    * `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See
    * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
    * for details.
    */
  var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.native
  /**
    * scope indicates whether the defined custom resource is cluster- or namespace-scoped.
    * Allowed values are `Cluster` and `Namespaced`.
    */
  var scope: Input[String] = js.native
  /**
    * versions is the list of all API versions of the defined custom resource. Version names are
    * used to compute the order in which served versions are listed in API discovery. If the
    * version string is "kube-like", it will sort above non "kube-like" version strings, which
    * are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by
    * a number (the major version), then optionally the string "alpha" or "beta" and another
    * number (the minor version). These are sorted first by GA > beta > alpha (where GA is a
    * version with no suffix such as beta or alpha), and then by comparing major version, then
    * minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3,
    * v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: Input[js.Array[Input[CustomResourceDefinitionVersion]]] = js.native
}

object CustomResourceDefinitionSpec {
  @scala.inline
  def apply(
    group: Input[String],
    names: Input[CustomResourceDefinitionNames],
    scope: Input[String],
    versions: Input[js.Array[Input[CustomResourceDefinitionVersion]]]
  ): CustomResourceDefinitionSpec = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionSpec]
  }
  @scala.inline
  implicit class CustomResourceDefinitionSpecOps[Self <: CustomResourceDefinitionSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Input[CustomResourceDefinitionNames]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersions(value: Input[js.Array[Input[CustomResourceDefinitionVersion]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversion(value: Input[CustomResourceConversion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversion")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveUnknownFields(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveUnknownFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveUnknownFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveUnknownFields")(js.undefined)
        ret
    }
  }
  
}

