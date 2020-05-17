package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxDesignerToolboxItem extends js.Object {
  var defaultVal: js.Any = js.native
  var info: js.Array[ASPxDesignerElementSerializationInfo] = js.native
  var isToolboxItem: Boolean = js.native
  var popularProperties: js.Array[String] = js.native
  var surfaceType: js.Any = js.native
  var toolboxIndex: Double = js.native
  var `type`: js.Any = js.native
}

object ASPxDesignerToolboxItem {
  @scala.inline
  def apply(
    defaultVal: js.Any,
    info: js.Array[ASPxDesignerElementSerializationInfo],
    isToolboxItem: Boolean,
    popularProperties: js.Array[String],
    surfaceType: js.Any,
    toolboxIndex: Double,
    `type`: js.Any
  ): ASPxDesignerToolboxItem = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], isToolboxItem = isToolboxItem.asInstanceOf[js.Any], popularProperties = popularProperties.asInstanceOf[js.Any], surfaceType = surfaceType.asInstanceOf[js.Any], toolboxIndex = toolboxIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxDesignerToolboxItem]
  }
  @scala.inline
  implicit class ASPxDesignerToolboxItemOps[Self <: ASPxDesignerToolboxItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultVal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: js.Array[ASPxDesignerElementSerializationInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsToolboxItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolboxItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopularProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurfaceType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surfaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolboxIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolboxIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

