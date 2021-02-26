package typingsSlinky.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prometheus extends StObject {
  
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var JmxExporter: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.JmxExporter] = js.native
  
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var NodeExporter: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.NodeExporter] = js.native
}
object Prometheus {
  
  @scala.inline
  def apply(): Prometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prometheus]
  }
  
  @scala.inline
  implicit class PrometheusMutableBuilder[Self <: Prometheus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJmxExporter(value: JmxExporter): Self = StObject.set(x, "JmxExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJmxExporterUndefined: Self = StObject.set(x, "JmxExporter", js.undefined)
    
    @scala.inline
    def setNodeExporter(value: NodeExporter): Self = StObject.set(x, "NodeExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeExporterUndefined: Self = StObject.set(x, "NodeExporter", js.undefined)
  }
}
