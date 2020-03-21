package typingsSlinky.downshift.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.downshift.AnonBlurButton
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentClass<downshift.downshift.DownshiftProps<Item>, react.react.ComponentState> & {  stateChangeTypes  :{  unknown  :downshift.downshift.StateChangeTypes.unknown,   mouseUp  :downshift.downshift.StateChangeTypes.mouseUp,   itemMouseEnter  :downshift.downshift.StateChangeTypes.itemMouseEnter,   keyDownArrowUp  :downshift.downshift.StateChangeTypes.keyDownArrowUp,   keyDownArrowDown  :downshift.downshift.StateChangeTypes.keyDownArrowDown,   keyDownEscape  :downshift.downshift.StateChangeTypes.keyDownEscape,   keyDownEnter  :downshift.downshift.StateChangeTypes.keyDownEnter,   clickItem  :downshift.downshift.StateChangeTypes.clickItem,   blurInput  :downshift.downshift.StateChangeTypes.blurInput,   changeInput  :downshift.downshift.StateChangeTypes.changeInput,   keyDownSpaceButton  :downshift.downshift.StateChangeTypes.keyDownSpaceButton,   clickButton  :downshift.downshift.StateChangeTypes.clickButton,   blurButton  :downshift.downshift.StateChangeTypes.blurButton,   controlledPropUpdatedSelectedItem  :downshift.downshift.StateChangeTypes.controlledPropUpdatedSelectedItem,   touchEnd  :downshift.downshift.StateChangeTypes.touchEnd}} */
@js.native
trait DownshiftInterface[Item]
  extends Instantiable1[
      /* props */ DownshiftProps[Item], 
      Component[DownshiftProps[Item], ComponentState, js.Any]
    ]
     with Instantiable2[
      /* props */ DownshiftProps[Item], 
      /* context */ js.Any, 
      Component[DownshiftProps[Item], ComponentState, js.Any]
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[DownshiftProps[Item]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[DownshiftProps[Item], js.Object]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[DownshiftProps[Item], js.Object]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[DownshiftProps[Item]]] = js.native
  var stateChangeTypes: AnonBlurButton = js.native
}

