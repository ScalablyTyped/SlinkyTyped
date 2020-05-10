package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindTaskProperties extends TaskProperties {
  /**
    * Specify the geodatabase version to search. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
}

object FindTaskProperties {
  @scala.inline
  def apply(): FindTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindTaskProperties]
  }
  @scala.inline
  implicit class FindTaskPropertiesOps[Self <: FindTaskProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGdbVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGdbVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gdbVersion")(js.undefined)
        ret
    }
  }
  
}

