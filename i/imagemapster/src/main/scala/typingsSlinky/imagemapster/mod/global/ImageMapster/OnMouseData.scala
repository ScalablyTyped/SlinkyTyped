package typingsSlinky.imagemapster.mod.global.ImageMapster

import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnMouseData extends js.Object {
  var e: JQueryEventObject = js.native
  /**
    * area key
    */
  var key: String = js.native
  var options: AreaRenderingOptions = js.native
  /**
    * true if area is currently selected
    */
  var selected: Boolean = js.native
}

object OnMouseData {
  @scala.inline
  def apply(e: JQueryEventObject, key: String, options: AreaRenderingOptions, selected: Boolean): OnMouseData = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseData]
  }
  @scala.inline
  implicit class OnMouseDataOps[Self <: OnMouseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: JQueryEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AreaRenderingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

