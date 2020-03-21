package typingsSlinky.onionoo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Onionoo {
  type Bandwidth = typingsSlinky.onionoo.mod.Onionoo.Response[
    typingsSlinky.onionoo.mod.Onionoo.NodeBandwidth, 
    typingsSlinky.onionoo.mod.Onionoo.NodeBandwidth
  ]
  type Clients = typingsSlinky.onionoo.mod.Onionoo.Response[js.UndefOr[scala.Nothing], typingsSlinky.onionoo.mod.Onionoo.BridgeClients]
  type Details = typingsSlinky.onionoo.mod.Onionoo.Response[typingsSlinky.onionoo.mod.Onionoo.Relay, typingsSlinky.onionoo.mod.Onionoo.Bridge]
  type Summary = typingsSlinky.onionoo.mod.Onionoo.Response[
    typingsSlinky.onionoo.mod.Onionoo.RelaySummary, 
    typingsSlinky.onionoo.mod.Onionoo.BridgeSummary
  ]
  type Uptime = typingsSlinky.onionoo.mod.Onionoo.Response[
    typingsSlinky.onionoo.mod.Onionoo.RelayUptime, 
    typingsSlinky.onionoo.mod.Onionoo.BridgeUptime
  ]
  type Weights = typingsSlinky.onionoo.mod.Onionoo.Response[typingsSlinky.onionoo.mod.Onionoo.RelayWeights, js.UndefOr[scala.Nothing]]
}
