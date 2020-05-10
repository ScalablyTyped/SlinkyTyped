package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.dockerode.AnonRefCount
import typingsSlinky.dockerode.dockerodeStrings.global
import typingsSlinky.dockerode.dockerodeStrings.local
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:enable:interface-name */
@js.native
trait VolumeInspectInfo extends js.Object {
  var Driver: String = js.native
  var Labels: StringDictionary[String] = js.native
  var Mountpoint: String = js.native
  var Name: String = js.native
  // Field is always present, but sometimes is null
  var Options: StringDictionary[String] | Null = js.native
  var Scope: local | global = js.native
  var Status: js.UndefOr[StringDictionary[String]] = js.native
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[AnonRefCount | Null] = js.native
}

object VolumeInspectInfo {
  @scala.inline
  def apply(
    Driver: String,
    Labels: StringDictionary[String],
    Mountpoint: String,
    Name: String,
    Scope: local | global
  ): VolumeInspectInfo = {
    val __obj = js.Dynamic.literal(Driver = Driver.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], Mountpoint = Mountpoint.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeInspectInfo]
  }
  @scala.inline
  implicit class VolumeInspectInfoOps[Self <: VolumeInspectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Driver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMountpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mountpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: local | global): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(null)
        ret
    }
    @scala.inline
    def withStatus(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageData(value: AnonRefCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageData")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageData")(null)
        ret
    }
  }
  
}

