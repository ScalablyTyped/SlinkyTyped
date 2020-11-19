package typingsSlinky.jscodeshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object variableDeclaratorMod {
  
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  
  type Filter = js.Function1[
    /* path */ typingsSlinky.jscodeshift.variableDeclaratorMod.ASTPath[js.Any], 
    scala.Boolean
  ]
}
