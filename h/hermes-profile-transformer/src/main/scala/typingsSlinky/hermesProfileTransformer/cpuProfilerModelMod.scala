package typingsSlinky.hermesProfileTransformer

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.hermesProfileTransformer.cpuprofileMod.CPUProfileChunk
import typingsSlinky.hermesProfileTransformer.cpuprofileMod.CPUProfileChunkNode
import typingsSlinky.hermesProfileTransformer.cpuprofileMod.CPUProfileChunker
import typingsSlinky.hermesProfileTransformer.eventInterfacesMod.DurationEvent
import typingsSlinky.hermesProfileTransformer.hermesProfileMod.HermesCPUProfile
import typingsSlinky.hermesProfileTransformer.hermesProfileMod.HermesSample
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hermes-profile-transformer/dist/profiler/cpuProfilerModel", JSImport.Namespace)
@js.native
object cpuProfilerModelMod extends js.Object {
  
  @js.native
  class CpuProfilerModel protected () extends js.Object {
    def this(profile: CPUProfileChunk) = this()
    
    var _activeNodeArraysById: Map[Double, js.Array[Double]] = js.native
    
    /**
      * Initialization function to enable O(1) access to the set of active nodes in the stack by node ID.
      * @return Map<number, number[]>
      */
    def _createActiveNodeArrays(): Map[Double, js.Array[Double]] = js.native
    
    /**
      * Initialization function to enable O(1) access to nodes by node ID.
      * @return {Map<number, CPUProfileChunkNode}
      */
    def _createNodeMap(): Map[Double, CPUProfileChunkNode] = js.native
    
    /**
      * Generates the necessary B/E-style trace events for a single transition from stack A to stack B
      * at the given timestamp.
      *
      * Example:
      *
      *    timestamp 1234
      *    previousNodeIds 1,2,3
      *    currentNodeIds 1,2,4
      *
      *    yields [end 3 at ts 1234, begin 4 at ts 1234]
      *
      * @param {number} timestamp
      * @param {Array<number>} previousNodeIds
      * @param {Array<number>} currentNodeIds
      * @returns {Array<DurationEvent>}
      */
    def _createStartEndEventsForTransition(timestamp: Double, previousNodeIds: js.Array[Double], currentNodeIds: js.Array[Double]): js.Array[DurationEvent] = js.native
    
    /**
      * Returns all the node IDs in a stack when a specific nodeId is at the top of the stack
      * (i.e. a stack's node ID and the node ID of all of its parents).
      */
    def _getActiveNodeIds(nodeId: Double): js.Array[Double] = js.native
    
    var _nodesById: Map[Double, CPUProfileChunkNode] = js.native
    
    var _profile: CPUProfileChunk = js.native
    
    /**
      * Creates B/E-style trace events from a CpuProfile object created by `collectProfileEvents()`
      * @return {DurationEvent}
      * @throws If the length of timeDeltas array or the samples array does not match with the length of samples in Hermes Profile
      */
    def createStartEndEvents(): js.Array[DurationEvent] = js.native
  }
  /* static members */
  @js.native
  object CpuProfilerModel extends js.Object {
    
    /**
      * Converts the Hermes Sample into a single CpuProfileChunk object for consumption
      * by `createStartEndEvents()`.
      *
      * @param {HermesCPUProfile} profile
      * @throws Profile must have at least one sample
      * @return {CPUProfileChunk}
      */
    def collectProfileEvents(profile: HermesCPUProfile): CPUProfileChunk = js.native
    
    /**
      * Constructs CPUProfileChunk Nodes and the resultant samples and time deltas to be inputted into the
      * CPUProfileChunk object which will be processed to give createStartEndEvents()
      *
      * @param {HermesSample} samples
      * @param {<string, HermesStackFrame>} stackFrames
      * @return {CPUProfileChunker}
      */
    def constructNodes(
      samples: js.Array[HermesSample],
      stackFrames: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in string ]: hermes-profile-transformer.hermes-profile-transformer/dist/types/HermesProfile.HermesStackFrame}
      */ typingsSlinky.hermesProfileTransformer.hermesProfileTransformerStrings.CpuProfilerModel with TopLevel[js.Any]
    ): CPUProfileChunker = js.native
    
    /**
      * Creates B/E-style trace events from a CpuProfile object created by `collectProfileEvents()`
      * @param {CPUProfileChunk} profile
      */
    def createStartEndEvents(profile: CPUProfileChunk): js.Array[DurationEvent] = js.native
  }
}
