package typingsSlinky.rcTable

import slinky.core.facade.ReactElement
import typingsSlinky.rcTable.footerCellMod.SummaryCellProps
import typingsSlinky.rcTable.rowMod.FooterRowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  @JSImport("rc-table/lib/Footer", JSImport.Default)
  @js.native
  def default(hasChildren: FooterProps): ReactElement = js.native
  
  object FooterComponents {
    
    @JSImport("rc-table/lib/Footer", "FooterComponents")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Cell")
    @js.native
    def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, ReactElement] = js.native
    @scala.inline
    def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-table/lib/Footer", "FooterComponents.Row")
    @js.native
    def Row: js.Function1[/* props */ FooterRowProps, ReactElement] = js.native
    @scala.inline
    def Row_=(x: js.Function1[/* props */ FooterRowProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FooterProps extends StObject {
    
    var children: ReactElement = js.native
  }
  object FooterProps {
    
    @scala.inline
    def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    @scala.inline
    implicit class FooterPropsMutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
