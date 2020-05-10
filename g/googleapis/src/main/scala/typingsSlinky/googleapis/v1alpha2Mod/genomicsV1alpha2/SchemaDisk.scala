package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Google Compute Engine disk resource specification.
  */
@js.native
trait SchemaDisk extends js.Object {
  /**
    * Deprecated. Disks created by the Pipelines API will be deleted at the end
    * of the pipeline run, regardless of what this field is set to.
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * Required at create time and cannot be overridden at run time. Specifies
    * the path in the docker container where files on this disk should be
    * located. For example, if `mountPoint` is `/mnt/disk`, and the parameter
    * has `localPath` `inputs/file.txt`, the docker container can access the
    * data at `/mnt/disk/inputs/file.txt`.
    */
  var mountPoint: js.UndefOr[String] = js.native
  /**
    * Required. The name of the disk that can be used in the pipeline
    * parameters. Must be 1 - 63 characters. The name &quot;boot&quot; is
    * reserved for system use.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies how a sourced-base persistent disk will be mounted. See
    * https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances
    * for more details. Can only be set at create time.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * The size of the disk. Defaults to 500 (GB). This field is not applicable
    * for local SSD.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  /**
    * The full or partial URL of the persistent disk to attach. See
    * https://cloud.google.com/compute/docs/reference/latest/instances#resource
    * and
    * https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots
    * for more details.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Required. The type of the disk to create.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDisk {
  @scala.inline
  def apply(): SchemaDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisk]
  }
  @scala.inline
  implicit class SchemaDiskOps[Self <: SchemaDisk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withMountPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeGb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

