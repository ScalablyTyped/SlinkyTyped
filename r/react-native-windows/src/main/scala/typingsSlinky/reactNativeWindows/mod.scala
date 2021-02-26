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
import typingsSlinky.reactNativeWindows.glyphPropsMod.GlyphProps
import typingsSlinky.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import typingsSlinky.reactNativeWindows.pickerPropsMod.IPickerProps
import typingsSlinky.reactNativeWindows.pickerWindowsMod.PickerItem
import typingsSlinky.reactNativeWindows.pickerWindowsMod.PickerPropsWithChildren
import typingsSlinky.reactNativeWindows.pickerWindowsMod.State
import typingsSlinky.reactNativeWindows.popupMod.IPopupTargetState
import typingsSlinky.reactNativeWindows.popupPropsMod.IPopupProps
import typingsSlinky.reactNativeWindows.viewWindowsMod.ViewWindowsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-windows", "AppTheme")
  @js.native
  val AppTheme: AppThemeModule | MissingNativeAppThemeShim = js.native
  
  @JSImport("react-native-windows", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends typingsSlinky.reactNativeWindows.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
  }
  /* static members */
  object DatePicker {
    
    @JSImport("react-native-windows", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-windows", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-windows", "EventPhase")
  @js.native
  object EventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase with Double] = js.native
    
    /* 2 */ val AtTarget: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.AtTarget with Double = js.native
    
    /* 3 */ val Bubbling: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.Capturing with Double = js.native
    
    /* 0 */ val None: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.EventPhase.None with Double = js.native
  }
  
  @JSImport("react-native-windows", "Flyout")
  @js.native
  class Flyout protected ()
    extends typingsSlinky.reactNativeWindows.flyoutMod.Flyout {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  object Flyout {
    
    @JSImport("react-native-windows", "Flyout.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = js.native
  }
  
  @JSImport("react-native-windows", "Glyph")
  @js.native
  class Glyph protected ()
    extends typingsSlinky.reactNativeWindows.glyphMod.Glyph {
    def this(props: GlyphProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GlyphProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-windows", "HandledEventPhase")
  @js.native
  object HandledEventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase with Double
      ] = js.native
    
    /* 3 */ val Bubbling: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typingsSlinky.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Capturing with Double = js.native
  }
  
  @JSImport("react-native-windows", "Picker")
  @js.native
  class Picker protected ()
    extends typingsSlinky.reactNativeWindows.pickerWindowsMod.Picker {
    def this(props: IPickerProps) = this()
  }
  /* static members */
  object Picker {
    
    @JSImport("react-native-windows", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-windows", "Picker.Item")
    @js.native
    def Item: Instantiable0[PickerItem] = js.native
    @scala.inline
    def Item_=(x: Instantiable0[PickerItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-windows", "Picker.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: PickerPropsWithChildren): State = js.native
  }
  
  @JSImport("react-native-windows", "Popup")
  @js.native
  class Popup protected ()
    extends typingsSlinky.reactNativeWindows.popupMod.Popup {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  object Popup {
    
    @JSImport("react-native-windows", "Popup.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = js.native
  }
  
  @JSImport("react-native-windows", "ViewWindows")
  @js.native
  val ViewWindows: ViewWindowsType = js.native
  
  @JSImport("react-native-windows", "supportKeyboard")
  @js.native
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
}
