package typingsSlinky.samchon

import typingsSlinky.samchon.iserverMod.IServer
import typingsSlinky.samchon.slaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/SlaveServer", JSImport.Namespace)
@js.native
object slaveServerMod extends js.Object {
  @js.native
  trait ISlaveServer
    extends SlaveSystem
       with IServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends SlaveSystem
       with IServer {
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
    /**
      * @inheritdoc
      */
    /* protected */ def createServerBase(): IServer = js.native
  }
  
}

