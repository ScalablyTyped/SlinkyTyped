package typingsSlinky.samchon.templatesMod

import typingsSlinky.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates", "slave")
@js.native
object slave extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory ()
    extends typingsSlinky.samchon.slaveMod.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @js.native
  class PInvoke protected ()
    extends typingsSlinky.samchon.slaveMod.PInvoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(
      invoke: Invoke,
      history: typingsSlinky.samchon.invokeHistoryMod.InvokeHistory,
      slaveSystem: typingsSlinky.samchon.slaveSystemMod.SlaveSystem
    ) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends typingsSlinky.samchon.slaveMod.SlaveClient
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends typingsSlinky.samchon.slaveMod.SlaveServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends typingsSlinky.samchon.slaveMod.SlaveSystem
}
