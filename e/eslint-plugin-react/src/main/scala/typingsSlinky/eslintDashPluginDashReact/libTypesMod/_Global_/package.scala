package typingsSlinky.eslintDashPluginDashReact.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  import typingsSlinky.eslint.eslintMod.Rule.RuleFixer
  import typingsSlinky.std.Set

  type Fixer = RuleFixer
  type JSXAttribute = ASTNode
  type JSXElement = ASTNode
  type JSXFragment = ASTNode
  type JSXSpreadAttribute = ASTNode
  type Scope = typingsSlinky.eslint.eslintMod.Scope.Scope
  type Token = typingsSlinky.eslint.eslintMod.AST.Token
  type TypeDeclarationBuilder = js.Function3[
    /* annotation */ ASTNode, 
    /* parentName */ String, 
    /* seen */ Set[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof annotation */ js.Any
    ], 
    js.Object
  ]
  type TypeDeclarationBuilders = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in string ]: eslint-plugin-react.eslint-plugin-react/lib/types._Global_.TypeDeclarationBuilder}
    */ typingsSlinky.eslintDashPluginDashReact.eslintDashPluginDashReactStrings.TypeDeclarationBuilders with js.Any
  type UnionTypeDefinitionChildren = js.Array[js.Any]
}
