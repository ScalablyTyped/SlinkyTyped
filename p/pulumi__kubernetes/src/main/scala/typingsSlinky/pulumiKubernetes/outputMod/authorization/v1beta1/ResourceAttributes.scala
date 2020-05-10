package typingsSlinky.pulumiKubernetes.outputMod.authorization.v1beta1

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
  val group: String = js.native
  /**
    * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
    * (empty) means all.
    */
  val name: String = js.native
  /**
    * Namespace is the namespace of the action being requested.  Currently, there is no
    * distinction between no namespace and all namespaces "" (empty) is defaulted for
    * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
    * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
    */
  val namespace: String = js.native
  /**
    * Resource is one of the existing resource types.  "*" means all.
    */
  val resource: String = js.native
  /**
    * Subresource is one of the existing resource types.  "" means none.
    */
  val subresource: String = js.native
  /**
    * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
    * proxy.  "*" means all.
    */
  val verb: String = js.native
  /**
    * Version is the API Version of the Resource.  "*" means all.
    */
  val version: String = js.native
}

object ResourceAttributes {
  @scala.inline
  def apply(
    group: String,
    name: String,
    namespace: String,
    resource: String,
    subresource: String,
    verb: String,
    version: String
  ): ResourceAttributes = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], subresource = subresource.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttributes]
  }
  @scala.inline
  implicit class ResourceAttributesOps[Self <: ResourceAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubresource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subresource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

