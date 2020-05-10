package typingsSlinky.jupyterlabExtensionmanager.companionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInstallInfo extends js.Object {
  /**
    * The base/default install info.
    */
  var base: IInstallInfoEntry = js.native
  /**
    * Which package managers that have the package/module.
    */
  var managers: js.Array[String] = js.native
  /**
    * Overrides of the base install info on a per-manager basis.
    */
  var overrides: js.UndefOr[StringDictionary[js.UndefOr[IInstallInfoEntry]]] = js.native
}

object IInstallInfo {
  @scala.inline
  def apply(base: IInstallInfoEntry, managers: js.Array[String]): IInstallInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstallInfo]
  }
  @scala.inline
  implicit class IInstallInfoOps[Self <: IInstallInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: IInstallInfoEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManagers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverrides(value: StringDictionary[js.UndefOr[IInstallInfoEntry]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
  }
  
}

