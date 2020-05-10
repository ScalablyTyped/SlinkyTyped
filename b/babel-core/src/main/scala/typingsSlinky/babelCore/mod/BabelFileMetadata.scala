package typingsSlinky.babelCore.mod

import typingsSlinky.babelCore.AnonLoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelFileMetadata extends js.Object {
  var marked: js.Array[AnonLoc] = js.native
  var modules: BabelFileModulesMetadata = js.native
  var usedHelpers: js.Array[String] = js.native
}

object BabelFileMetadata {
  @scala.inline
  def apply(marked: js.Array[AnonLoc], modules: BabelFileModulesMetadata, usedHelpers: js.Array[String]): BabelFileMetadata = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], usedHelpers = usedHelpers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileMetadata]
  }
  @scala.inline
  implicit class BabelFileMetadataOps[Self <: BabelFileMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarked(value: js.Array[AnonLoc]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: BabelFileModulesMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedHelpers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedHelpers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

