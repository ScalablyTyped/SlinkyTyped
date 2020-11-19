package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about a disk that can be attached to a VM.  See
  * https://cloud.google.com/compute/docs/disks/performance for more
  * information about disk type, size, and performance considerations.
  */
@js.native
trait SchemaDisk extends js.Object {
  
  /**
    * A user-supplied name for the disk. Used when mounting the disk into
    * actions. The name must contain only upper and lowercase alphanumeric
    * characters and hypens and cannot start with a hypen.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The size, in GB, of the disk to attach. If the size is not specified, a
    * default is chosen to ensure reasonable I/O performance.  If the disk type
    * is specified as `local-ssd`, multiple local drives are automatically
    * combined to provide the requested size. Note, however, that each physical
    * SSD is 375GB in size, and no more than 8 drives can be attached to a
    * single instance.
    */
  var sizeGb: js.UndefOr[Double] = js.native
  
  /**
    * An optional image to put on the disk before attaching it to the VM.
    */
  var sourceImage: js.UndefOr[String] = js.native
  
  /**
    * The Compute Engine disk type. If unspecified, `pd-standard` is used.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSizeGb(value: Double): Self = this.set("sizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeGb: Self = this.set("sizeGb", js.undefined)
    
    @scala.inline
    def setSourceImage(value: String): Self = this.set("sourceImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceImage: Self = this.set("sourceImage", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
