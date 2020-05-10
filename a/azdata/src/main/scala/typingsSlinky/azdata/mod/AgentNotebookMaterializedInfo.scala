package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentNotebookMaterializedInfo extends js.Object {
  var favorite: Boolean = js.native
  var materializedId: Double = js.native
  var materializedName: String = js.native
  var targetDatabase: String = js.native
}

object AgentNotebookMaterializedInfo {
  @scala.inline
  def apply(favorite: Boolean, materializedId: Double, materializedName: String, targetDatabase: String): AgentNotebookMaterializedInfo = {
    val __obj = js.Dynamic.literal(favorite = favorite.asInstanceOf[js.Any], materializedId = materializedId.asInstanceOf[js.Any], materializedName = materializedName.asInstanceOf[js.Any], targetDatabase = targetDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentNotebookMaterializedInfo]
  }
  @scala.inline
  implicit class AgentNotebookMaterializedInfoOps[Self <: AgentNotebookMaterializedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFavorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterializedId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materializedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaterializedName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materializedName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDatabase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

