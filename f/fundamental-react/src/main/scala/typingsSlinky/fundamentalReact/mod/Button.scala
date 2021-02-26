package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialButtonProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapButtonPr
import typingsSlinky.fundamentalReact.buttonMod.ButtonProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/Button.ButtonProps> & {  displayName :'Button'} */
object Button {
  
  @JSImport("fundamental-react", "Button")
  @js.native
  def apply(props: PropsWithChildren[ButtonProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Button")
  @js.native
  def apply(props: PropsWithChildren[ButtonProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Button.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Button.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialButtonProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Button.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Button | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Button | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Button.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapButtonPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
