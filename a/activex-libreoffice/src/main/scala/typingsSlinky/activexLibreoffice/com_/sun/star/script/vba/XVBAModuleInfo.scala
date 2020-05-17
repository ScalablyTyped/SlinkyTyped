package typingsSlinky.activexLibreoffice.com_.sun.star.script.vba

import typingsSlinky.activexLibreoffice.com_.sun.star.script.ModuleInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVBAModuleInfo extends js.Object {
  def getModuleInfo(ModuleName: String): ModuleInfo = js.native
  def hasModuleInfo(ModuleName: String): Boolean = js.native
  def insertModuleInfo(ModuleName: String, ModuleInfo: ModuleInfo): Unit = js.native
  def removeModuleInfo(ModuleName: String): Unit = js.native
}

object XVBAModuleInfo {
  @scala.inline
  def apply(
    getModuleInfo: String => ModuleInfo,
    hasModuleInfo: String => Boolean,
    insertModuleInfo: (String, ModuleInfo) => Unit,
    removeModuleInfo: String => Unit
  ): XVBAModuleInfo = {
    val __obj = js.Dynamic.literal(getModuleInfo = js.Any.fromFunction1(getModuleInfo), hasModuleInfo = js.Any.fromFunction1(hasModuleInfo), insertModuleInfo = js.Any.fromFunction2(insertModuleInfo), removeModuleInfo = js.Any.fromFunction1(removeModuleInfo))
    __obj.asInstanceOf[XVBAModuleInfo]
  }
  @scala.inline
  implicit class XVBAModuleInfoOps[Self <: XVBAModuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetModuleInfo(value: String => ModuleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModuleInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasModuleInfo(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasModuleInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertModuleInfo(value: (String, ModuleInfo) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertModuleInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveModuleInfo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeModuleInfo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

