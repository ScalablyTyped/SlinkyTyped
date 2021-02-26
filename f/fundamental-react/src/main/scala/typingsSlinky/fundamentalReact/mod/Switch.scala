package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialSwitchProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapSwitchPr
import typingsSlinky.fundamentalReact.switchMod.SwitchProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> & {  displayName :'Switch'} */
object Switch {
  
  @JSImport("fundamental-react", "Switch")
  @js.native
  def apply(props: PropsWithChildren[SwitchProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Switch")
  @js.native
  def apply(props: PropsWithChildren[SwitchProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Switch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Switch.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Switch.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialSwitchProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialSwitchProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Switch.displayName")
  @js.native
  def displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Switch] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Switch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Switch.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapSwitchPr] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapSwitchPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
