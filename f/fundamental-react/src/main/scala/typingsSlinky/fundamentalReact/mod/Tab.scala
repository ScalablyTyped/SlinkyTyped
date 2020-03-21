package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialTabProps
import typingsSlinky.fundamentalReact.WeakValidationMapTabProps
import typingsSlinky.fundamentalReact.tabMod.TabProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Tab")
@js.native
object Tab extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTabProps] = js.native
  var displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Tab] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
  def apply(props: PropsWithChildren[TabProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TabProps], context: js.Any): ReactElement | Null = js.native
}

