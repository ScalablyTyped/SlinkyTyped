package typingsSlinky.reactFileIcon.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileIcon.mod.FileIconProps
import typingsSlinky.reactFileIcon.mod.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FileIcon {
  @JSImport("react-file-icon", "FileIcon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def extension(value: String): this.type = set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def fold(value: Boolean): this.type = set("fold", value.asInstanceOf[js.Any])
    @scala.inline
    def foldColor(value: String): this.type = set("foldColor", value.asInstanceOf[js.Any])
    @scala.inline
    def glyphColor(value: String): this.type = set("glyphColor", value.asInstanceOf[js.Any])
    @scala.inline
    def gradientColor(value: String): this.type = set("gradientColor", value.asInstanceOf[js.Any])
    @scala.inline
    def gradientOpacity(value: Double): this.type = set("gradientOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def labelColor(value: String): this.type = set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def labelTextColor(value: String): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def labelTextStyle(value: js.Object): this.type = set("labelTextStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def labelUppercase(value: Boolean): this.type = set("labelUppercase", value.asInstanceOf[js.Any])
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: IconType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FileIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FileIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

