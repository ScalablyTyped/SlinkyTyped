package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestGridProjectResult extends js.Object {
  
  /**
    * A TestGridProject.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.native
}
object GetTestGridProjectResult {
  
  @scala.inline
  def apply(): GetTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestGridProjectResult]
  }
  
  @scala.inline
  implicit class GetTestGridProjectResultOps[Self <: GetTestGridProjectResult] (val x: Self) extends AnyVal {
    
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
    def setTestGridProject(value: TestGridProject): Self = this.set("testGridProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestGridProject: Self = this.set("testGridProject", js.undefined)
  }
}
