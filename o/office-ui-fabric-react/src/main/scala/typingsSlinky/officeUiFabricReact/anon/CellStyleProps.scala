package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellStyleProps extends StObject {
  
  var cellStyleProps: js.UndefOr[ICellStyleProps] = js.native
  
  var theme: ITheme = js.native
}
object CellStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): CellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellStyleProps]
  }
  
  @scala.inline
  implicit class CellStylePropsMutableBuilder[Self <: CellStyleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellStyleProps(value: ICellStyleProps): Self = StObject.set(x, "cellStyleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellStylePropsUndefined: Self = StObject.set(x, "cellStyleProps", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
