package typingsSlinky.grommet

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.boxMod.BoxTypes
import typingsSlinky.grommet.grommetStrings.`1Slash2`
import typingsSlinky.grommet.grommetStrings.`1Slash3`
import typingsSlinky.grommet.grommetStrings.`1Slash4`
import typingsSlinky.grommet.grommetStrings.`2Slash3`
import typingsSlinky.grommet.grommetStrings.`2Slash4`
import typingsSlinky.grommet.grommetStrings.`3Slash4`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.col
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.middle
import typingsSlinky.grommet.grommetStrings.row
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TdHTMLAttributes
import typingsSlinky.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod {
  
  @JSImport("grommet/components/TableCell", "TableCell")
  @js.native
  val TableCell: ReactComponentClass[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = js.native
  
  @js.native
  trait TableCellProps extends StObject {
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[col | row] = js.native
    
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | String
      ] = js.native
    
    var verticalAlign: js.UndefOr[top | middle | bottom] = js.native
  }
  object TableCellProps {
    
    @scala.inline
    def apply(): TableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellProps]
    }
    
    @scala.inline
    implicit class TableCellPropsMutableBuilder[Self <: TableCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setScope(value: col | row): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSize(
        value: xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | String
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: top | middle | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
}
