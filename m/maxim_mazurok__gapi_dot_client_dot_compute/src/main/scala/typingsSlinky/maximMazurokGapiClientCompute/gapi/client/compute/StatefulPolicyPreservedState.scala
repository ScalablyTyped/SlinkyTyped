package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulPolicyPreservedState extends StObject {
  
  /** Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks. */
  var disks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice}
    */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.StatefulPolicyPreservedState with TopLevel[js.Any]
  ] = js.native
}
object StatefulPolicyPreservedState {
  
  @scala.inline
  def apply(): StatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicyPreservedState]
  }
  
  @scala.inline
  implicit class StatefulPolicyPreservedStateMutableBuilder[Self <: StatefulPolicyPreservedState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice}
      */ typingsSlinky.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.StatefulPolicyPreservedState with TopLevel[js.Any]
    ): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
  }
}
