package typingsSlinky.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDragAndDropOptions extends js.Object {
  /**
    * Designate additional drop zones for file input
    *
    * @default `[]`
    */
  var extraDropzones: js.UndefOr[js.Array[_]] = js.native
  /**
    * Include the path of dropped files (starting with the top-level dropped directory). This value will be sent along with the request as a qqpath parameter
    *
    * @default `false`
    */
  var reportDirectoryPaths: js.UndefOr[Boolean] = js.native
}

object UIDragAndDropOptions {
  @scala.inline
  def apply(): UIDragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIDragAndDropOptions]
  }
  @scala.inline
  implicit class UIDragAndDropOptionsOps[Self <: UIDragAndDropOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraDropzones(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDropzones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraDropzones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDropzones")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDirectoryPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDirectoryPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDirectoryPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDirectoryPaths")(js.undefined)
        ret
    }
  }
  
}

