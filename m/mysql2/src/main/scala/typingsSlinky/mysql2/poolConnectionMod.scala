package typingsSlinky.mysql2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolConnectionMod {
  
  @JSImport("mysql2/typings/mysql/lib/PoolConnection", JSImport.Namespace)
  @js.native
  class ^ () extends PoolConnection
  
  @js.native
  trait PoolConnection
    extends typingsSlinky.mysql2.connectionMod.^ {
    
    def release(): Unit = js.native
  }
}
