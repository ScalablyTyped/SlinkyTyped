package typingsSlinky.consul.mod.Catalog

import typingsSlinky.consul.mod.Callback
import typingsSlinky.consul.mod.Catalog.Service.ListOptions
import typingsSlinky.consul.mod.Consul
import typingsSlinky.consul.mod.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service_ extends js.Object {
  
  var consul: Consul = js.native
  
  /**
    * Lists services in a given DC
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](dc: String): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](dc: String, callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists services in a given DC
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: typingsSlinky.consul.mod.Catalog.Service.NodesOptions): Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](opts: typingsSlinky.consul.mod.Catalog.Service.NodesOptions, callback: Callback[TData]): Unit = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: String): Thenable[TData] = js.native
  /**
    * Lists the nodes in a given service
    */
  def nodes[TData](service: String, callback: Callback[TData]): Unit = js.native
}
