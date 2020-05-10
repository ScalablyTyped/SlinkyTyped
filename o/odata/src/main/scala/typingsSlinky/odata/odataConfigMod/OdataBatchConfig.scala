package typingsSlinky.odata.odataConfigMod

import org.scalajs.dom.experimental.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OdataBatchConfig extends js.Object {
  var boundaryPrefix: js.UndefOr[String] = js.native
  var changsetBoundaryPrefix: js.UndefOr[String] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var useChangset: Boolean = js.native
}

object OdataBatchConfig {
  @scala.inline
  def apply(useChangset: Boolean): OdataBatchConfig = {
    val __obj = js.Dynamic.literal(useChangset = useChangset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OdataBatchConfig]
  }
  @scala.inline
  implicit class OdataBatchConfigOps[Self <: OdataBatchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseChangset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useChangset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundaryPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withChangsetBoundaryPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changsetBoundaryPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangsetBoundaryPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changsetBoundaryPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

