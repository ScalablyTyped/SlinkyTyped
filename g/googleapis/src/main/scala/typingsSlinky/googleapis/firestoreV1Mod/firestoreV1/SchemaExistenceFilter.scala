package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A digest of all the documents that match a given target.
  */
@js.native
trait SchemaExistenceFilter extends js.Object {
  
  /**
    * The total count of documents that match target_id.  If different from the
    * count of documents in the client that match, the client must manually
    * determine which documents no longer match the target.
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    * The target ID to which this filter applies.
    */
  var targetId: js.UndefOr[Double] = js.native
}
object SchemaExistenceFilter {
  
  @scala.inline
  def apply(): SchemaExistenceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExistenceFilter]
  }
  
  @scala.inline
  implicit class SchemaExistenceFilterOps[Self <: SchemaExistenceFilter] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setTargetId(value: Double): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
}
