package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMLTransformResponse extends js.Object {
  
  /**
    * The unique identifier for the transform that was updated.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}
object UpdateMLTransformResponse {
  
  @scala.inline
  def apply(): UpdateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMLTransformResponse]
  }
  
  @scala.inline
  implicit class UpdateMLTransformResponseOps[Self <: UpdateMLTransformResponse] (val x: Self) extends AnyVal {
    
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
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformId: Self = this.set("TransformId", js.undefined)
  }
}
