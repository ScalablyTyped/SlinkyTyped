package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AgentSubSystem extends StObject
@JSImport("azdata", "AgentSubSystem")
@js.native
object AgentSubSystem extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AgentSubSystem with Double] = js.native
  
  @js.native
  sealed trait ActiveScripting extends AgentSubSystem
  /* 2 */ val ActiveScripting: typingsSlinky.azdata.mod.AgentSubSystem.ActiveScripting with Double = js.native
  
  @js.native
  sealed trait AnalysisCommands extends AgentSubSystem
  /* 10 */ val AnalysisCommands: typingsSlinky.azdata.mod.AgentSubSystem.AnalysisCommands with Double = js.native
  
  @js.native
  sealed trait AnalysisQuery extends AgentSubSystem
  /* 9 */ val AnalysisQuery: typingsSlinky.azdata.mod.AgentSubSystem.AnalysisQuery with Double = js.native
  
  @js.native
  sealed trait CmdExec extends AgentSubSystem
  /* 3 */ val CmdExec: typingsSlinky.azdata.mod.AgentSubSystem.CmdExec with Double = js.native
  
  @js.native
  sealed trait Distribution extends AgentSubSystem
  /* 6 */ val Distribution: typingsSlinky.azdata.mod.AgentSubSystem.Distribution with Double = js.native
  
  @js.native
  sealed trait LogReader extends AgentSubSystem
  /* 5 */ val LogReader: typingsSlinky.azdata.mod.AgentSubSystem.LogReader with Double = js.native
  
  @js.native
  sealed trait Merge extends AgentSubSystem
  /* 7 */ val Merge: typingsSlinky.azdata.mod.AgentSubSystem.Merge with Double = js.native
  
  @js.native
  sealed trait PowerShell extends AgentSubSystem
  /* 12 */ val PowerShell: typingsSlinky.azdata.mod.AgentSubSystem.PowerShell with Double = js.native
  
  @js.native
  sealed trait QueueReader extends AgentSubSystem
  /* 8 */ val QueueReader: typingsSlinky.azdata.mod.AgentSubSystem.QueueReader with Double = js.native
  
  @js.native
  sealed trait Snapshot extends AgentSubSystem
  /* 4 */ val Snapshot: typingsSlinky.azdata.mod.AgentSubSystem.Snapshot with Double = js.native
  
  @js.native
  sealed trait Ssis extends AgentSubSystem
  /* 11 */ val Ssis: typingsSlinky.azdata.mod.AgentSubSystem.Ssis with Double = js.native
  
  @js.native
  sealed trait TransactSql extends AgentSubSystem
  /* 1 */ val TransactSql: typingsSlinky.azdata.mod.AgentSubSystem.TransactSql with Double = js.native
}
