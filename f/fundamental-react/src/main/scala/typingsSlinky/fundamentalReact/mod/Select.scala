package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialSelectProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapSelectPr
import typingsSlinky.fundamentalReact.selectMod.SelectProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Select/Select.SelectProps> & {  displayName :'Select'} */
object Select {
  
  @JSImport("fundamental-react", "Select")
  @js.native
  def apply(props: PropsWithChildren[SelectProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Select")
  @js.native
  def apply(props: PropsWithChildren[SelectProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Select")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Select.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Select.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialSelectProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialSelectProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Select.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Select | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Select | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Select.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapSelectPr] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapSelectPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
