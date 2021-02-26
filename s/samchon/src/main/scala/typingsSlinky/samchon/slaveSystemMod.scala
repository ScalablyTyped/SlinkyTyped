package typingsSlinky.samchon

import typingsSlinky.samchon.icommunicatorMod.ICommunicator
import typingsSlinky.samchon.invokeMod.Invoke
import typingsSlinky.samchon.iprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slaveSystemMod {
  
  @JSImport("samchon/templates/slave/SlaveSystem", "SlaveSystem")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem () extends IProtocol {
    
    var _Complete_process: js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Reply_data(invoke: Invoke): Unit = js.native
    
    /**
      * @hidden
      */
    var communicator_ : ICommunicator = js.native
  }
}
