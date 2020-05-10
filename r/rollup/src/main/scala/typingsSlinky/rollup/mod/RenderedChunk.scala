package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderedChunk extends PreRenderedChunk {
  var fileName: String = js.native
}

object RenderedChunk {
  @scala.inline
  def apply(
    dynamicImports: js.Array[String],
    exports: js.Array[String],
    fileName: String,
    imports: js.Array[String],
    isDynamicEntry: Boolean,
    isEntry: Boolean,
    modules: StringDictionary[RenderedModule],
    name: String
  ): RenderedChunk = {
    val __obj = js.Dynamic.literal(dynamicImports = dynamicImports.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], isDynamicEntry = isDynamicEntry.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedChunk]
  }
  @scala.inline
  implicit class RenderedChunkOps[Self <: RenderedChunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

