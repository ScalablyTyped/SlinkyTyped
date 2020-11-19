package typingsSlinky.cordovaPluginFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface supplies information about the state of a file or directory. */
@js.native
trait Metadata extends js.Object {
  
  /** This is the time at which the file or directory was last modified. */
  var modificationTime: js.Date = js.native
  
  /** The size of the file, in bytes. This must return 0 for directories. */
  var size: Double = js.native
}
object Metadata {
  
  @scala.inline
  def apply(modificationTime: js.Date, size: Double): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setModificationTime(value: js.Date): Self = this.set("modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
