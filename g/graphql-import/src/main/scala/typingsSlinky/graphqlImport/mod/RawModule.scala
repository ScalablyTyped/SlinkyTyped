package typingsSlinky.graphqlImport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawModule extends js.Object {
  var from: String = js.native
  var imports: js.Array[String] = js.native
}

object RawModule {
  @scala.inline
  def apply(from: String, imports: js.Array[String]): RawModule = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawModule]
  }
  @scala.inline
  implicit class RawModuleOps[Self <: RawModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

