package typingsSlinky.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  
  var Marker: js.UndefOr[typingsSlinky.awsSdk.importexportMod.Marker] = js.native
  
  var MaxJobs: js.UndefOr[typingsSlinky.awsSdk.importexportMod.MaxJobs] = js.native
}
object ListJobsInput {
  
  @scala.inline
  def apply(): ListJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsInput]
  }
  
  @scala.inline
  implicit class ListJobsInputMutableBuilder[Self <: ListJobsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxJobs(value: MaxJobs): Self = StObject.set(x, "MaxJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxJobsUndefined: Self = StObject.set(x, "MaxJobs", js.undefined)
  }
}
