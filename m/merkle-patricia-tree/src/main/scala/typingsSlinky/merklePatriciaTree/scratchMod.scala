package typingsSlinky.merklePatriciaTree

import typingsSlinky.merklePatriciaTree.dbMod.DB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scratchMod {
  
  @JSImport("merkle-patricia-tree/dist/scratch", "ScratchDB")
  @js.native
  class ScratchDB protected () extends DB {
    def this(upstreamDB: DB) = this()
    
    var _upstream: js.Any = js.native
  }
}
