package typingsSlinky.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tensorflow version that a Node can be configured with.
  */
@js.native
trait SchemaTensorFlowVersion extends js.Object {
  /**
    * The resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the tensorflow version.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaTensorFlowVersion {
  @scala.inline
  def apply(): SchemaTensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTensorFlowVersion]
  }
  @scala.inline
  implicit class SchemaTensorFlowVersionOps[Self <: SchemaTensorFlowVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

