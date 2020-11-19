package typingsSlinky.ionic.libProjectMod

import typingsSlinky.ionic.ionicStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectDetailsUnknownResult extends ProjectDetailsResultBase {
  
  val context: unknown = js.native
}
object ProjectDetailsUnknownResult {
  
  @scala.inline
  def apply(context: unknown, errors: js.Array[ProjectDetailsError]): ProjectDetailsUnknownResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsUnknownResult]
  }
  
  @scala.inline
  implicit class ProjectDetailsUnknownResultOps[Self <: ProjectDetailsUnknownResult] (val x: Self) extends AnyVal {
    
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
    def setContext(value: unknown): Self = this.set("context", value.asInstanceOf[js.Any])
  }
}
