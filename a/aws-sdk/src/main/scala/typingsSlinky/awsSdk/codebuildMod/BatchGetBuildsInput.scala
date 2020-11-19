package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetBuildsInput extends js.Object {
  
  /**
    * The IDs of the builds.
    */
  var ids: BuildIds = js.native
}
object BatchGetBuildsInput {
  
  @scala.inline
  def apply(ids: BuildIds): BatchGetBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBuildsInput]
  }
  
  @scala.inline
  implicit class BatchGetBuildsInputOps[Self <: BatchGetBuildsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdsVarargs(value: NonEmptyString*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: BuildIds): Self = this.set("ids", value.asInstanceOf[js.Any])
  }
}
