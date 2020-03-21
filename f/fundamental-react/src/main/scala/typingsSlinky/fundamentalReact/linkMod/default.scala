package typingsSlinky.fundamentalReact.linkMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialLinkProps
import typingsSlinky.fundamentalReact.WeakValidationMapLinkProp
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Link
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Link/Link", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLinkProps] = js.native
  var displayName: js.UndefOr[Link | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLinkProp] = js.native
  def apply(props: PropsWithChildren[LinkProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LinkProps], context: js.Any): ReactElement | Null = js.native
}

