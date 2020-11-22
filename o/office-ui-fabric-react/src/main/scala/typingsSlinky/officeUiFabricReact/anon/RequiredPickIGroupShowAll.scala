package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupShowAll.types.IGroupShowAllProps, 'theme'>> */
@js.native
trait RequiredPickIGroupShowAll extends js.Object {
  
  var theme: ITheme = js.native
}
object RequiredPickIGroupShowAll {
  
  @scala.inline
  def apply(theme: ITheme): RequiredPickIGroupShowAll = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickIGroupShowAll]
  }
  
  @scala.inline
  implicit class RequiredPickIGroupShowAllOps[Self <: RequiredPickIGroupShowAll] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
