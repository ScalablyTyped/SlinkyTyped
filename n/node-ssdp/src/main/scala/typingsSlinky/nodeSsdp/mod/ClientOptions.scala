package typingsSlinky.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends SsdpOptions {
  /** Bind sockets to each discovered interface explicitly instead of relying on the system. Might help with issues with multiple NICs. */
  var explicitSocketBind: js.UndefOr[Boolean] = js.native
  /** List of interfaces to explicitly bind. By default, bind to all available interfaces. */
  var interfaces: js.UndefOr[js.Array[String]] = js.native
  /**
  	 * When true socket.bind() will reuse the address, even if another process has already bound a socket on it.
  	 * @default true
  	 */
  var reuseAddr: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitSocketBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitSocketBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitSocketBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitSocketBind")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaces")(js.undefined)
        ret
    }
    @scala.inline
    def withReuseAddr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReuseAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseAddr")(js.undefined)
        ret
    }
  }
  
}

