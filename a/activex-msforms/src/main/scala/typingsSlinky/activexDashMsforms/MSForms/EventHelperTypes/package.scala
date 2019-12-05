package typingsSlinky.activexDashMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Action
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.ActionX
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.ActionY
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.ActualDx
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.ActualDy
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Cancel
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.CancelDisplay
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Data
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Description
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.DragState
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Effect
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.HelpContext
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.HelpFile
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Index
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Number
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.RequestDx
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.RequestDy
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.SCode
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Shift
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Source
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.State
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.X
  import typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Y

  type Container_BeforeDragOver_ArgNames = js.Tuple8[
    Cancel, 
    typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control, 
    Data, 
    X, 
    Y, 
    State, 
    Effect, 
    Shift
  ]
  type Container_BeforeDropOrPaste_ArgNames = js.Tuple8[
    Cancel, 
    typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control, 
    Action, 
    Data, 
    X, 
    Y, 
    Effect, 
    Shift
  ]
  type Container_Scroll_ArgNames = js.Tuple6[ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  type Control_BeforeDragOver_ArgNames = js.Tuple7[Cancel, Data, X, Y, DragState, Effect, Shift]
  type Control_BeforeDropOrPaste_ArgNames = js.Tuple7[Cancel, Action, Data, X, Y, Effect, Shift]
  type Error_ArgNames = js.Tuple7[Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  type MultiPage_BeforeDragOver_ArgNames = js.Tuple9[
    Index, 
    Cancel, 
    typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control, 
    Data, 
    X, 
    Y, 
    State, 
    Effect, 
    Shift
  ]
  type MultiPage_BeforeDropOrPaste_ArgNames = js.Tuple9[
    Index, 
    Cancel, 
    typingsSlinky.activexDashMsforms.activexDashMsformsStrings.Control, 
    Action, 
    Data, 
    X, 
    Y, 
    Effect, 
    Shift
  ]
  type MultiPage_Error_ArgNames = js.Tuple8[Index, Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  type MultiPage_Scroll_ArgNames = js.Tuple7[Index, ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  type TabStrip_BeforeDragOver_ArgNames = js.Tuple8[Index, Cancel, Data, X, Y, DragState, Effect, Shift]
  type TabStrip_BeforeDropOrPaste_ArgNames = js.Tuple8[Index, Cancel, Action, Data, X, Y, Effect, Shift]
}
