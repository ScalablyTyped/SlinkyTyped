package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a cloud resource.
  */
@js.native
trait SchemaResource extends js.Object {
  /**
    * The content of the resource, in which some sensitive fields are scrubbed
    * away and may not be present.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The URL of the discovery document containing the resource&#39;s JSON
    * schema. For example:
    * `&quot;https://www.googleapis.com/discovery/v1/apis/compute/v1/rest&quot;`.
    * It will be left unspecified for resources without a discovery-based API,
    * such as Cloud Bigtable.
    */
  var discoveryDocumentUri: js.UndefOr[String] = js.native
  /**
    * The JSON schema name listed in the discovery document. Example:
    * &quot;Project&quot;. It will be left unspecified for resources (such as
    * Cloud Bigtable) without a discovery-based API.
    */
  var discoveryName: js.UndefOr[String] = js.native
  /**
    * The full name of the immediate parent of this resource. See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more information.  For GCP assets, it is the parent resource defined
    * in the [Cloud IAM policy
    * hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy).
    * For example:
    * `&quot;//cloudresourcemanager.googleapis.com/projects/my_project_123&quot;`.
    * For third-party assets, it is up to the users to define.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The REST URL for accessing the resource. An HTTP GET operation using this
    * URL returns the resource itself. Example:
    * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123`.
    * It will be left unspecified for resources without a REST API.
    */
  var resourceUrl: js.UndefOr[String] = js.native
  /**
    * The API version. Example: &quot;v1&quot;.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaResource {
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  @scala.inline
  implicit class SchemaResourceOps[Self <: SchemaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscoveryDocumentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryDocumentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveryDocumentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryDocumentUri")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscoveryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryName")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
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

