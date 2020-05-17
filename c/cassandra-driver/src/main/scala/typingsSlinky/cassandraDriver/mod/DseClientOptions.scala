package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.Enabled
import typingsSlinky.cassandraDriver.typesMod.types.Uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DseClientOptions extends ClientOptions {
  var applicationName: js.UndefOr[String] = js.native
  var applicationVersion: js.UndefOr[String] = js.native
  var graphOptions: js.UndefOr[GraphOptions] = js.native
  var id: js.UndefOr[Uuid] = js.native
  var monitorReporting: js.UndefOr[Enabled] = js.native
}

object DseClientOptions {
  @scala.inline
  def apply(): DseClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DseClientOptions]
  }
  @scala.inline
  implicit class DseClientOptionsOps[Self <: DseClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphOptions(value: GraphOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Uuid): Self = {
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
    def withMonitorReporting(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorReporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitorReporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitorReporting")(js.undefined)
        ret
    }
  }
  
}

