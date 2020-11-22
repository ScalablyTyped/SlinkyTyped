package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  
  type Duration = scala.Double
  
  type EndpointsConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dockerode.mod.EndpointSettings]
  
  type ExternalCAProtocol = typingsSlinky.dockerode.dockerodeStrings.cfssl | java.lang.String
  
  type MountConfig = js.Array[typingsSlinky.dockerode.mod.MountSettings]
  
  type NetworkStats = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dockerode.anon.Rxbytes]
  
  type PluginInspectInfo = typingsSlinky.dockerode.mod.PluginInfo
  
  type PortMap = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.dockerode.mod.PortBinding]]
}
