package typingsSlinky.graphqlCompose.anon

import typingsSlinky.graphqlCompose.projectionMod.ProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends js.Object {
  
  var projection: js.UndefOr[ProjectionType] = js.native
}
object Projection {
  
  @scala.inline
  def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    
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
    def setProjection(value: ProjectionType): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
  }
}
