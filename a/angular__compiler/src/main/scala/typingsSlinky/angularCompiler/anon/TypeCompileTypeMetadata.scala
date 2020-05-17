package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeCompileTypeMetadata extends js.Object {
  var `type`: CompileTypeMetadata = js.native
}

object TypeCompileTypeMetadata {
  @scala.inline
  def apply(`type`: CompileTypeMetadata): TypeCompileTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCompileTypeMetadata]
  }
  @scala.inline
  implicit class TypeCompileTypeMetadataOps[Self <: TypeCompileTypeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: CompileTypeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

