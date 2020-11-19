package typingsSlinky.officeUiFabricReact.shimmeredDetailsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.types.IShimmeredDetailsListProps, 'theme'>> */
@js.native
trait IShimmeredDetailsListStyleProps extends js.Object {
  
  var theme: js.Any = js.native
}
object IShimmeredDetailsListStyleProps {
  
  @scala.inline
  def apply(theme: js.Any): IShimmeredDetailsListStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmeredDetailsListStyleProps]
  }
  
  @scala.inline
  implicit class IShimmeredDetailsListStylePropsOps[Self <: IShimmeredDetailsListStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
