package typingsSlinky.reactNepalMap.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNepalMap.mod.ProvinceMapPropsTypes
import typingsSlinky.reactNepalMap.mod.itemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProvinceMap {
  @JSImport("react-nepal-map", "ProvinceMap")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverColor(value: String): this.type = set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def onMapClick(value: /* item */ itemProps => Unit): this.type = set("onMapClick", js.Any.fromFunction1(value))
    @scala.inline
    def provinceColorVarargs(value: String*): this.type = set("provinceColor", js.Array(value :_*))
    @scala.inline
    def provinceColor(value: js.Array[String]): this.type = set("provinceColor", value.asInstanceOf[js.Any])
    @scala.inline
    def randomSectorColor(value: Boolean): this.type = set("randomSectorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def sectorClassName(value: String): this.type = set("sectorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProvinceMapPropsTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ProvinceMap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

