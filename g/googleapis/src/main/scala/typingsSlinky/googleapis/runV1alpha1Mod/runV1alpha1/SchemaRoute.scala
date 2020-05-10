package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Route is responsible for configuring ingress over a collection of
  * Revisions. Some of the Revisions a Route distributes traffic over may be
  * specified by referencing the Configuration responsible for creating them;
  * in these cases the Route is additionally responsible for monitoring the
  * Configuration for &quot;latest ready&quot; revision changes, and smoothly
  * rolling out latest revisions. See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#route
  * Cloud Run currently supports referencing a single Configuration to
  * automatically deploy the &quot;latest ready&quot; Revision from that
  * Configuration.
  */
@js.native
trait SchemaRoute extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of this resource, in this case always &quot;Route&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Route, including name, namespace, labels,
    * and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Route (from the client).
    */
  var spec: js.UndefOr[SchemaRouteSpec] = js.native
  /**
    * Status communicates the observed state of the Route (from the
    * controller).
    */
  var status: js.UndefOr[SchemaRouteStatus] = js.native
}

object SchemaRoute {
  @scala.inline
  def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  @scala.inline
  implicit class SchemaRouteOps[Self <: SchemaRoute] (val x: Self) extends AnyVal {
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
    def withSpec(value: SchemaRouteSpec): Self = {
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
    def withStatus(value: SchemaRouteStatus): Self = {
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

