package typingsSlinky.atFluentReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFluentReactMod {
  import org.scalajs.dom.raw.Node
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type GetProps[C] = js.Any
  type GetString = js.Function3[
    /* id */ String, 
    /* args */ js.UndefOr[js.Object], 
    /* fallback */ js.UndefOr[String], 
    String
  ]
  type MarkupParser = js.Function1[/* str */ String, js.Array[Node]]
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsSlinky.atFluentReact.atFluentReactStrings.Matching with js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typingsSlinky.atFluentReact.atFluentReactStrings.Shared with js.Any
}
