package typingsSlinky.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTemplate extends StObject {
  
  /** The configuration for this template. */
  var config: js.UndefOr[JobConfig] = js.native
  
  /** The resource name of the job template. Format: `projects/{project}/locations/{location}/jobTemplates/{job_template}` */
  var name: js.UndefOr[String] = js.native
}
object JobTemplate {
  
  @scala.inline
  def apply(): JobTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplate]
  }
  
  @scala.inline
  implicit class JobTemplateMutableBuilder[Self <: JobTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: JobConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
