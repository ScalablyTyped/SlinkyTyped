package typingsSlinky.consul.mod

import typingsSlinky.consul.mod.Status.LeaderOptions
import typingsSlinky.consul.mod.Status.PeersOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends js.Object {
  
  var consul: Consul = js.native
  
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](callback: Callback[TData]): Unit = js.native
  def leader[TData](opts: LeaderOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft leader.
    */
  def leader[TData](opts: LeaderOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](callback: Callback[TData]): Unit = js.native
  def peers[TData](opts: PeersOptions): Thenable[TData] = js.native
  /**
    * Returns the current Raft peer set
    */
  def peers[TData](opts: PeersOptions, callback: Callback[TData]): Unit = js.native
}
@JSImport("consul", "Status")
@js.native
object Status extends js.Object {
  
  type LeaderOptions = CommonOptions
  
  type PeersOptions = CommonOptions
}
