package typingsSlinky.glaze

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.glaze.glazeStrings.aliases
import typingsSlinky.glaze.glazeStrings.shorthands
import typingsSlinky.glaze.themeMod.Tokens
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Extract
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/useStyling", JSImport.Namespace)
@js.native
object useStylingMod extends js.Object {
  
  def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = js.native
  
  type ResolveAlias[T /* <: Tokens[aliases] */] = (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T] */ js.Any) | (ResolveShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T] */ js.Any
  ])
  
  type ResolveShorthand[T /* <: Tokens[shorthands] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<ThemeOrAny['shorthands'][T], number> */ js.Any
  
  type ScaleKeys[Property] = LiteralUnion[
    Extract[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['scales'][/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['matchers'][std.Extract<Property, glaze.glaze/dist-types/theme.Tokens<'matchers'>>]] */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<CSSProperties> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<CSSProperties> */ js.Any
  ]
  
  type ThemedStyle = CSSProperties with typingsSlinky.glaze.glazeStrings.ThemedStyle with TopLevel[js.Any]
}
