package typingsSlinky.samchon.mod.templates

import typingsSlinky.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slave {
  
  @JSImport("samchon", "templates.slave.InvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory ()
    extends typingsSlinky.samchon.templatesMod.slave.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @JSImport("samchon", "templates.slave.PInvoke")
  @js.native
  class PInvoke protected ()
    extends typingsSlinky.samchon.templatesMod.slave.PInvoke {
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
  
  @JSImport("samchon", "templates.slave.SlaveClient")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends typingsSlinky.samchon.templatesMod.slave.SlaveClient
  
  @JSImport("samchon", "templates.slave.SlaveServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends typingsSlinky.samchon.templatesMod.slave.SlaveServer
  
  @JSImport("samchon", "templates.slave.SlaveSystem")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends typingsSlinky.samchon.templatesMod.slave.SlaveSystem
}
