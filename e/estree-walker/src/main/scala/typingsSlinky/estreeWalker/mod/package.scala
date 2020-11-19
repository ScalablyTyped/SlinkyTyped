package typingsSlinky.estreeWalker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type WalkerListener = js.ThisFunction4[
    /* this */ typingsSlinky.estreeWalker.mod.WalkerContext, 
    /* node */ typingsSlinky.estreeWalker.mod.Node, 
    /* parent */ js.UndefOr[typingsSlinky.estreeWalker.mod.Node], 
    /* prop */ js.UndefOr[java.lang.String], 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
