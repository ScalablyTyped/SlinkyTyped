package typingsSlinky.fluentReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetProps[C] = js.Any
  
  type GetString = js.Function2[/* id */ java.lang.String, /* args */ js.UndefOr[js.Object], java.lang.String]
  
  type MarkupParser = js.Function1[/* str */ java.lang.String, js.Array[typingsSlinky.fluentReact.mod.Node]]
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.fluentReact.fluentReactStrings.Matching with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsSlinky.fluentReact.fluentReactStrings.Shared with org.scalablytyped.runtime.TopLevel[js.Any]
}
