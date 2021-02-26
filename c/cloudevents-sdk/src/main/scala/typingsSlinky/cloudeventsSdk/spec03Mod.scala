package typingsSlinky.cloudeventsSdk

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.cloudeventsSdk.anon.Id
import typingsSlinky.cloudeventsSdk.cloudeventMod.CE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spec03Mod {
  
  /** @typedef {import("../../../cloudevent")} CloudEvent */
  /**
    * Decorates a CloudEvent with the 0.3 specification getters and setters
    * @ignore
    */
  @JSImport("cloudevents-sdk/lib/bindings/http/v03/spec_0_3", JSImport.Namespace)
  @js.native
  class ^ () extends Spec03
  
  @js.native
  trait CloudEvent extends StObject {
    
    var CloudEvent: Instantiable1[/* event */ CE, typingsSlinky.cloudeventsSdk.cloudeventMod.CloudEvent] = js.native
  }
  object CloudEvent {
    
    @scala.inline
    def apply(CloudEvent: Instantiable1[/* event */ CE, typingsSlinky.cloudeventsSdk.cloudeventMod.CloudEvent]): CloudEvent = {
      val __obj = js.Dynamic.literal(CloudEvent = CloudEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEvent]
    }
    
    @scala.inline
    implicit class CloudEventMutableBuilder[Self <: CloudEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudEvent(value: Instantiable1[/* event */ CE, typingsSlinky.cloudeventsSdk.cloudeventMod.CloudEvent]): Self = StObject.set(x, "CloudEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /** @typedef {import("../../../cloudevent")} CloudEvent */
  /**
    * Decorates a CloudEvent with the 0.3 specification getters and setters
    * @ignore
    */
  @js.native
  trait Spec03 extends StObject {
    
    def addExtension(key: js.Any, value: js.Any): Spec03 = js.native
    
    def check(): Unit = js.native
    
    def data: js.Any = js.native
    
    def dataContentEncoding: js.Any = js.native
    def dataContentEncoding_=(arg: js.Any): Unit = js.native
    
    def dataContentType: js.Any = js.native
    def dataContentType_=(arg: js.Any): Unit = js.native
    
    def data_=(arg: js.Any): Unit = js.native
    
    def id: js.Any = js.native
    def id_=(arg: js.Any): Unit = js.native
    
    var payload: Id = js.native
    
    def schemaURL: js.Any = js.native
    def schemaURL_=(arg: js.Any): Unit = js.native
    
    def source: js.Any = js.native
    def source_=(arg: js.Any): Unit = js.native
    
    def specversion: String = js.native
    
    def subject: js.Any = js.native
    def subject_=(arg: js.Any): Unit = js.native
    
    def time: String = js.native
    def time_=(arg: String): Unit = js.native
    
    def `type`: js.Any = js.native
    def type_=(arg: js.Any): Unit = js.native
  }
}
