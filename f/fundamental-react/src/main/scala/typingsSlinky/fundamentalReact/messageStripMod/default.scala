package typingsSlinky.fundamentalReact.messageStripMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialMessageStripProps
import typingsSlinky.fundamentalReact.WeakValidationMapMessageS
import typingsSlinky.fundamentalReact.fundamentalReactStrings.MessageStrip
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/MessageStrip/MessageStrip", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialMessageStripProps] = js.native
  var displayName: js.UndefOr[MessageStrip | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapMessageS] = js.native
  def apply(props: PropsWithChildren[MessageStripProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[MessageStripProps], context: js.Any): ReactElement | Null = js.native
}

