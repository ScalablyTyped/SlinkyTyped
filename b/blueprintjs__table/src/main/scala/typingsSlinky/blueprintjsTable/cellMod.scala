package typingsSlinky.blueprintjsTable

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.anon.Truncated
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.KeyboardEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell")
  @js.native
  class Cell protected ()
    extends Component[ICellProps, js.Object, js.Any] {
    def this(props: ICellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICellProps, context: js.Any) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCell(nextProps: ICellProps): Boolean = js.native
  }
  /* static members */
  object Cell {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    @scala.inline
    def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/cell", "Cell.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table/lib/esm/cell/cell", "emptyCellRenderer")
  @js.native
  def emptyCellRenderer(): ReactElement = js.native
  
  @js.native
  trait ICellProps
    extends IIntentProps
       with IProps {
    
    /**
      * A ref handle to capture the outer div of this cell. Used internally.
      */
    var cellRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
    /**
      * The column index of the cell. If provided, this will be passed as an argument to any callbacks
      * when they are invoked.
      */
    var columnIndex: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the cell will be rendered above overlay layers to enable mouse
      * interactions within the cell.
      * @default false
      */
    var interactive: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    /**
      * An optional native tooltip that is displayed on hover.
      * If `true`, content will be replaced with a fixed-height skeleton.
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback invoked when the cell is focused and a key is pressed down.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    /**
      * Callback invoked when a character-key is pressed.
      */
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    /**
      * Callback invoked when the cell is focused and a key is released.
      */
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    /**
      * The row index of the cell. If provided, this will be passed as an argument to any callbacks
      * when they are invoked.
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Allows for setting a tab index on the cell, so the cell can be browser-focusable.
      */
    var tabIndex: js.UndefOr[Double] = js.native
    
    /**
      * An optional native tooltip that is displayed on hover.
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the cell contents will be wrapped in a `div` with
      * styling that will prevent the content from overflowing the cell.
      * @default true
      */
    var truncated: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the cell contents will be wrapped in a `div` with
      * styling that will cause text to wrap, rather than displaying it on a single line.
      * @default false
      */
    var wrapText: js.UndefOr[Boolean] = js.native
  }
  object ICellProps {
    
    @scala.inline
    def apply(): ICellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICellProps]
    }
    
    @scala.inline
    implicit class ICellPropsMutableBuilder[Self <: ICellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellRef(value: /* ref */ HTMLElement | Null => Unit): Self = StObject.set(x, "cellRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellRefUndefined: Self = StObject.set(x, "cellRef", js.undefined)
      
      @scala.inline
      def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
      
      @scala.inline
      def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  type ICellRenderer = js.Function2[/* rowIndex */ Double, /* columnIndex */ Double, ReactElement]
}
