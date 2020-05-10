package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpec holds the desired state of the Route (from the client), which
  * is used to manipulate the underlying Route and Configuration(s).
  */
@js.native
trait SchemaServiceSpec extends js.Object {
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * Manual contains the options for configuring a manual service. See
    * ServiceSpec for more details.  Not currently supported by Cloud Run.
    */
  var manual: js.UndefOr[SchemaServiceSpecManualType] = js.native
  /**
    * Pins this service to a specific revision name. The revision must be owned
    * by the configuration provided.  Deprecated and not supported by Cloud
    * Run. +optional
    */
  var pinned: js.UndefOr[SchemaServiceSpecPinnedType] = js.native
  /**
    * Release enables gradual promotion of new revisions by allowing traffic to
    * be split between two revisions. This type replaces the deprecated Pinned
    * type.  Not currently supported by Cloud Run.
    */
  var release: js.UndefOr[SchemaServiceSpecReleaseType] = js.native
  /**
    * RunLatest defines a simple Service. It will automatically configure a
    * route that keeps the latest ready revision from the supplied
    * configuration running. +optional
    */
  var runLatest: js.UndefOr[SchemaServiceSpecRunLatest] = js.native
}

object SchemaServiceSpec {
  @scala.inline
  def apply(): SchemaServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpec]
  }
  @scala.inline
  implicit class SchemaServiceSpecOps[Self <: SchemaServiceSpec] (val x: Self) extends AnyVal {
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
    def withManual(value: SchemaServiceSpecManualType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manual")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: SchemaServiceSpecPinnedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease(value: SchemaServiceSpecReleaseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.undefined)
        ret
    }
    @scala.inline
    def withRunLatest(value: SchemaServiceSpecRunLatest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runLatest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunLatest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runLatest")(js.undefined)
        ret
    }
  }
  
}

