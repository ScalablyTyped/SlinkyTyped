package typingsSlinky.less.Less_

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.less.AnonPluginManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreProcessorExtraInfo extends js.Object {
  var context: AnonPluginManager = js.native
  var fileInfo: RootFileInfo = js.native
  var imports: StringDictionary[js.Any] = js.native
}

object PreProcessorExtraInfo {
  @scala.inline
  def apply(context: AnonPluginManager, fileInfo: RootFileInfo, imports: StringDictionary[js.Any]): PreProcessorExtraInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fileInfo = fileInfo.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessorExtraInfo]
  }
  @scala.inline
  implicit class PreProcessorExtraInfoOps[Self <: PreProcessorExtraInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: AnonPluginManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileInfo(value: RootFileInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

