package typingsSlinky.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMaterialDashUiCoreMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.atMaterialDashUiCore.Anon_ClassName
  import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.classes
  import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
  import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ConsistentWith with js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Overwrite[T, U] = (Omit[T, String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    ReactComponentClass[(Omit[LibraryManagedAttributes[_, PropsOf[_]], String]) with AdditionalProps]
  ]
  type PropsOf[C] = /* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[C] */ js.Any
  type StandardProps[C, ClassKey /* <: String */, Removals /* <: String */] = (Omit[C, classes | Removals]) with StyledComponentProps[ClassKey] with Anon_ClassName
}
