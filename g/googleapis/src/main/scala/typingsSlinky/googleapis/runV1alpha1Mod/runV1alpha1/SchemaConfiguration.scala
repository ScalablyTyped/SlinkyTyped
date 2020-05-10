package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration represents the &quot;floating HEAD&quot; of a linear history
  * of Revisions, and optionally how the containers those revisions reference
  * are built. Users create new Revisions by updating the Configuration&#39;s
  * spec. The &quot;latest created&quot; revision&#39;s name is available under
  * status, as is the &quot;latest ready&quot; revision&#39;s name. See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#configuration
  */
@js.native
trait SchemaConfiguration extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of resource, in this case always &quot;Configuration&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Configuration, including name, namespace,
    * labels, and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Configuration (from the client).
    */
  var spec: js.UndefOr[SchemaConfigurationSpec] = js.native
  /**
    * Status communicates the observed state of the Configuration (from the
    * controller).
    */
  var status: js.UndefOr[SchemaConfigurationStatus] = js.native
}

object SchemaConfiguration {
  @scala.inline
  def apply(): SchemaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfiguration]
  }
  @scala.inline
  implicit class SchemaConfigurationOps[Self <: SchemaConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: SchemaConfigurationSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaConfigurationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

