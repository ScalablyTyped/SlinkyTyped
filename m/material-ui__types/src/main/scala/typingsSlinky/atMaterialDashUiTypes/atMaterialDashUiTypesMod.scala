package typingsSlinky.atMaterialDashUiTypes

import slinky.core.ReactComponentClass
import typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
import typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.react.reactMod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/types", JSImport.Namespace)
@js.native
object atMaterialDashUiTypesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
  */
  trait And[A, B, C] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
  */
  trait IsAny[T] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`false`
    - typings.atMaterialDashUiTypes.atMaterialDashUiTypesBooleans.`true`
  */
  trait Or[A, B, C] extends js.Object
  
  type CoerceEmptyInterface[T] = T | js.Object
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesStrings.ConsistentWith with js.Any
  type IsEmptyInterface[T] = And[`false` | `true`, `false` | `true`, `true` | `false`]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Overwrite[T, U] = (Omit[T, String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ ReactComponentClass[js.Object], 
    ReactComponentClass[
      (Omit[
        LibraryManagedAttributes[ReactComponentClass[js.Object], ComponentProps[ReactComponentClass[js.Object]]], 
        String
      ]) with AdditionalProps
    ]
  ]
}

