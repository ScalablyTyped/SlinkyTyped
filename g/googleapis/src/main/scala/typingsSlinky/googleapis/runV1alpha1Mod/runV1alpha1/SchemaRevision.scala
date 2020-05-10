package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Revision is an immutable snapshot of code and configuration.  A revision
  * references a container image. Revisions are created by updates to a
  * Configuration.  Cloud Run does not currently support referencing a build
  * that is responsible for materializing the container image from source.  See
  * also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#revision
  */
@js.native
trait SchemaRevision extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of this resource, in this case &quot;Revision&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Revision, including name, namespace,
    * labels, and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Revision (from the client).
    */
  var spec: js.UndefOr[SchemaRevisionSpec] = js.native
  /**
    * Status communicates the observed state of the Revision (from the
    * controller).
    */
  var status: js.UndefOr[SchemaRevisionStatus] = js.native
}

object SchemaRevision {
  @scala.inline
  def apply(): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevision]
  }
  @scala.inline
  implicit class SchemaRevisionOps[Self <: SchemaRevision] (val x: Self) extends AnyVal {
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
    def withSpec(value: SchemaRevisionSpec): Self = {
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
    def withStatus(value: SchemaRevisionStatus): Self = {
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

