package typingsSlinky.samchon

import typingsSlinky.samchon.distributedProcessMod.DistributedProcess
import typingsSlinky.samchon.distributedSystemMod.DistributedSystem
import typingsSlinky.samchon.parallelSystemArrayMod.ParallelSystemArray
import typingsSlinky.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedSystemArrayMod {
  
  @JSImport("samchon/templates/distributed/DistributedSystemArray", "DistributedSystemArray")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedSystemArray[System /* <: DistributedSystem */] () extends ParallelSystemArray[System] {
    
    /**
      * Factory method creating a child {@link DistributedProcess process} object.
      *
      * @param xml {@link XML} represents the {@link DistributedProcess child} object.
      * @return A new {@link DistributedProcess} object.
      */
    /* protected */ def createProcess(xml: XML): DistributedProcess = js.native
    
    /**
      * Erase a process.
      *
      * @param name Name, identifier of target {@link DistributedProcess process}.
      */
    def eraseProcess(name: String): Boolean = js.native
    
    /**
      * @hidden
      */
    var estimate_process_resource: js.Any = js.native
    
    /**
      * @hidden
      */
    var estimate_system_performance: js.Any = js.native
    
    /**
      * Get a process.
      *
      * @param name Name, identifier of target {@link DistributedProcess process}.
      *
      * @return The specified process.
      */
    def getProcess(name: String): DistributedProcess = js.native
    
    /**
      * Get process map.
      *
      * Gets an {@link HashMap} containing {@link DistributedProcess} objects with their *key*.
      *
      * @return An {@link HasmMap> containing pairs of string and {@link DistributedProcess} object.
      */
    def getProcessMap(): js.Any = js.native
    
    /**
      * Test whether the process exists.
      *
      * @param name Name, identifier of target {@link DistributedProcess process}.
      *
      * @return Whether the process has or not.
      */
    def hasProcess(name: String): Boolean = js.native
    
    /**
      * Insert a process.
      *
      * @param process A process to be inserted.
      * @return Success flag.
      */
    def insertProcess(process: DistributedProcess): Boolean = js.native
    
    /**
      * @hidden
      */
    var process_map_ : js.Any = js.native
  }
}
