package typingsSlinky.materialUiStyles.withThemeWithThemeMod

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiTypes.mod.ConsistentWith
import typingsSlinky.materialUiTypes.mod.Omit
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withTheme/withTheme", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def apply[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
}

