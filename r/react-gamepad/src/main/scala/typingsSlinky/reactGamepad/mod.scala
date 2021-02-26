package typingsSlinky.reactGamepad

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-gamepad", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  object default {
    
    /* static member */
    /* was `typeof layouts` */
    object layouts {
      
      @JSImport("react-gamepad", "default.layouts")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-gamepad", "default.layouts.XBOX")
      @js.native
      def XBOX: Layout = js.native
      @scala.inline
      def XBOX_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
    }
  }
  
  object layouts {
    
    @JSImport("react-gamepad", "layouts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-gamepad", "layouts.XBOX")
    @js.native
    def XBOX: Layout = js.native
    @scala.inline
    def XBOX_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XBOX")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickX
    - typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickY
    - typingsSlinky.reactGamepad.reactGamepadStrings.RightStickX
    - typingsSlinky.reactGamepad.reactGamepadStrings.RightStickY
    - typingsSlinky.reactGamepad.reactGamepadStrings.LeftTrigger
    - typingsSlinky.reactGamepad.reactGamepadStrings.RightTrigger
  */
  trait Axis extends StObject
  object Axis {
    
    @scala.inline
    def LeftStickX: typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickX = "LeftStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickX]
    
    @scala.inline
    def LeftStickY: typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickY = "LeftStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickY]
    
    @scala.inline
    def LeftTrigger: typingsSlinky.reactGamepad.reactGamepadStrings.LeftTrigger = "LeftTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LeftTrigger]
    
    @scala.inline
    def RightStickX: typingsSlinky.reactGamepad.reactGamepadStrings.RightStickX = "RightStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RightStickX]
    
    @scala.inline
    def RightStickY: typingsSlinky.reactGamepad.reactGamepadStrings.RightStickY = "RightStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RightStickY]
    
    @scala.inline
    def RightTrigger: typingsSlinky.reactGamepad.reactGamepadStrings.RightTrigger = "RightTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RightTrigger]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGamepad.reactGamepadStrings.A
    - typingsSlinky.reactGamepad.reactGamepadStrings.B
    - typingsSlinky.reactGamepad.reactGamepadStrings.X
    - typingsSlinky.reactGamepad.reactGamepadStrings.Y
    - typingsSlinky.reactGamepad.reactGamepadStrings.Start
    - typingsSlinky.reactGamepad.reactGamepadStrings.Back
    - typingsSlinky.reactGamepad.reactGamepadStrings.LT
    - typingsSlinky.reactGamepad.reactGamepadStrings.RT
    - typingsSlinky.reactGamepad.reactGamepadStrings.LB
    - typingsSlinky.reactGamepad.reactGamepadStrings.RB
    - typingsSlinky.reactGamepad.reactGamepadStrings.LS
    - typingsSlinky.reactGamepad.reactGamepadStrings.RS
    - typingsSlinky.reactGamepad.reactGamepadStrings.DPadUp
    - typingsSlinky.reactGamepad.reactGamepadStrings.DPadDown
    - typingsSlinky.reactGamepad.reactGamepadStrings.DPadLeft
    - typingsSlinky.reactGamepad.reactGamepadStrings.DPadRight
  */
  trait Button extends StObject
  object Button {
    
    @scala.inline
    def A: typingsSlinky.reactGamepad.reactGamepadStrings.A = "A".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.A]
    
    @scala.inline
    def B: typingsSlinky.reactGamepad.reactGamepadStrings.B = "B".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.B]
    
    @scala.inline
    def Back: typingsSlinky.reactGamepad.reactGamepadStrings.Back = "Back".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.Back]
    
    @scala.inline
    def DPadDown: typingsSlinky.reactGamepad.reactGamepadStrings.DPadDown = "DPadDown".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.DPadDown]
    
    @scala.inline
    def DPadLeft: typingsSlinky.reactGamepad.reactGamepadStrings.DPadLeft = "DPadLeft".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.DPadLeft]
    
    @scala.inline
    def DPadRight: typingsSlinky.reactGamepad.reactGamepadStrings.DPadRight = "DPadRight".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.DPadRight]
    
    @scala.inline
    def DPadUp: typingsSlinky.reactGamepad.reactGamepadStrings.DPadUp = "DPadUp".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.DPadUp]
    
    @scala.inline
    def LB: typingsSlinky.reactGamepad.reactGamepadStrings.LB = "LB".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LB]
    
    @scala.inline
    def LS: typingsSlinky.reactGamepad.reactGamepadStrings.LS = "LS".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LS]
    
    @scala.inline
    def LT: typingsSlinky.reactGamepad.reactGamepadStrings.LT = "LT".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LT]
    
    @scala.inline
    def RB: typingsSlinky.reactGamepad.reactGamepadStrings.RB = "RB".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RB]
    
    @scala.inline
    def RS: typingsSlinky.reactGamepad.reactGamepadStrings.RS = "RS".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RS]
    
    @scala.inline
    def RT: typingsSlinky.reactGamepad.reactGamepadStrings.RT = "RT".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RT]
    
    @scala.inline
    def Start: typingsSlinky.reactGamepad.reactGamepadStrings.Start = "Start".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.Start]
    
    @scala.inline
    def X: typingsSlinky.reactGamepad.reactGamepadStrings.X = "X".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.X]
    
    @scala.inline
    def Y: typingsSlinky.reactGamepad.reactGamepadStrings.Y = "Y".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.Y]
  }
  
  type Gamepad = ReactComponentClass[Props]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickX`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickY`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickX`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickY`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftTrigger`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-RightTrigger`
  */
  trait InvertedAxis extends StObject
  object InvertedAxis {
    
    @scala.inline
    def `-LeftStickX`: typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickX` = "-LeftStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickX`]
    
    @scala.inline
    def `-LeftStickY`: typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickY` = "-LeftStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickY`]
    
    @scala.inline
    def `-LeftTrigger`: typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftTrigger` = "-LeftTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftTrigger`]
    
    @scala.inline
    def `-RightStickX`: typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickX` = "-RightStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickX`]
    
    @scala.inline
    def `-RightStickY`: typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickY` = "-RightStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickY`]
    
    @scala.inline
    def `-RightTrigger`: typingsSlinky.reactGamepad.reactGamepadStrings.`-RightTrigger` = "-RightTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-RightTrigger`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickX
    - typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickY
    - typingsSlinky.reactGamepad.reactGamepadStrings.RightStickX
    - typingsSlinky.reactGamepad.reactGamepadStrings.RightStickY
    - typingsSlinky.reactGamepad.reactGamepadStrings.LeftTrigger
    - typingsSlinky.reactGamepad.reactGamepadStrings.RightTrigger
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickX`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickY`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickX`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickY`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftTrigger`
    - typingsSlinky.reactGamepad.reactGamepadStrings.`-RightTrigger`
  */
  trait InvertibleAxis extends StObject
  object InvertibleAxis {
    
    @scala.inline
    def `-LeftStickX`: typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickX` = "-LeftStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickX`]
    
    @scala.inline
    def `-LeftStickY`: typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickY` = "-LeftStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftStickY`]
    
    @scala.inline
    def `-LeftTrigger`: typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftTrigger` = "-LeftTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-LeftTrigger`]
    
    @scala.inline
    def `-RightStickX`: typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickX` = "-RightStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickX`]
    
    @scala.inline
    def `-RightStickY`: typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickY` = "-RightStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-RightStickY`]
    
    @scala.inline
    def `-RightTrigger`: typingsSlinky.reactGamepad.reactGamepadStrings.`-RightTrigger` = "-RightTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.`-RightTrigger`]
    
    @scala.inline
    def LeftStickX: typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickX = "LeftStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickX]
    
    @scala.inline
    def LeftStickY: typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickY = "LeftStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LeftStickY]
    
    @scala.inline
    def LeftTrigger: typingsSlinky.reactGamepad.reactGamepadStrings.LeftTrigger = "LeftTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.LeftTrigger]
    
    @scala.inline
    def RightStickX: typingsSlinky.reactGamepad.reactGamepadStrings.RightStickX = "RightStickX".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RightStickX]
    
    @scala.inline
    def RightStickY: typingsSlinky.reactGamepad.reactGamepadStrings.RightStickY = "RightStickY".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RightStickY]
    
    @scala.inline
    def RightTrigger: typingsSlinky.reactGamepad.reactGamepadStrings.RightTrigger = "RightTrigger".asInstanceOf[typingsSlinky.reactGamepad.reactGamepadStrings.RightTrigger]
  }
  
  @js.native
  trait Layout extends StObject {
    
    var axis: js.Array[InvertibleAxis | Null] = js.native
    
    var buttonAxis: js.Array[InvertibleAxis | Null] = js.native
    
    var buttons: js.Array[Button | Null] = js.native
  }
  object Layout {
    
    @scala.inline
    def apply(
      axis: js.Array[InvertibleAxis | Null],
      buttonAxis: js.Array[InvertibleAxis | Null],
      buttons: js.Array[Button | Null]
    ): Layout = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], buttonAxis = buttonAxis.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: js.Array[InvertibleAxis | Null]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisVarargs(value: (InvertibleAxis | Null)*): Self = StObject.set(x, "axis", js.Array(value :_*))
      
      @scala.inline
      def setButtonAxis(value: js.Array[InvertibleAxis | Null]): Self = StObject.set(x, "buttonAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonAxisVarargs(value: (InvertibleAxis | Null)*): Self = StObject.set(x, "buttonAxis", js.Array(value :_*))
      
      @scala.inline
      def setButtons(value: js.Array[Button | Null]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: (Button | Null)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    /**
      * Threshold below which the axis values will be rounded to 0.0 Default: 0.08
      */
    var deadZone: js.UndefOr[Double] = js.native
    
    /**
      * The index of the gamepad to use, from 0 to 4 Default: 0
      */
    var gamepadIndex: js.UndefOr[Double] = js.native
    
    /**
      * Layout to use, from Gamepad.layouts. For now, only Gamepad.layouts.XBOX exists Default: Gamepad.layouts.XBOX
      */
    var layout: js.UndefOr[Layout] = js.native
    
    /**
      * triggered when the A button is pressed.
      */
    var onA: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * triggered when an axis is changed.
      */
    var onAxisChange: js.UndefOr[
        js.Function3[/* axisName */ Axis, /* value */ Double, /* previousValue */ Double, Unit]
      ] = js.native
    
    /**
      * triggered when the B button is pressed.
      */
    var onB: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * triggered when a button is pushed or released.
      */
    var onButtonChange: js.UndefOr[js.Function2[/* buttonName */ Button, /* pressed */ Boolean, Unit]] = js.native
    
    /**
      * triggered when a button is pushed.
      */
    var onButtonDown: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.native
    
    /**
      * triggered when a button is released.
      */
    var onButtonUp: js.UndefOr[js.Function1[/* buttonName */ Button, Unit]] = js.native
    
    /**
      * triggered when the gamepad connects. Will be Triggered at least once after the Gamepad component is mounted.
      */
    var onConnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.native
    
    /**
      * triggered when the gamepad disconnects.
      */
    var onDisconnect: js.UndefOr[js.Function1[/* gamepadIndex */ Double, Unit]] = js.native
    
    /**
      * Triggered when the D Pad Down button is pressed or the Left Stick is pushed down (above stickThreshold).
      */
    var onDown: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the LB button is pressed.
      */
    var onLB: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the LS button is pressed.
      */
    var onLS: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the LT button is pressed.
      */
    var onLT: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the D Pad Left button is pressed or the Left Stick is pushed left (above stickThreshold).
      */
    var onLeft: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the RB button is pressed.
      */
    var onRB: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the RS button is pressed.
      */
    var onRS: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the RT button is pressed.
      */
    var onRT: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the D Pad Right button is pressed or the Left Stick is pushed right (above stickThreshold).
      */
    var onRight: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the D Pad Up button is pressed or the Left Stick is pushed up (above stickThreshold).
      */
    var onUp: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * triggered when the X button is pressed.
      */
    var onX: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Triggered when the Y button is pressed.
      */
    var onY: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Threshold above which onUp, onDown,onLeft,onRight are Triggered for the left stick Default: 0.75
      */
    var stickThreshold: js.UndefOr[Double] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadZone(value: Double): Self = StObject.set(x, "deadZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadZoneUndefined: Self = StObject.set(x, "deadZone", js.undefined)
      
      @scala.inline
      def setGamepadIndex(value: Double): Self = StObject.set(x, "gamepadIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamepadIndexUndefined: Self = StObject.set(x, "gamepadIndex", js.undefined)
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setOnA(value: () => Unit): Self = StObject.set(x, "onA", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAUndefined: Self = StObject.set(x, "onA", js.undefined)
      
      @scala.inline
      def setOnAxisChange(value: (/* axisName */ Axis, /* value */ Double, /* previousValue */ Double) => Unit): Self = StObject.set(x, "onAxisChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnAxisChangeUndefined: Self = StObject.set(x, "onAxisChange", js.undefined)
      
      @scala.inline
      def setOnB(value: () => Unit): Self = StObject.set(x, "onB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBUndefined: Self = StObject.set(x, "onB", js.undefined)
      
      @scala.inline
      def setOnButtonChange(value: (/* buttonName */ Button, /* pressed */ Boolean) => Unit): Self = StObject.set(x, "onButtonChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnButtonChangeUndefined: Self = StObject.set(x, "onButtonChange", js.undefined)
      
      @scala.inline
      def setOnButtonDown(value: /* buttonName */ Button => Unit): Self = StObject.set(x, "onButtonDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnButtonDownUndefined: Self = StObject.set(x, "onButtonDown", js.undefined)
      
      @scala.inline
      def setOnButtonUp(value: /* buttonName */ Button => Unit): Self = StObject.set(x, "onButtonUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnButtonUpUndefined: Self = StObject.set(x, "onButtonUp", js.undefined)
      
      @scala.inline
      def setOnConnect(value: /* gamepadIndex */ Double => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      @scala.inline
      def setOnDisconnect(value: /* gamepadIndex */ Double => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      @scala.inline
      def setOnDown(value: () => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      @scala.inline
      def setOnLB(value: () => Unit): Self = StObject.set(x, "onLB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLBUndefined: Self = StObject.set(x, "onLB", js.undefined)
      
      @scala.inline
      def setOnLS(value: () => Unit): Self = StObject.set(x, "onLS", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLSUndefined: Self = StObject.set(x, "onLS", js.undefined)
      
      @scala.inline
      def setOnLT(value: () => Unit): Self = StObject.set(x, "onLT", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLTUndefined: Self = StObject.set(x, "onLT", js.undefined)
      
      @scala.inline
      def setOnLeft(value: () => Unit): Self = StObject.set(x, "onLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      @scala.inline
      def setOnRB(value: () => Unit): Self = StObject.set(x, "onRB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRBUndefined: Self = StObject.set(x, "onRB", js.undefined)
      
      @scala.inline
      def setOnRS(value: () => Unit): Self = StObject.set(x, "onRS", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRSUndefined: Self = StObject.set(x, "onRS", js.undefined)
      
      @scala.inline
      def setOnRT(value: () => Unit): Self = StObject.set(x, "onRT", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRTUndefined: Self = StObject.set(x, "onRT", js.undefined)
      
      @scala.inline
      def setOnRight(value: () => Unit): Self = StObject.set(x, "onRight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      @scala.inline
      def setOnUp(value: () => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      @scala.inline
      def setOnX(value: () => Unit): Self = StObject.set(x, "onX", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnXUndefined: Self = StObject.set(x, "onX", js.undefined)
      
      @scala.inline
      def setOnY(value: () => Unit): Self = StObject.set(x, "onY", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnYUndefined: Self = StObject.set(x, "onY", js.undefined)
      
      @scala.inline
      def setStickThreshold(value: Double): Self = StObject.set(x, "stickThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickThresholdUndefined: Self = StObject.set(x, "stickThreshold", js.undefined)
    }
  }
}
