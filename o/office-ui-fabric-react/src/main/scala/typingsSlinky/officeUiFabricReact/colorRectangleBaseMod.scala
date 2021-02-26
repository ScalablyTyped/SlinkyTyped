package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.anon.PartialIColorRectanglePro
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorRectanglePr
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorRectangleSt
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleProps
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorRectangleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
  @js.native
  class ColorRectangleBase protected ()
    extends Component[IColorRectangleProps, IColorRectangleState, js.Any]
       with IColorRectangle {
    def this(props: IColorRectangleProps) = this()
    
    var _descriptionId: js.Any = js.native
    
    var _disposables: js.Any = js.native
    
    var _disposeListeners: js.Any = js.native
    
    var _isAdjustingSaturation: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseMove: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _updateColor: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorRectangleBase(prevProps: ReadonlyIColorRectanglePr, prevState: ReadonlyIColorRectangleSt): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorRectangleBase(): Unit = js.native
  }
  /* static members */
  object ColorRectangleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorRectanglePro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorRectanglePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "_getNewColor")
  @js.native
  def getNewColor(ev: MouseEvent, prevColor: IColor, root: HTMLElement): js.UndefOr[IColor] = js.native
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "_getNewColor")
  @js.native
  def getNewColor(ev: SyntheticMouseEvent[Element], prevColor: IColor, root: HTMLElement): js.UndefOr[IColor] = js.native
  
  @js.native
  trait IColorRectangleState extends StObject {
    
    var color: IColor = js.native
  }
  object IColorRectangleState {
    
    @scala.inline
    def apply(color: IColor): IColorRectangleState = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorRectangleState]
    }
    
    @scala.inline
    implicit class IColorRectangleStateMutableBuilder[Self <: IColorRectangleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
}
