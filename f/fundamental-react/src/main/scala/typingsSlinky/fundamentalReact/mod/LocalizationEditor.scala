package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.PartialLocalizationEditor
import typingsSlinky.fundamentalReact.anon.WeakValidationMapLocaliza
import typingsSlinky.fundamentalReact.localizationEditorMod.LocalizationEditorProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "LocalizationEditor")
@js.native
object LocalizationEditor extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLocalizationEditor] = js.native
  var displayName: js.UndefOr[
    typingsSlinky.fundamentalReact.fundamentalReactStrings.LocalizationEditor | String
  ] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLocaliza] = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LocalizationEditorProps], context: js.Any): ReactElement | Null = js.native
}

