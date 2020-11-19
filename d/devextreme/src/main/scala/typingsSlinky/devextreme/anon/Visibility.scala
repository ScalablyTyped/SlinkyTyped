package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.collapsed
import typingsSlinky.devextreme.devextremeStrings.containers
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.disabled
import typingsSlinky.devextreme.devextremeStrings.flowchart
import typingsSlinky.devextreme.devextremeStrings.general
import typingsSlinky.devextreme.devextremeStrings.orgChart
import typingsSlinky.devextreme.devextremeStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visibility extends js.Object {
  
  var groups: js.UndefOr[js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]] = js.native
  
  var visibility: js.UndefOr[auto | visible | collapsed | disabled] = js.native
}
object Visibility {
  
  @scala.inline
  def apply(): Visibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visibility]
  }
  
  @scala.inline
  implicit class VisibilityOps[Self <: Visibility] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: (general | flowchart | orgChart | containers | custom | DisplayMode)*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[general | flowchart | orgChart | containers | custom | DisplayMode]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setVisibility(value: auto | visible | collapsed | disabled): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
