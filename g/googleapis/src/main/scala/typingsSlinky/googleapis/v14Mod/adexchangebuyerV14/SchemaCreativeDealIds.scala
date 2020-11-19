package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleapis.anon.ArcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The external deal ids associated with a creative.
  */
@js.native
trait SchemaCreativeDealIds extends js.Object {
  
  /**
    * A list of external deal ids and ARC approval status.
    */
  var dealStatuses: js.UndefOr[js.Array[ArcStatus]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCreativeDealIds {
  
  @scala.inline
  def apply(): SchemaCreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealIds]
  }
  
  @scala.inline
  implicit class SchemaCreativeDealIdsOps[Self <: SchemaCreativeDealIds] (val x: Self) extends AnyVal {
    
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
    def setDealStatusesVarargs(value: ArcStatus*): Self = this.set("dealStatuses", js.Array(value :_*))
    
    @scala.inline
    def setDealStatuses(value: js.Array[ArcStatus]): Self = this.set("dealStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealStatuses: Self = this.set("dealStatuses", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
