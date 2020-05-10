package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceAttributes includes the authorization attributes available for resource requests to
  * the Authorizer interface
  */
@js.native
trait ResourceAttributes extends js.Object {
  /**
    * Group is the API Group of the Resource.  "*" means all.
    */
  var group: js.UndefOr[Input[String]] = js.native
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
    * (empty) means all.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no
    * distinction between no namespace and all namespaces "" (empty) is defaulted for
    * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
    * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  var namespace: js.UndefOr[Input[String]] = js.native
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  var resource: js.UndefOr[Input[String]] = js.native
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  var subresource: js.UndefOr[Input[String]] = js.native
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
    * proxy.  "*" means all.
    */
  var verb: js.UndefOr[Input[String]] = js.native
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  var version: js.UndefOr[Input[String]] = js.native
}

object ResourceAttributes {
  @scala.inline
  def apply(): ResourceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceAttributes]
  }
  @scala.inline
  implicit class ResourceAttributesOps[Self <: ResourceAttributes] (val x: Self) extends AnyVal {
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
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withResource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withSubresource(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subresource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubresource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subresource")(js.undefined)
        ret
    }
    @scala.inline
    def withVerb(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

