package typingsSlinky.fundamentalReact.counterMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialCounterProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapCounterP
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Counter
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react/lib/Counter/Counter", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[CounterProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[CounterProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialCounterProps] = js.native
  
  var displayName: js.UndefOr[Counter | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapCounterP] = js.native
}
