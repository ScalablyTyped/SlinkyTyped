package typingsSlinky.appBuilderLib.coreMod

import typingsSlinky.builderUtil.archMod.ArchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetConfiguration extends js.Object {
  /**
    * The arch or list of archs.
    */
  val arch: js.UndefOr[js.Array[ArchType] | ArchType] = js.native
  /**
    * The target name. e.g. `snap`.
    */
  val target: String = js.native
}

object TargetConfiguration {
  @scala.inline
  def apply(target: String): TargetConfiguration = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetConfiguration]
  }
  @scala.inline
  implicit class TargetConfigurationOps[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArch(value: js.Array[ArchType] | ArchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(js.undefined)
        ret
    }
  }
  
}

