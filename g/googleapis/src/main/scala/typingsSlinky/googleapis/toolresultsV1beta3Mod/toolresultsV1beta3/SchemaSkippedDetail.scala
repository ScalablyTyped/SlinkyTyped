package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSkippedDetail extends js.Object {
  /**
    * If the App doesn&#39;t support the specific API level.
    */
  var incompatibleAppVersion: js.UndefOr[Boolean] = js.native
  /**
    * If the App doesn&#39;t run on the specific architecture, for example,
    * x86.
    */
  var incompatibleArchitecture: js.UndefOr[Boolean] = js.native
  /**
    * If the requested OS version doesn&#39;t run on the specific device model.
    */
  var incompatibleDevice: js.UndefOr[Boolean] = js.native
}

object SchemaSkippedDetail {
  @scala.inline
  def apply(): SchemaSkippedDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSkippedDetail]
  }
  @scala.inline
  implicit class SchemaSkippedDetailOps[Self <: SchemaSkippedDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncompatibleAppVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompatibleAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleAppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIncompatibleArchitecture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleArchitecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompatibleArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleArchitecture")(js.undefined)
        ret
    }
    @scala.inline
    def withIncompatibleDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncompatibleDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incompatibleDevice")(js.undefined)
        ret
    }
  }
  
}

