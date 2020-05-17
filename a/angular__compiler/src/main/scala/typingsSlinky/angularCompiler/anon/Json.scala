package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Json extends js.Object {
  var exportAs: js.Array[ExportAs] = js.native
  var json: String = js.native
}

object Json {
  @scala.inline
  def apply(exportAs: js.Array[ExportAs], json: String): Json = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
  @scala.inline
  implicit class JsonOps[Self <: Json] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportAs(value: js.Array[ExportAs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

