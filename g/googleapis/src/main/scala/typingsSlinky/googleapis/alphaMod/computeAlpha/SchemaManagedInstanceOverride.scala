package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overrides of stateful properties for a given instance
  */
@js.native
trait SchemaManagedInstanceOverride extends js.Object {
  /**
    * Disk overrides defined for this instance. According to documentation the
    * maximum number of disks attached to an instance is 128:
    * https://cloud.google.com/compute/docs/disks/ However, compute API defines
    * the limit at 140, so this is what we check.
    */
  var disks: js.UndefOr[js.Array[SchemaManagedInstanceOverrideDiskOverride]] = js.native
  /**
    * Metadata overrides defined for this instance. TODO(b/69785416) validate
    * the total length is &lt;9 KB
    */
  var metadata: js.UndefOr[js.Array[AnonKey]] = js.native
  /**
    * [Output Only] Indicates where does the override come from.
    */
  var origin: js.UndefOr[String] = js.native
}

object SchemaManagedInstanceOverride {
  @scala.inline
  def apply(): SchemaManagedInstanceOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceOverride]
  }
  @scala.inline
  implicit class SchemaManagedInstanceOverrideOps[Self <: SchemaManagedInstanceOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisks(value: js.Array[SchemaManagedInstanceOverrideDiskOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Array[AnonKey]): Self = {
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
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
  }
  
}

