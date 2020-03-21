package typingsSlinky.fundamentalReact.localizationEditorMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.PartialLocalizationEditor
import typingsSlinky.fundamentalReact.WeakValidationMapLocaliza
import typingsSlinky.fundamentalReact.fundamentalReactStrings.LocalizationEditor
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/LocalizationEditor/LocalizationEditor", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  var displayName: js.UndefOr[LocalizationEditor | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): ReactElement | Null = js.native
}

