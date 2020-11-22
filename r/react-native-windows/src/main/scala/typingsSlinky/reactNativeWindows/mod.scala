package typingsSlinky.reactNativeWindows

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNativeWindows.anon.Children
import typingsSlinky.reactNativeWindows.appThemeMod.AppThemeModule
import typingsSlinky.reactNativeWindows.appThemeMod.MissingNativeAppThemeShim
import typingsSlinky.reactNativeWindows.datePickerPropsMod.IDatePickerProps
import typingsSlinky.reactNativeWindows.flyoutMod.IFlyoutTargetState
import typingsSlinky.reactNativeWindows.flyoutPropsMod.IFlyoutProps
import typingsSlinky.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import typingsSlinky.reactNativeWindows.pickerPropsMod.IPickerProps
import typingsSlinky.reactNativeWindows.pickerWindowsMod.PickerItem
import typingsSlinky.reactNativeWindows.pickerWindowsMod.PickerPropsWithChildren
import typingsSlinky.reactNativeWindows.pickerWindowsMod.State
import typingsSlinky.reactNativeWindows.popupMod.IPopupTargetState
import typingsSlinky.reactNativeWindows.popupPropsMod.IPopupProps
import typingsSlinky.reactNativeWindows.viewWindowsMod.ViewWindowsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AppTheme: AppThemeModule | MissingNativeAppThemeShim = js.native
  
  val ViewWindows: ViewWindowsType = js.native
  
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
  
  @js.native
  class DatePicker protected ()
    extends typingsSlinky.reactNativeWindows.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
  }
  /* static members */
  @js.native
  object DatePicker extends js.Object {
    
    var defaultProps: IDatePickerProps = js.native
  }
  
  @js.native
  object EventPhase extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase with Double] = js.native
    
    /* 2 */ val AtTarget: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.AtTarget with Double = js.native
    
    /* 3 */ val Bubbling: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.Capturing with Double = js.native
    
    /* 0 */ val None: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.None with Double = js.native
  }
  
  @js.native
  class Flyout protected ()
    extends typingsSlinky.reactNativeWindows.flyoutMod.Flyout {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  @js.native
  object Flyout extends js.Object {
    
    def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = js.native
  }
  
  @js.native
  class Glyph ()
    extends typingsSlinky.reactNativeWindows.glyphMod.Glyph
  
  @js.native
  object HandledEventPhase extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase with Double
      ] = js.native
    
    /* 3 */ val Bubbling: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Capturing with Double = js.native
  }
  
  @js.native
  class Picker protected ()
    extends typingsSlinky.reactNativeWindows.pickerWindowsMod.Picker {
    def this(props: IPickerProps) = this()
  }
  /* static members */
  @js.native
  object Picker extends js.Object {
    
    var Item: Instantiable0[PickerItem] = js.native
    
    def getDerivedStateFromProps(props: PickerPropsWithChildren): State = js.native
  }
  
  @js.native
  class Popup protected ()
    extends typingsSlinky.reactNativeWindows.popupMod.Popup {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  @js.native
  object Popup extends js.Object {
    
    def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = js.native
  }
}
