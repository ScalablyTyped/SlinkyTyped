package typingsSlinky.oracleOraclejet.ojthematicmapMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojThematicMapAreaSettableProperties extends JetSettableProperties {
  
  var categories: js.Array[String] = js.native
  
  var color: String = js.native
  
  var label: String = js.native
  
  var labelStyle: js.Object = js.native
  
  var location: String = js.native
  
  var opacity: Double = js.native
  
  var selectable: auto | off = js.native
  
  var shortDesc: String = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
}
object ojThematicMapAreaSettableProperties {
  
  @scala.inline
  def apply(
    categories: js.Array[String],
    color: String,
    label: String,
    labelStyle: js.Object,
    location: String,
    opacity: Double,
    selectable: auto | off,
    shortDesc: String,
    svgClassName: String,
    svgStyle: js.Object
  ): ojThematicMapAreaSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapAreaSettableProperties]
  }
  
  @scala.inline
  implicit class ojThematicMapAreaSettablePropertiesOps[Self <: ojThematicMapAreaSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectable(value: auto | off): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
  }
}
