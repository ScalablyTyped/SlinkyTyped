package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RouteSpec holds the desired state of the Route (from the client).
  */
@js.native
trait SchemaRouteSpec extends js.Object {
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * Traffic specifies how to distribute traffic over a collection of Knative
    * Revisions and Configurations. Cloud Run currently supports a single
    * configurationName.
    */
  var traffic: js.UndefOr[js.Array[SchemaTrafficTarget]] = js.native
}

object SchemaRouteSpec {
  @scala.inline
  def apply(): SchemaRouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouteSpec]
  }
  @scala.inline
  implicit class SchemaRouteSpecOps[Self <: SchemaRouteSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def withTraffic(value: js.Array[SchemaTrafficTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic")(js.undefined)
        ret
    }
  }
  
}

