package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSpec extends StObject {
  
  /** Template holds the latest specification for the Revision to be stamped out. */
  var template: js.UndefOr[RevisionTemplate] = js.native
  
  /** Traffic specifies how to distribute traffic over a collection of Knative Revisions and Configurations. */
  var traffic: js.UndefOr[js.Array[TrafficTarget]] = js.native
}
object ServiceSpec {
  
  @scala.inline
  def apply(): ServiceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSpec]
  }
  
  @scala.inline
  implicit class ServiceSpecMutableBuilder[Self <: ServiceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplate(value: RevisionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTraffic(value: js.Array[TrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    @scala.inline
    def setTrafficVarargs(value: TrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value :_*))
  }
}
