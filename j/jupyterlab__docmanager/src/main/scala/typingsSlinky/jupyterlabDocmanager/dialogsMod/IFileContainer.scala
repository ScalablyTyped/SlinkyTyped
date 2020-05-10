package typingsSlinky.jupyterlabDocmanager.dialogsMod

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileContainer extends JSONObject {
  /**
    * The list of item names in the current working directory.
    */
  var items: js.Array[String] = js.native
  /**
    * The current working directory of the file container.
    */
  var path: String = js.native
}

object IFileContainer {
  @scala.inline
  def apply(items: js.Array[String], path: String): IFileContainer = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileContainer]
  }
  @scala.inline
  implicit class IFileContainerOps[Self <: IFileContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

