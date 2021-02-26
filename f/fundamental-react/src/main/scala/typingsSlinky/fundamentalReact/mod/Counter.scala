package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialCounterProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapCounterP
import typingsSlinky.fundamentalReact.counterMod.CounterProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Counter/Counter.CounterProps> & {  displayName :'Counter'} */
object Counter {
  
  @JSImport("fundamental-react", "Counter")
  @js.native
  def apply(props: PropsWithChildren[CounterProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Counter")
  @js.native
  def apply(props: PropsWithChildren[CounterProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Counter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Counter.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Counter.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialCounterProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialCounterProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Counter.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Counter | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Counter | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Counter.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapCounterP] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapCounterP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
