package typingsSlinky.knockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDependencies extends js.Object {
  var exportDependencies: Boolean = js.native
}

object ExportDependencies {
  @scala.inline
  def apply(exportDependencies: Boolean): ExportDependencies = {
    val __obj = js.Dynamic.literal(exportDependencies = exportDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDependencies]
  }
  @scala.inline
  implicit class ExportDependenciesOps[Self <: ExportDependencies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportDependencies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportDependencies")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

