package typingsSlinky.iobroker.anon

import typingsSlinky.node.NodeJS.Dict
import typingsSlinky.node.osMod.CpuInfo
import typingsSlinky.node.osMod.NetworkInterfaceInfo
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cpus extends StObject {
  
  var cpus: ReturnType[js.Function0[js.Array[CpuInfo]]] = js.native
  
  var networkInterfaces: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]] = js.native
  
  var totalmem: ReturnType[js.Function0[Double]] = js.native
}
object Cpus {
  
  @scala.inline
  def apply(
    cpus: ReturnType[js.Function0[js.Array[CpuInfo]]],
    networkInterfaces: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]],
    totalmem: ReturnType[js.Function0[Double]]
  ): Cpus = {
    val __obj = js.Dynamic.literal(cpus = cpus.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], totalmem = totalmem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpus]
  }
  
  @scala.inline
  implicit class CpusMutableBuilder[Self <: Cpus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpus(value: ReturnType[js.Function0[js.Array[CpuInfo]]]): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaces(value: ReturnType[js.Function0[Dict[js.Array[NetworkInterfaceInfo]]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalmem(value: ReturnType[js.Function0[Double]]): Self = StObject.set(x, "totalmem", value.asInstanceOf[js.Any])
  }
}
