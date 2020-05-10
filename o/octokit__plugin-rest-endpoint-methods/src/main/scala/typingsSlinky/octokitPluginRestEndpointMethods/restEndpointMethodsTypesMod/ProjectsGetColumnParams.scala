package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsGetColumnParams extends js.Object {
  var column_id: Double = js.native
}

object ProjectsGetColumnParams {
  @scala.inline
  def apply(column_id: Double): ProjectsGetColumnParams = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetColumnParams]
  }
  @scala.inline
  implicit class ProjectsGetColumnParamsOps[Self <: ProjectsGetColumnParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

