package typingsSlinky.egjsAxes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.egjsAxes.animationManagerMod.AnimationManager
import typingsSlinky.egjsAxes.anon.TypeofPanInput
import typingsSlinky.egjsAxes.axisManagerMod.Axis
import typingsSlinky.egjsAxes.axisManagerMod.AxisManager
import typingsSlinky.egjsAxes.axisManagerMod.AxisOption
import typingsSlinky.egjsAxes.constMod.DIRECTION
import typingsSlinky.egjsAxes.eventManagerMod.EventManager
import typingsSlinky.egjsAxes.inputObserverMod.InputObserver
import typingsSlinky.egjsAxes.inputTypeMod.IInputType
import typingsSlinky.egjsAxes.interruptManagerMod.InterruptManager
import typingsSlinky.egjsAxes.pinchInputMod.PinchInput
import typingsSlinky.egjsAxes.pinchInputMod.PinchInputOption
import typingsSlinky.egjsAxes.wheelInputMod.WheelInput
import typingsSlinky.egjsAxes.wheelInputMod.WheelInputOption
import typingsSlinky.egjsComponent.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axesMod {
  
  @JSImport("@egjs/axes/Axes", JSImport.Default)
  @js.native
  class default protected () extends Axes {
    def this(axis: StringDictionary[AxisOption], options: AxesOption) = this()
    def this(axis: StringDictionary[AxisOption], options: AxesOption, startPos: Axis) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@egjs/axes/Axes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_ALL")
    @js.native
    def DIRECTION_ALL: DIRECTION = js.native
    @scala.inline
    def DIRECTION_ALL_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_DOWN")
    @js.native
    def DIRECTION_DOWN: DIRECTION = js.native
    @scala.inline
    def DIRECTION_DOWN_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_HORIZONTAL")
    @js.native
    def DIRECTION_HORIZONTAL: DIRECTION = js.native
    @scala.inline
    def DIRECTION_HORIZONTAL_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_HORIZONTAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_LEFT")
    @js.native
    def DIRECTION_LEFT: DIRECTION = js.native
    @scala.inline
    def DIRECTION_LEFT_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_NONE")
    @js.native
    def DIRECTION_NONE: DIRECTION = js.native
    @scala.inline
    def DIRECTION_NONE_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_RIGHT")
    @js.native
    def DIRECTION_RIGHT: DIRECTION = js.native
    @scala.inline
    def DIRECTION_RIGHT_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_UP")
    @js.native
    def DIRECTION_UP: DIRECTION = js.native
    @scala.inline
    def DIRECTION_UP_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_UP")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.DIRECTION_VERTICAL")
    @js.native
    def DIRECTION_VERTICAL: DIRECTION = js.native
    @scala.inline
    def DIRECTION_VERTICAL_=(x: DIRECTION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_VERTICAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.PanInput")
    @js.native
    def PanInput: TypeofPanInput = js.native
    @scala.inline
    def PanInput_=(x: TypeofPanInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PanInput")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.PinchInput")
    @js.native
    def PinchInput: Instantiable2[
        /* el */ js.Any, 
        /* options */ js.UndefOr[PinchInputOption], 
        typingsSlinky.egjsAxes.pinchInputMod.PinchInput
      ] = js.native
    @scala.inline
    def PinchInput_=(x: Instantiable2[/* el */ js.Any, /* options */ js.UndefOr[PinchInputOption], PinchInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PinchInput")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.TRANSFORM")
    @js.native
    def TRANSFORM: String = js.native
    @scala.inline
    def TRANSFORM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSFORM")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("@egjs/axes/Axes", "default.WheelInput")
    @js.native
    def WheelInput: Instantiable2[
        /* el */ js.Any, 
        /* options */ js.UndefOr[WheelInputOption], 
        typingsSlinky.egjsAxes.wheelInputMod.WheelInput
      ] = js.native
    @scala.inline
    def WheelInput_=(x: Instantiable2[/* el */ js.Any, /* options */ js.UndefOr[WheelInputOption], WheelInput]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelInput")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Axes extends ^ {
    
    var _am: AnimationManager = js.native
    
    var _axm: AxisManager = js.native
    
    /* private */ def _complementOptions(): js.Any = js.native
    
    var _em: EventManager = js.native
    
    var _inputs: js.Array[IInputType] = js.native
    
    var _io: InputObserver = js.native
    
    var _itm: InterruptManager = js.native
    
    var axis: StringDictionary[AxisOption] = js.native
    
    def connect(axes: String, inputType: IInputType): this.type = js.native
    def connect(axes: js.Array[String], inputType: IInputType): this.type = js.native
    
    def destroy(): Unit = js.native
    
    def disconnect(): this.type = js.native
    def disconnect(inputType: IInputType): this.type = js.native
    
    def get(): Axis = js.native
    def get(axes: js.Array[String]): Axis = js.native
    
    def isBounceArea(): Boolean = js.native
    def isBounceArea(axes: js.Array[String]): Boolean = js.native
    
    @JSName("options")
    var options_Axes: AxesOption = js.native
    
    def setBy(pos: Axis): this.type = js.native
    def setBy(pos: Axis, duration: Double): this.type = js.native
    
    def setTo(pos: Axis): this.type = js.native
    def setTo(pos: Axis, duration: Double): this.type = js.native
  }
  
  @js.native
  trait AxesOption extends StObject {
    
    var deceleration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.native
    
    var interruptable: js.UndefOr[Boolean] = js.native
    
    var maximumDuration: js.UndefOr[Double] = js.native
    
    var minimumDuration: js.UndefOr[Double] = js.native
  }
  object AxesOption {
    
    @scala.inline
    def apply(): AxesOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxesOption]
    }
    
    @scala.inline
    implicit class AxesOptionMutableBuilder[Self <: AxesOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* x */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setInterruptable(value: Boolean): Self = StObject.set(x, "interruptable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterruptableUndefined: Self = StObject.set(x, "interruptable", js.undefined)
      
      @scala.inline
      def setMaximumDuration(value: Double): Self = StObject.set(x, "maximumDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumDurationUndefined: Self = StObject.set(x, "maximumDuration", js.undefined)
      
      @scala.inline
      def setMinimumDuration(value: Double): Self = StObject.set(x, "minimumDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumDurationUndefined: Self = StObject.set(x, "minimumDuration", js.undefined)
    }
  }
}
