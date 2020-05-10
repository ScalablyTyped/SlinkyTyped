package typingsSlinky.portfinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortFinderOptions extends js.Object {
  /**
    * Host to find available port on.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Minimum port (takes precedence over `basePort`).
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * search start port (equals to port when not provided)
    * This exists because getPort and getPortPromise mutates port state in
    * recursive calls and doesn't have a way to retrieve begininng port while
    * searching.
    */
  var startPort: js.UndefOr[Double] = js.native
  /**
    * Maximum port
    */
  var stopPort: js.UndefOr[Double] = js.native
}

object PortFinderOptions {
  @scala.inline
  def apply(): PortFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortFinderOptions]
  }
  @scala.inline
  implicit class PortFinderOptionsOps[Self <: PortFinderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPort")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPort")(js.undefined)
        ret
    }
  }
  
}

