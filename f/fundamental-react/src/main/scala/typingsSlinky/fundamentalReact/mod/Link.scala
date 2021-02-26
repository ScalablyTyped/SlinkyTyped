package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialLinkProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapLinkProp
import typingsSlinky.fundamentalReact.linkMod.LinkProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Link/Link.LinkProps> & {  displayName :'Link'} */
object Link {
  
  @JSImport("fundamental-react", "Link")
  @js.native
  def apply(props: PropsWithChildren[LinkProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Link")
  @js.native
  def apply(props: PropsWithChildren[LinkProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Link")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Link.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Link.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialLinkProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialLinkProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Link.displayName")
  @js.native
  def displayName: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Link | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typingsSlinky.fundamentalReact.fundamentalReactStrings.Link | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Link.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapLinkProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
