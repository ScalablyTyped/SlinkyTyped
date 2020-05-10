package typingsSlinky.sassGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImportedBy extends js.Object {
  var importedBy: js.Array[String] = js.native
  var imports: js.Array[String] = js.native
  var modified: String = js.native
}

object AnonImportedBy {
  @scala.inline
  def apply(importedBy: js.Array[String], imports: js.Array[String], modified: String): AnonImportedBy = {
    val __obj = js.Dynamic.literal(importedBy = importedBy.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImportedBy]
  }
  @scala.inline
  implicit class AnonImportedByOps[Self <: AnonImportedBy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportedBy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

