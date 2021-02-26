package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachedDisk extends StObject {
  
  /**
    * The path of the disk (e.g., /dev/xvdf).
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
}
object AttachedDisk {
  
  @scala.inline
  def apply(): AttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedDisk]
  }
  
  @scala.inline
  implicit class AttachedDiskMutableBuilder[Self <: AttachedDisk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSizeInGb(value: integer): Self = StObject.set(x, "sizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInGbUndefined: Self = StObject.set(x, "sizeInGb", js.undefined)
  }
}
