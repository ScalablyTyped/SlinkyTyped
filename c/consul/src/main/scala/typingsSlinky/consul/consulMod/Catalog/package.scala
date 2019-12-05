package typingsSlinky.consul.consulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Catalog {
  import typingsSlinky.consul.consulMod.Catalog.Node.ListOptions
  import typingsSlinky.consul.consulMod.CommonOptions

  type DatacentersOptions = CommonOptions
  type Node = Node_
  type NodesOptions = ListOptions
  type Service = Service_
  type ServicesOptions = typingsSlinky.consul.consulMod.Catalog.Service.ListOptions
}
