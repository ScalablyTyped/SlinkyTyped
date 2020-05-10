package typingsSlinky.fundamentalReact

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.fundamentalReactStrings.ListDotText
import typingsSlinky.fundamentalReact.listMod.ListTextProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/List/List.ListTextProps> & {  displayName  :'List.Text'} */
@js.native
trait FunctionComponentListText extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialListTextProps] = js.native
  var displayName: js.UndefOr[String with ListDotText] = js.native
  var propTypes: js.UndefOr[WeakValidationMapListText] = js.native
  def apply(props: PropsWithChildren[ListTextProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[ListTextProps], context: js.Any): ReactElement | Null = js.native
}

