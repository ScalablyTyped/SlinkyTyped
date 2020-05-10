package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of the desired way to instantiate a disk in the instance
  * template when its created from a source instance.
  */
@js.native
trait SchemaDiskInstantiationConfig extends js.Object {
  /**
    * Specifies whether the disk will be auto-deleted when the instance is
    * deleted (but not when the disk is detached from the instance).
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * The custom source image to be used to restore this disk when
    * instantiating this instance template.
    */
  var customImage: js.UndefOr[String] = js.native
  /**
    * Specifies the device name of the disk to which the configurations apply
    * to.
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * Specifies whether to include the disk and what image to use. Possible
    * values are:   - source-image: to use the same image that was used to
    * create the source instance&#39;s corresponding disk. Applicable to the
    * boot disk and additional read-write disks.  - source-image-family: to use
    * the same image family that was used to create the source instance&#39;s
    * corresponding disk. Applicable to the boot disk and additional read-write
    * disks.  - custom-image: to use a user-provided image url for disk
    * creation. Applicable to the boot disk and additional read-write disks.  -
    * attach-read-only: to attach a read-only disk. Applicable to read-only
    * disks.  - do-not-include: to exclude a disk from the template. Applicable
    * to additional read-write disks, local SSDs, and read-only disks.
    */
  var instantiateFrom: js.UndefOr[String] = js.native
}

object SchemaDiskInstantiationConfig {
  @scala.inline
  def apply(): SchemaDiskInstantiationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskInstantiationConfig]
  }
  @scala.inline
  implicit class SchemaDiskInstantiationConfigOps[Self <: SchemaDiskInstantiationConfig] (val x: Self) extends AnyVal {
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
    def withCustomImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customImage")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstantiateFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiateFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantiateFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantiateFrom")(js.undefined)
        ret
    }
  }
  
}

