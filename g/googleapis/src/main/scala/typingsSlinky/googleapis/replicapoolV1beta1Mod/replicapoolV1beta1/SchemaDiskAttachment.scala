package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies how to attach a disk to a Replica.
  */
@js.native
trait SchemaDiskAttachment extends StObject {
  
  /**
    * The device name of this disk.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  /**
    * A zero-based index to assign to this disk, where 0 is reserved for the
    * boot disk. If not specified, this is assigned by the server.
    */
  var index: js.UndefOr[Double] = js.native
}
object SchemaDiskAttachment {
  
  @scala.inline
  def apply(): SchemaDiskAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskAttachment]
  }
  
  @scala.inline
  implicit class SchemaDiskAttachmentMutableBuilder[Self <: SchemaDiskAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
