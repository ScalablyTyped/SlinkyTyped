package typingsSlinky.materialUiStyles

import slinky.core.ReactComponentClass
import typingsSlinky.materialUiStyles.materialUiStylesStrings.innerRef
import typingsSlinky.materialUiStyles.materialUiStylesStrings.theme
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsSlinky.materialUiTypes.mod.ConsistentWith
import typingsSlinky.materialUiTypes.mod.Omit
import typingsSlinky.materialUiTypes.mod.PropInjector
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withThemeMod {
  
  @JSImport("@material-ui/styles/withTheme", JSImport.Default)
  @js.native
  def default[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], js.Object]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  @JSImport("@material-ui/styles/withTheme", JSImport.Default)
  @js.native
  def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  
  @JSImport("@material-ui/styles/withTheme", "withThemeCreator")
  @js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  @JSImport("@material-ui/styles/withTheme", "withThemeCreator")
  @js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
}
