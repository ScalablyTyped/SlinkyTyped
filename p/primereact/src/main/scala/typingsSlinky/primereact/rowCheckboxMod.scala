package typingsSlinky.primereact

import typingsSlinky.primereact.anon.CheckedData
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowCheckboxMod {
  
  @JSImport("primereact/components/datatable/RowCheckbox", "RowCheckbox")
  @js.native
  class RowCheckbox protected ()
    extends Component[RowCheckboxProps, js.Any, js.Any] {
    def this(props: RowCheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowCheckboxProps, context: js.Any) = this()
  }
  
  @js.native
  trait RowCheckboxProps extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ CheckedData, Unit]] = js.native
    
    var rowData: js.UndefOr[js.Object] = js.native
  }
  object RowCheckboxProps {
    
    @scala.inline
    def apply(): RowCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowCheckboxProps]
    }
    
    @scala.inline
    implicit class RowCheckboxPropsMutableBuilder[Self <: RowCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* e */ CheckedData => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRowData(value: js.Object): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    }
  }
}
