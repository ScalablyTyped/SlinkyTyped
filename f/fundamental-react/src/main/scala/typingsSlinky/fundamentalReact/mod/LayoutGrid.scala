package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialLayoutGridProps
import typingsSlinky.fundamentalReact.WeakValidationMapLayoutGr
import typingsSlinky.fundamentalReact.fundamentalReactStrings.LayoutGridProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "LayoutGrid")
@js.native
object LayoutGrid extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  var displayName: js.UndefOr[LayoutGridProps | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
  def apply(props: PropsWithChildren[typingsSlinky.fundamentalReact.layoutGridMod.LayoutGridProps]): ReactElement | Null = js.native
  def apply(
    props: PropsWithChildren[typingsSlinky.fundamentalReact.layoutGridMod.LayoutGridProps],
    context: js.Any
  ): ReactElement | Null = js.native
}

