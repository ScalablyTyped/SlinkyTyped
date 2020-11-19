package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata type for the operation returned by CreateInstance.
  */
@js.native
trait SchemaCreateInstanceMetadata extends js.Object {
  
  /**
    * The time at which this operation was cancelled. If set, this operation is
    * in the process of undoing itself (which is guaranteed to succeed) and
    * cannot be cancelled again.
    */
  var cancelTime: js.UndefOr[String] = js.native
  
  /**
    * The time at which this operation failed or was completed successfully.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The instance being created.
    */
  var instance: js.UndefOr[SchemaInstance] = js.native
  
  /**
    * The time at which the CreateInstance request was received.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaCreateInstanceMetadata {
  
  @scala.inline
  def apply(): SchemaCreateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateInstanceMetadata]
  }
  
  @scala.inline
  implicit class SchemaCreateInstanceMetadataOps[Self <: SchemaCreateInstanceMetadata] (val x: Self) extends AnyVal {
    
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
    def setCancelTime(value: String): Self = this.set("cancelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTime: Self = this.set("cancelTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setInstance(value: SchemaInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
