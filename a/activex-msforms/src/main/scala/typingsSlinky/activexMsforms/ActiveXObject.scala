package typingsSlinky.activexMsforms

import typingsSlinky.activexMsforms.MSForms.CheckBox
import typingsSlinky.activexMsforms.MSForms.ComboBox
import typingsSlinky.activexMsforms.MSForms.CommandButton
import typingsSlinky.activexMsforms.MSForms.Control
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ContainerBeforeDragOverArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ContainerBeforeDragOverParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ContainerBeforeDropOrPasteArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ContainerBeforeDropOrPasteParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ContainerScrollArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ContainerScrollParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ControlBeforeDragOverArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ControlBeforeDragOverParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ControlBeforeDropOrPasteArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ControlBeforeDropOrPasteParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ErrorArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.ErrorParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageBeforeDragOverArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageBeforeDragOverParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageBeforeDropOrPasteArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageBeforeDropOrPasteParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageErrorArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageErrorParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageScrollArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.MultiPageScrollParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.TabStripBeforeDragOverArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.TabStripBeforeDragOverParameter
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.TabStripBeforeDropOrPasteArgNames
import typingsSlinky.activexMsforms.MSForms.EventHelperTypes.TabStripBeforeDropOrPasteParameter
import typingsSlinky.activexMsforms.MSForms.Frame
import typingsSlinky.activexMsforms.MSForms.HTMLCheckbox
import typingsSlinky.activexMsforms.MSForms.HTMLHidden
import typingsSlinky.activexMsforms.MSForms.HTMLImage
import typingsSlinky.activexMsforms.MSForms.HTMLOption
import typingsSlinky.activexMsforms.MSForms.HTMLPassword
import typingsSlinky.activexMsforms.MSForms.HTMLReset
import typingsSlinky.activexMsforms.MSForms.HTMLSelect
import typingsSlinky.activexMsforms.MSForms.HTMLSubmit
import typingsSlinky.activexMsforms.MSForms.HTMLText
import typingsSlinky.activexMsforms.MSForms.HTMLTextArea
import typingsSlinky.activexMsforms.MSForms.Image
import typingsSlinky.activexMsforms.MSForms.Label
import typingsSlinky.activexMsforms.MSForms.ListBox
import typingsSlinky.activexMsforms.MSForms.MultiPage
import typingsSlinky.activexMsforms.MSForms.OptionButton
import typingsSlinky.activexMsforms.MSForms.ScrollBar
import typingsSlinky.activexMsforms.MSForms.SpinButton
import typingsSlinky.activexMsforms.MSForms.TabStrip
import typingsSlinky.activexMsforms.MSForms.TextBox
import typingsSlinky.activexMsforms.MSForms.ToggleButton
import typingsSlinky.activexMsforms.MSForms.UserForm
import typingsSlinky.activexMsforms.activexMsformsStrings.AddControl
import typingsSlinky.activexMsforms.activexMsformsStrings.AfterUpdate
import typingsSlinky.activexMsforms.activexMsformsStrings.BeforeDragOver
import typingsSlinky.activexMsforms.activexMsformsStrings.BeforeDropOrPaste
import typingsSlinky.activexMsforms.activexMsformsStrings.BeforeUpdate
import typingsSlinky.activexMsforms.activexMsformsStrings.Button
import typingsSlinky.activexMsforms.activexMsformsStrings.Cancel
import typingsSlinky.activexMsforms.activexMsformsStrings.Change
import typingsSlinky.activexMsforms.activexMsformsStrings.Click
import typingsSlinky.activexMsforms.activexMsformsStrings.Column
import typingsSlinky.activexMsforms.activexMsformsStrings.DblClick
import typingsSlinky.activexMsforms.activexMsformsStrings.DropButtonClick
import typingsSlinky.activexMsforms.activexMsformsStrings.Enter
import typingsSlinky.activexMsforms.activexMsformsStrings.Error
import typingsSlinky.activexMsforms.activexMsformsStrings.Exit
import typingsSlinky.activexMsforms.activexMsformsStrings.Index
import typingsSlinky.activexMsforms.activexMsformsStrings.KeyAscii
import typingsSlinky.activexMsforms.activexMsformsStrings.KeyCode
import typingsSlinky.activexMsforms.activexMsformsStrings.KeyDown
import typingsSlinky.activexMsforms.activexMsformsStrings.KeyPress
import typingsSlinky.activexMsforms.activexMsformsStrings.KeyUp
import typingsSlinky.activexMsforms.activexMsformsStrings.Layout
import typingsSlinky.activexMsforms.activexMsformsStrings.List
import typingsSlinky.activexMsforms.activexMsformsStrings.MouseDown
import typingsSlinky.activexMsforms.activexMsformsStrings.MouseMove
import typingsSlinky.activexMsforms.activexMsformsStrings.MouseUp
import typingsSlinky.activexMsforms.activexMsformsStrings.Percent
import typingsSlinky.activexMsforms.activexMsformsStrings.RemoveControl
import typingsSlinky.activexMsforms.activexMsformsStrings.Scroll
import typingsSlinky.activexMsforms.activexMsformsStrings.Selected
import typingsSlinky.activexMsforms.activexMsformsStrings.Shift
import typingsSlinky.activexMsforms.activexMsformsStrings.SpinDown
import typingsSlinky.activexMsforms.activexMsformsStrings.SpinUp
import typingsSlinky.activexMsforms.activexMsformsStrings.X
import typingsSlinky.activexMsforms.activexMsformsStrings.Y
import typingsSlinky.activexMsforms.activexMsformsStrings.Zoom
import typingsSlinky.activexMsforms.anon.CancelIndex
import typingsSlinky.activexMsforms.anon.IndexNumber
import typingsSlinky.activexMsforms.anon.IndexPercent
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: CheckBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ CheckBox, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ComboBox, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ CommandButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Control,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Control,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: AddControl,
    argNames: js.Array[typingsSlinky.activexMsforms.activexMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Control, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: RemoveControl,
    argNames: js.Array[typingsSlinky.activexMsforms.activexMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Control, Unit]
  ): Unit = js.native
  def on(
    obj: Frame,
    event: Zoom,
    argNames: js.Array[Percent],
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ typingsSlinky.activexMsforms.anon.Percent, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: AddControl,
    argNames: js.Tuple2[Index, typingsSlinky.activexMsforms.activexMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ typingsSlinky.activexMsforms.anon.Index, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: Click,
    argNames: js.Array[Index],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ IndexNumber, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: DblClick,
    argNames: js.Tuple2[Index, Cancel],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ CancelIndex, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ MultiPage, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ MultiPage, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ MultiPage, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: Layout,
    argNames: js.Array[Index],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ IndexNumber, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: MouseDown,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ typingsSlinky.activexMsforms.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: MouseMove,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ typingsSlinky.activexMsforms.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: MouseUp,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ typingsSlinky.activexMsforms.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: RemoveControl,
    argNames: js.Tuple2[Index, typingsSlinky.activexMsforms.activexMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ typingsSlinky.activexMsforms.anon.Index, Unit]
  ): Unit = js.native
  def on(
    obj: MultiPage,
    event: Zoom,
    argNames: js.Tuple2[Index, Percent],
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ IndexPercent, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ OptionButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ScrollBar,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ScrollBar, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ScrollBar,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ScrollBar, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ScrollBar,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ScrollBar, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SpinButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ SpinButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SpinButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ SpinButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: SpinButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ SpinButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: Click,
    argNames: js.Array[Index],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ IndexNumber, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: DblClick,
    argNames: js.Tuple2[Index, Cancel],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ CancelIndex, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ TabStrip, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: MouseDown,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ typingsSlinky.activexMsforms.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: MouseMove,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ typingsSlinky.activexMsforms.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: TabStrip,
    event: MouseUp,
    argNames: js.Tuple5[Index, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ typingsSlinky.activexMsforms.anon.Shift, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[
      /* this */ ToggleButton, 
      /* parameter */ typingsSlinky.activexMsforms.anon.Button, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: AddControl,
    argNames: js.Array[typingsSlinky.activexMsforms.activexMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Control, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[
      /* this */ UserForm, 
      /* parameter */ typingsSlinky.activexMsforms.anon.KeyAscii, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.KeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: RemoveControl,
    argNames: js.Array[typingsSlinky.activexMsforms.activexMsformsStrings.Control],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Control, Unit]
  ): Unit = js.native
  def on(
    obj: UserForm,
    event: Zoom,
    argNames: js.Array[Percent],
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ typingsSlinky.activexMsforms.anon.Percent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: Control,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: CheckBox,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ComboBox,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: CommandButton,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: Frame,
    event: BeforeDragOver,
    argNames: ContainerBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ ContainerBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: Image,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: Label,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ListBox,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: MultiPage,
    event: BeforeDragOver,
    argNames: MultiPageBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPageBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: OptionButton,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ScrollBar,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: SpinButton,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: TabStrip,
    event: BeforeDragOver,
    argNames: TabStripBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ TabStripBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: TextBox,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: ToggleButton,
    event: BeforeDragOver,
    argNames: ControlBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ ControlBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDragOver(
    obj: UserForm,
    event: BeforeDragOver,
    argNames: ContainerBeforeDragOverArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ ContainerBeforeDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: CheckBox,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ComboBox,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: CommandButton,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: Frame,
    event: BeforeDropOrPaste,
    argNames: ContainerBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ ContainerBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: Image,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: Label,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ListBox,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: MultiPage,
    event: BeforeDropOrPaste,
    argNames: MultiPageBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPageBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: OptionButton,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ScrollBar,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: SpinButton,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: TabStrip,
    event: BeforeDropOrPaste,
    argNames: TabStripBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ TabStripBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: TextBox,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: ToggleButton,
    event: BeforeDropOrPaste,
    argNames: ControlBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ ControlBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeDropOrPaste(
    obj: UserForm,
    event: BeforeDropOrPaste,
    argNames: ContainerBeforeDropOrPasteArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ ContainerBeforeDropOrPasteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: CheckBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ComboBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ListBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: MultiPage,
    event: Change,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: OptionButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ScrollBar,
    event: Change,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: SpinButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TabStrip,
    event: Change,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TextBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ToggleButton,
    event: Change,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CheckBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ComboBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CommandButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Frame,
    event: Click,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLCheckbox,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLCheckbox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLHidden,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLHidden, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLImage,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLImage, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLPassword,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLPassword, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLReset,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLReset, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLSelect,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLSelect, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLSubmit,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLSubmit, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLTextArea,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLTextArea, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: HTMLText,
    event: Click,
    handler: js.ThisFunction1[/* this */ HTMLText, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Image,
    event: Click,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Label,
    event: Click,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ListBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ToggleButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: UserForm,
    event: Click,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: ComboBox,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DropButtonClick(
    obj: TextBox,
    event: DropButtonClick,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: Control,
    event: Enter,
    handler: js.ThisFunction1[/* this */ Control, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: CheckBox,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ComboBox,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: CommandButton,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: Frame,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: Image,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: Label,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ListBox,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: MultiPage,
    event: Error,
    argNames: MultiPageErrorArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPageErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: OptionButton,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ScrollBar,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: SpinButton,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: TabStrip,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ TabStrip, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: TextBox,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: ToggleButton,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Error(
    obj: UserForm,
    event: Error,
    argNames: ErrorArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ ErrorParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Layout(
    obj: Frame,
    event: Layout,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Layout(
    obj: UserForm,
    event: Layout,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: Frame,
    event: Scroll,
    argNames: ContainerScrollArgNames,
    handler: js.ThisFunction1[/* this */ Frame, /* parameter */ ContainerScrollParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: MultiPage,
    event: Scroll,
    argNames: MultiPageScrollArgNames,
    handler: js.ThisFunction1[/* this */ MultiPage, /* parameter */ MultiPageScrollParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: ScrollBar,
    event: Scroll,
    handler: js.ThisFunction1[/* this */ ScrollBar, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Scroll(
    obj: UserForm,
    event: Scroll,
    argNames: ContainerScrollArgNames,
    handler: js.ThisFunction1[/* this */ UserForm, /* parameter */ ContainerScrollParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SpinDown(
    obj: SpinButton,
    event: SpinDown,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_SpinUp(
    obj: SpinButton,
    event: SpinUp,
    handler: js.ThisFunction1[/* this */ SpinButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  
  @JSName("set")
  def set_Column(obj: ComboBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Column(obj: ComboBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_Column(obj: ComboBox, propertyName: Column, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Column(obj: ListBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Column(obj: ListBox, propertyName: Column, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_Column(obj: ListBox, propertyName: Column, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_List(obj: ComboBox, propertyName: List, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ListBox, propertyName: List, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_List(obj: ListBox, propertyName: List, parameterTypes: js.Array[Double], newValue: SafeArray[_]): Unit = js.native
  @JSName("set")
  def set_List(obj: ListBox, propertyName: List, parameterTypes: js.Tuple2[Double, Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_Selected(obj: ListBox, propertyName: Selected, parameterTypes: js.Array[_], newValue: Boolean): Unit = js.native
}
