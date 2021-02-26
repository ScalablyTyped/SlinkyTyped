package typingsSlinky.blueprintjsTable

import typingsSlinky.blueprintjsCore.mod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsTable.anon.IsResizable
import typingsSlinky.blueprintjsTable.anon.Size
import typingsSlinky.blueprintjsTable.resizeHandleMod.ILockableLayout
import typingsSlinky.blueprintjsTable.resizeHandleMod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
  @js.native
  class Resizable protected ()
    extends AbstractPureComponent2[IResizableProps, IResizeableState, js.Object] {
    def this(props: IResizableProps) = this()
    def this(props: IResizableProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizable(prevProps: IResizableProps): Unit = js.native
    
    /**
      * Returns the CSS style to apply to the child element given the state's
      * size value.
      */
    var getStyle: js.Any = js.native
    
    var offsetSize: js.Any = js.native
    
    var onResizeEnd: js.Any = js.native
    
    var onResizeMove: js.Any = js.native
    
    var renderResizeHandle: js.Any = js.native
  }
  /* static members */
  object Resizable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable.defaultProps")
    @js.native
    def defaultProps: IsResizable = js.native
    @scala.inline
    def defaultProps_=(x: IsResizable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(hasSize: IResizableProps, prevState: IResizeableState): Size = js.native
  }
  
  type IIndexedResizeCallback = js.Function2[/* index */ Double, /* size */ Double, Unit]
  
  @js.native
  trait IResizableProps
    extends IProps
       with ILockableLayout {
    
    /**
      * Enables/disables the resize interaction for the column.
      * @default true
      */
    var isResizable: js.UndefOr[Boolean] = js.native
    
    /**
      * The optional maximum width of the column.
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * The optional minimum width of the column.
      */
    var minSize: js.UndefOr[Double] = js.native
    
    /**
      * A callback that is called when the user double clicks the resize handle
      */
    var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A callback that is called when the user is done dragging the resize
      * handle.
      *
      * @param size is the final resized size
      */
    var onResizeEnd: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
    
    /**
      * A callback that is called while the user is dragging the resize
      * handle.
      *
      * @param size is the resized size
      */
    var onSizeChanged: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
    
    /**
      * Determines how the resize handle is oriented in the resizable child.
      */
    var orientation: Orientation = js.native
    
    /**
      * The initial dimensional size.
      */
    var size: Double = js.native
  }
  
  @js.native
  trait IResizeableState extends StObject {
    
    /**
      * The dimensional size, respecting minimum and maximum constraints.
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * The dimensional size, ignoring minimum and maximum constraints.
      */
    var unclampedSize: js.UndefOr[Double] = js.native
  }
  object IResizeableState {
    
    @scala.inline
    def apply(): IResizeableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResizeableState]
    }
    
    @scala.inline
    implicit class IResizeableStateMutableBuilder[Self <: IResizeableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUnclampedSize(value: Double): Self = StObject.set(x, "unclampedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnclampedSizeUndefined: Self = StObject.set(x, "unclampedSize", js.undefined)
    }
  }
}
