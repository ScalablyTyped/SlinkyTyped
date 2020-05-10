package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkConfiguration extends js.Object {
  /**
    * The emulation rule applying to the download traffic.
    */
  var downRule: js.UndefOr[SchemaTrafficRule] = js.native
  /**
    * The unique opaque id for this network traffic configuration.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The emulation rule applying to the upload traffic.
    */
  var upRule: js.UndefOr[SchemaTrafficRule] = js.native
}

object SchemaNetworkConfiguration {
  @scala.inline
  def apply(): SchemaNetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfiguration]
  }
  @scala.inline
  implicit class SchemaNetworkConfigurationOps[Self <: SchemaNetworkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownRule(value: SchemaTrafficRule): Self = {
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
    def withUpRule(value: SchemaTrafficRule): Self = {
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

