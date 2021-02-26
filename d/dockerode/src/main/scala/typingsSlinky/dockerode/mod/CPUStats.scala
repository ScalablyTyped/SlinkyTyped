package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.Percpuusage
import typingsSlinky.dockerode.anon.Periods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPUStats extends StObject {
  
  var cpu_usage: Percpuusage = js.native
  
  var online_cpus: Double = js.native
  
  var system_cpu_usage: Double = js.native
  
  var throttling_data: Periods = js.native
}
object CPUStats {
  
  @scala.inline
  def apply(cpu_usage: Percpuusage, online_cpus: Double, system_cpu_usage: Double, throttling_data: Periods): CPUStats = {
    val __obj = js.Dynamic.literal(cpu_usage = cpu_usage.asInstanceOf[js.Any], online_cpus = online_cpus.asInstanceOf[js.Any], system_cpu_usage = system_cpu_usage.asInstanceOf[js.Any], throttling_data = throttling_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUStats]
  }
  
  @scala.inline
  implicit class CPUStatsMutableBuilder[Self <: CPUStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu_usage(value: Percpuusage): Self = StObject.set(x, "cpu_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline_cpus(value: Double): Self = StObject.set(x, "online_cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem_cpu_usage(value: Double): Self = StObject.set(x, "system_cpu_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottling_data(value: Periods): Self = StObject.set(x, "throttling_data", value.asInstanceOf[js.Any])
  }
}
