package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialButtonGroupProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapButtonGr
import typingsSlinky.fundamentalReact.buttonGroupMod.ButtonGroupProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/ButtonGroup.ButtonGroupProps> & {  displayName :'ButtonGroup'} */
object ButtonGroup {
  
  @JSImport("fundamental-react", "ButtonGroup")
  @js.native
  def apply(props: PropsWithChildren[ButtonGroupProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "ButtonGroup")
  @js.native
  def apply(props: PropsWithChildren[ButtonGroupProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "ButtonGroup.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ButtonGroup.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialButtonGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ButtonGroup.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.ButtonGroup | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.ButtonGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ButtonGroup.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapButtonGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
