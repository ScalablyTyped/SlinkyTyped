package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.actionBarMod.ActionBarProps
import typingsSlinky.fundamentalReact.anon.PartialActionBarProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapActionBa
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ActionBar/ActionBar.ActionBarProps> & {  displayName :'ActionBar'} */
object ActionBar {
  
  @JSImport("fundamental-react", "ActionBar")
  @js.native
  def apply(props: PropsWithChildren[ActionBarProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "ActionBar")
  @js.native
  def apply(props: PropsWithChildren[ActionBarProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "ActionBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "ActionBar.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ActionBar.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialActionBarProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialActionBarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ActionBar.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.ActionBar | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.ActionBar | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ActionBar.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapActionBa] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapActionBa]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
