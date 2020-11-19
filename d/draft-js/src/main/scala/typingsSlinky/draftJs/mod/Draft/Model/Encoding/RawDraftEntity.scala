package typingsSlinky.draftJs.mod.Draft.Model.Encoding

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A plain object representation of an EntityInstance.
  */
@js.native
trait RawDraftEntity[T] extends js.Object {
  
  var data: T = js.native
  
  var mutability: DraftEntityMutability = js.native
  
  var `type`: DraftEntityType = js.native
}
object RawDraftEntity {
  
  @scala.inline
  def apply[T](data: T, mutability: DraftEntityMutability, `type`: DraftEntityType): RawDraftEntity[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mutability = mutability.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftEntity[T]]
  }
  
  @scala.inline
  implicit class RawDraftEntityOps[Self <: RawDraftEntity[_], T] (val x: Self with RawDraftEntity[T]) extends AnyVal {
    
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutability(value: DraftEntityMutability): Self = this.set("mutability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DraftEntityType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
