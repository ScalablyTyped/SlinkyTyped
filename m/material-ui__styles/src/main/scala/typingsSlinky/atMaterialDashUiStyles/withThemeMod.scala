package typingsSlinky.atMaterialDashUiStyles

import slinky.core.ReactComponentClass
import typingsSlinky.atMaterialDashUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsSlinky.atMaterialDashUiStyles.withThemeWithThemeMod.WithTheme
import typingsSlinky.atMaterialDashUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesMod.PropInjector
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withTheme", JSImport.Namespace)
@js.native
object withThemeMod extends js.Object {
  def default[Theme](component: ComponentClass[js.Object, ComponentState]): ReactComponentClass[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def default[Theme](component: FunctionComponent[js.Object]): ReactComponentClass[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
}

