package typingsSlinky.nodegit

import typingsSlinky.node.Buffer
import typingsSlinky.nodegit.nodegitNumbers.`2`
import typingsSlinky.nodegit.nodegitNumbers.`4`
import typingsSlinky.nodegit.nodegitNumbers.`6`
import typingsSlinky.nodegit.objectMod.Object.TYPE
import typingsSlinky.nodegit.odbExpandIdMod.OdbExpandId
import typingsSlinky.nodegit.odbObjectMod.OdbObject
import typingsSlinky.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odbMod {
  
  @JSImport("nodegit/odb", "Odb")
  @js.native
  class Odb () extends StObject {
    
    def addDiskAlternate(path: String): Double = js.native
    
    def expandIds(ids: OdbExpandId, count: Double): Double = js.native
    
    def free(): Unit = js.native
    
    def read(id: Oid): js.Promise[OdbObject] = js.native
    
    def write(data: Buffer, len: Double, `type`: TYPE): js.Promise[Oid] = js.native
  }
  /* static members */
  object Odb {
    
    @JSImport("nodegit/odb", "Odb.open")
    @js.native
    def open(objectsDir: String): js.Promise[Odb] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.nodegit.nodegitNumbers.`2`
      - typingsSlinky.nodegit.nodegitNumbers.`4`
      - typingsSlinky.nodegit.nodegitNumbers.`6`
    */
    trait STREAM extends StObject
    object STREAM {
      
      @scala.inline
      def RDONLY: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def RW: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def WRONLY: `4` = 4.asInstanceOf[`4`]
    }
  }
}
