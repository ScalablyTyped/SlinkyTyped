package typingsSlinky.reactFileUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.HandleClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Thumbnail {
  @JSImport("react-file-utils", "Thumbnail")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.Thumbnail] {
    @scala.inline
    def handleClose(value: /* id */ js.UndefOr[String] => Unit): this.type = set("handleClose", js.Any.fromFunction1(value))
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def imgSrc(value: js.Any): this.type = set("imgSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HandleClose): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Thumbnail.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

