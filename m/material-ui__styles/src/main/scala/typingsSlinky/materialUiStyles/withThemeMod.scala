package typingsSlinky.materialUiStyles

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsSlinky.materialUiTypes.mod.ConsistentWith
import typingsSlinky.materialUiTypes.mod.Omit
import typingsSlinky.materialUiTypes.mod.PropInjector
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withTheme", JSImport.Namespace)
@js.native
object withThemeMod extends js.Object {
  def default[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
}

