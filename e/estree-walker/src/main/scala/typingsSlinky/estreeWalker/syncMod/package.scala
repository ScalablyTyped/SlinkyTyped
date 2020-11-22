package typingsSlinky.estreeWalker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object syncMod {
  
  type WalkerHandler = js.ThisFunction4[
    /* this */ typingsSlinky.estreeWalker.walkerMod.WalkerContext, 
    /* node */ typingsSlinky.estree.mod.BaseNode, 
    /* parent */ typingsSlinky.estree.mod.BaseNode, 
    /* key */ java.lang.String, 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
