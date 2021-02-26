package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalTableSource extends StObject {
  
  /**
    * Specifies the result of a join of two logical tables.
    */
  var JoinInstruction: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.JoinInstruction] = js.native
  
  /**
    * Physical table ID.
    */
  var PhysicalTableId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.PhysicalTableId] = js.native
}
object LogicalTableSource {
  
  @scala.inline
  def apply(): LogicalTableSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalTableSource]
  }
  
  @scala.inline
  implicit class LogicalTableSourceMutableBuilder[Self <: LogicalTableSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJoinInstruction(value: JoinInstruction): Self = StObject.set(x, "JoinInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinInstructionUndefined: Self = StObject.set(x, "JoinInstruction", js.undefined)
    
    @scala.inline
    def setPhysicalTableId(value: PhysicalTableId): Self = StObject.set(x, "PhysicalTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalTableIdUndefined: Self = StObject.set(x, "PhysicalTableId", js.undefined)
  }
}
