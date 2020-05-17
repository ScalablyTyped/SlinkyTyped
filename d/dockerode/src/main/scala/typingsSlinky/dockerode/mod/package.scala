package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  type EndpointsConfig = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dockerode.mod.EndpointSettings]
  type MountConfig = js.Array[typingsSlinky.dockerode.mod.MountSettings]
  type NetworkStats = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dockerode.anon.Rxbytes]
  type PluginInspectInfo = typingsSlinky.dockerode.mod.PluginInfo
  type PortMap = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.dockerode.mod.PortBinding]]
}
