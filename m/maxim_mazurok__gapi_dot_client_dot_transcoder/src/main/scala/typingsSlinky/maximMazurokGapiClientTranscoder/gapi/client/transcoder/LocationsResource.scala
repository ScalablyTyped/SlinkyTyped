package typingsSlinky.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var jobTemplates: JobTemplatesResource = js.native
  
  var jobs: JobsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(jobTemplates: JobTemplatesResource, jobs: JobsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(jobTemplates = jobTemplates.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTemplates(value: JobTemplatesResource): Self = StObject.set(x, "jobTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs(value: JobsResource): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
  }
}
