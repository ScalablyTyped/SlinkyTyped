package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfiguration extends js.Object {
  /** The emulation rule applying to the download traffic */
  var downRule: js.UndefOr[TrafficRule] = js.native
  /**
    * The unique opaque id for this network traffic configuration
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /** The emulation rule applying to the upload traffic */
  var upRule: js.UndefOr[TrafficRule] = js.native
}

object NetworkConfiguration {
  @scala.inline
  def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  @scala.inline
  implicit class NetworkConfigurationOps[Self <: NetworkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownRule(value: TrafficRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downRule")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withUpRule(value: TrafficRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upRule")(js.undefined)
        ret
    }
  }
  
}

