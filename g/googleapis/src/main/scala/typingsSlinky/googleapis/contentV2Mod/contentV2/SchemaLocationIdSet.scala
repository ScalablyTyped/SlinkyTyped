package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLocationIdSet extends js.Object {
  
  /**
    * A non-empty list of location IDs. They must all be of the same location
    * type (e.g., state).
    */
  var locationIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaLocationIdSet {
  
  @scala.inline
  def apply(): SchemaLocationIdSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationIdSet]
  }
  
  @scala.inline
  implicit class SchemaLocationIdSetOps[Self <: SchemaLocationIdSet] (val x: Self) extends AnyVal {
    
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
    def setLocationIdsVarargs(value: String*): Self = this.set("locationIds", js.Array(value :_*))
    
    @scala.inline
    def setLocationIds(value: js.Array[String]): Self = this.set("locationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationIds: Self = this.set("locationIds", js.undefined)
  }
}
