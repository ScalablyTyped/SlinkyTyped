package typingsSlinky.fundamentalReact.buttonMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialButtonProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapButtonPr
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Button
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/Button/Button", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[ButtonProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ButtonProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialButtonProps] = js.native
  
  var displayName: js.UndefOr[Button | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
}
