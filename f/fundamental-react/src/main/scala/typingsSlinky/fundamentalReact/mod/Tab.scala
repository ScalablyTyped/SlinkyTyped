package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialTabProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapTabProps
import typingsSlinky.fundamentalReact.tabMod.TabProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> & {  displayName :'Tab'} */
object Tab {
  
  @JSImport("fundamental-react", "Tab")
  @js.native
  def apply(props: PropsWithChildren[TabProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Tab")
  @js.native
  def apply(props: PropsWithChildren[TabProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Tab.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTabProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.displayName")
  @js.native
  def displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Tab] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
