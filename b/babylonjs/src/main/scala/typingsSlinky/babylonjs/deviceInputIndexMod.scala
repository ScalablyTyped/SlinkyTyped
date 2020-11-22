package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.deviceEnumsMod.DeviceType
import typingsSlinky.babylonjs.engineMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/DeviceInput/index", JSImport.Namespace)
@js.native
object deviceInputIndexMod extends js.Object {
  
  @js.native
  class DeviceInputSystem protected ()
    extends typingsSlinky.babylonjs.deviceInputSystemMod.DeviceInputSystem
  /* static members */
  @js.native
  object DeviceInputSystem extends js.Object {
    
    /**
      * Creates a new DeviceInputSystem instance
      * @param engine Engine to pull input element from
      * @returns The new instance
      */
    def Create(engine: Engine): typingsSlinky.babylonjs.deviceInputSystemMod.DeviceInputSystem = js.native
    
    var _MAX_KEYCODES: js.Any = js.native
    
    var _MAX_POINTER_INPUTS: js.Any = js.native
  }
  
  @js.native
  class DeviceSource[T /* <: DeviceType */] protected ()
    extends typingsSlinky.babylonjs.deviceSourceManagerMod.DeviceSource[T] {
    /**
      * Default Constructor
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    def this(
      deviceInputSystem: typingsSlinky.babylonjs.deviceInputSystemMod.DeviceInputSystem,
      /** Type of device */
    deviceType: DeviceType
    ) = this()
    def this(
      deviceInputSystem: typingsSlinky.babylonjs.deviceInputSystemMod.DeviceInputSystem,
      /** Type of device */
    deviceType: DeviceType,
      /** "Slot" or index that device is referenced in */
    deviceSlot: Double
    ) = this()
  }
  
  @js.native
  class DeviceSourceManager protected ()
    extends typingsSlinky.babylonjs.deviceSourceManagerMod.DeviceSourceManager {
    /**
      * Default Constructor
      * @param engine engine to pull input element from
      */
    def this(engine: Engine) = this()
  }
  
  @js.native
  object DeviceType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.deviceEnumsMod.DeviceType with Double] = js.native
    
    /* 4 */ val DualShock: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.DualShock with Double = js.native
    
    /* 0 */ val Generic: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.Generic with Double = js.native
    
    /* 1 */ val Keyboard: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.Keyboard with Double = js.native
    
    /* 2 */ val Mouse: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.Mouse with Double = js.native
    
    /* 6 */ val Switch: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.Switch with Double = js.native
    
    /* 3 */ val Touch: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.Touch with Double = js.native
    
    /* 5 */ val Xbox: typingsSlinky.babylonjs.deviceEnumsMod.DeviceType.Xbox with Double = js.native
  }
  
  @js.native
  object DualShockInput extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput with Double] = js.native
    
    /* 1 */ val Circle: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Circle with Double = js.native
    
    /* 0 */ val Cross: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Cross with Double = js.native
    
    /* 13 */ val DPadDown: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.DPadDown with Double = js.native
    
    /* 14 */ val DPadLeft: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.DPadLeft with Double = js.native
    
    /* 15 */ val DPadRight: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.DPadRight with Double = js.native
    
    /* 12 */ val DPadUp: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.DPadUp with Double = js.native
    
    /* 16 */ val Home: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Home with Double = js.native
    
    /* 4 */ val L1: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.L1 with Double = js.native
    
    /* 6 */ val L2: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.L2 with Double = js.native
    
    /* 10 */ val L3: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.L3 with Double = js.native
    
    /* 18 */ val LStickXAxis: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.LStickXAxis with Double = js.native
    
    /* 19 */ val LStickYAxis: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.LStickYAxis with Double = js.native
    
    /* 9 */ val Options: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Options with Double = js.native
    
    /* 5 */ val R1: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.R1 with Double = js.native
    
    /* 7 */ val R2: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.R2 with Double = js.native
    
    /* 11 */ val R3: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.R3 with Double = js.native
    
    /* 20 */ val RStickXAxis: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.RStickXAxis with Double = js.native
    
    /* 21 */ val RStickYAxis: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.RStickYAxis with Double = js.native
    
    /* 8 */ val Share: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Share with Double = js.native
    
    /* 2 */ val Square: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Square with Double = js.native
    
    /* 17 */ val TouchPad: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.TouchPad with Double = js.native
    
    /* 3 */ val Triangle: typingsSlinky.babylonjs.deviceEnumsMod.DualShockInput.Triangle with Double = js.native
  }
  
  @js.native
  object PointerInput extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.deviceEnumsMod.PointerInput with Double] = js.native
    
    /* 5 */ val BrowserBack: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.BrowserBack with Double = js.native
    
    /* 6 */ val BrowserForward: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.BrowserForward with Double = js.native
    
    /* 0 */ val Horizontal: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.Horizontal with Double = js.native
    
    /* 2 */ val LeftClick: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.LeftClick with Double = js.native
    
    /* 3 */ val MiddleClick: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.MiddleClick with Double = js.native
    
    /* 4 */ val RightClick: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.RightClick with Double = js.native
    
    /* 1 */ val Vertical: typingsSlinky.babylonjs.deviceEnumsMod.PointerInput.Vertical with Double = js.native
  }
  
  @js.native
  object SwitchInput extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput with Double] = js.native
    
    /* 1 */ val A: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.A with Double = js.native
    
    /* 0 */ val B: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.B with Double = js.native
    
    /* 17 */ val Capture: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.Capture with Double = js.native
    
    /* 13 */ val DPadDown: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.DPadDown with Double = js.native
    
    /* 14 */ val DPadLeft: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.DPadLeft with Double = js.native
    
    /* 15 */ val DPadRight: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.DPadRight with Double = js.native
    
    /* 12 */ val DPadUp: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.DPadUp with Double = js.native
    
    /* 16 */ val Home: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.Home with Double = js.native
    
    /* 4 */ val L: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.L with Double = js.native
    
    /* 10 */ val LS: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.LS with Double = js.native
    
    /* 18 */ val LStickXAxis: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.LStickXAxis with Double = js.native
    
    /* 19 */ val LStickYAxis: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.LStickYAxis with Double = js.native
    
    /* 8 */ val Minus: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.Minus with Double = js.native
    
    /* 9 */ val Plus: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.Plus with Double = js.native
    
    /* 5 */ val R: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.R with Double = js.native
    
    /* 11 */ val RS: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.RS with Double = js.native
    
    /* 20 */ val RStickXAxis: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.RStickXAxis with Double = js.native
    
    /* 21 */ val RStickYAxis: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.RStickYAxis with Double = js.native
    
    /* 3 */ val X: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.X with Double = js.native
    
    /* 2 */ val Y: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.Y with Double = js.native
    
    /* 6 */ val ZL: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.ZL with Double = js.native
    
    /* 7 */ val ZR: typingsSlinky.babylonjs.deviceEnumsMod.SwitchInput.ZR with Double = js.native
  }
  
  @js.native
  object XboxInput extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.babylonjs.deviceEnumsMod.XboxInput with Double] = js.native
    
    /* 0 */ val A: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.A with Double = js.native
    
    /* 1 */ val B: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.B with Double = js.native
    
    /* 8 */ val Back: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.Back with Double = js.native
    
    /* 13 */ val DPadDown: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.DPadDown with Double = js.native
    
    /* 14 */ val DPadLeft: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.DPadLeft with Double = js.native
    
    /* 15 */ val DPadRight: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.DPadRight with Double = js.native
    
    /* 12 */ val DPadUp: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.DPadUp with Double = js.native
    
    /* 16 */ val Home: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.Home with Double = js.native
    
    /* 4 */ val LB: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.LB with Double = js.native
    
    /* 10 */ val LS: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.LS with Double = js.native
    
    /* 17 */ val LStickXAxis: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.LStickXAxis with Double = js.native
    
    /* 18 */ val LStickYAxis: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.LStickYAxis with Double = js.native
    
    /* 6 */ val LT: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.LT with Double = js.native
    
    /* 5 */ val RB: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.RB with Double = js.native
    
    /* 11 */ val RS: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.RS with Double = js.native
    
    /* 19 */ val RStickXAxis: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.RStickXAxis with Double = js.native
    
    /* 20 */ val RStickYAxis: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.RStickYAxis with Double = js.native
    
    /* 7 */ val RT: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.RT with Double = js.native
    
    /* 9 */ val Start: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.Start with Double = js.native
    
    /* 2 */ val X: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.X with Double = js.native
    
    /* 3 */ val Y: typingsSlinky.babylonjs.deviceEnumsMod.XboxInput.Y with Double = js.native
  }
}
