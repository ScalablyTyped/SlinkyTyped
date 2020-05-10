package typingsSlinky.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.rpc.html
  *
  *
  */
@js.native
trait rpc extends js.Object {
  /**
    *
    */
  def JsonService(): Unit = js.native
  /**
    *
    */
  def JsonpService(): Unit = js.native
  /**
    *
    */
  def RpcService(): Unit = js.native
}

object rpc {
  @scala.inline
  def apply(JsonService: () => Unit, JsonpService: () => Unit, RpcService: () => Unit): rpc = {
    val __obj = js.Dynamic.literal(JsonService = js.Any.fromFunction0(JsonService), JsonpService = js.Any.fromFunction0(JsonpService), RpcService = js.Any.fromFunction0(RpcService))
    __obj.asInstanceOf[rpc]
  }
  @scala.inline
  implicit class rpcOps[Self <: rpc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonService(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonService")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJsonpService(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JsonpService")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRpcService(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RpcService")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

