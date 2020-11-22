package typingsSlinky.antd.autoCompleteMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.PartialAutoCompletePropsR
import typingsSlinky.antd.anon.WeakValidationMapAutoComp
import typingsSlinky.antd.selectMod.OptionType
import typingsSlinky.antd.selectMod.RefSelectProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ForwardRefExoticComponent<antd.antd/lib/auto-complete.AutoCompleteProps & react.react.RefAttributes<antd.antd/lib/select.RefSelectProps>> & {  Option :antd.antd/lib/select.OptionType} */
@js.native
trait RefAutoCompleteWithOption extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: AutoCompleteProps with RefAttributes[RefSelectProps]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var Option: OptionType = js.native
  
  var defaultProps: js.UndefOr[PartialAutoCompletePropsR] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapAutoComp] = js.native
}
