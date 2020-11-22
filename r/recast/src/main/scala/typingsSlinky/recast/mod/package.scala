package typingsSlinky.recast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Transformer = js.Function2[
    /* ast */ typingsSlinky.astTypes.typesMod.ASTNode, 
    /* callback */ js.Function1[/* ast */ typingsSlinky.astTypes.typesMod.ASTNode, scala.Unit], 
    scala.Unit
  ]
}
