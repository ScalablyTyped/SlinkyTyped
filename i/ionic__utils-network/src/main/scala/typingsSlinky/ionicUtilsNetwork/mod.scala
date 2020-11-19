package typingsSlinky.ionicUtilsNetwork

import typingsSlinky.ionicUtilsNetwork.anon.Device
import typingsSlinky.ionicUtilsNetwork.anon.Timeout
import typingsSlinky.node.osMod.NetworkInterfaceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-network", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_ADDRESSES: js.Array[String] = js.native
  
  def findClosestOpenPort(port: Double): js.Promise[Double] = js.native
  
  def getExternalIPv4Interfaces(): js.Array[NetworkInterface] = js.native
  
  def isHostConnectable(host: String, port: Double): js.Promise[Boolean] = js.native
  def isHostConnectable(host: String, port: Double, hasTimeout: Timeout): js.Promise[Boolean] = js.native
  
  def isPortAvailable(port: Double): js.Promise[Boolean] = js.native
  
  def isPortAvailableForHost(host: String, port: Double): js.Promise[Boolean] = js.native
  
  type NetworkInterface = Device with NetworkInterfaceInfo
}
