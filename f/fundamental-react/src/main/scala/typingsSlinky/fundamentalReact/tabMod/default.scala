package typingsSlinky.fundamentalReact.tabMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialTabProps
import typingsSlinky.fundamentalReact.WeakValidationMapTabProps
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Tab
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTabProps] = js.native
  var displayName: js.UndefOr[String | Tab] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
  def apply(props: PropsWithChildren[TabProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TabProps], context: js.Any): ReactElement | Null = js.native
}

