package typingsSlinky.reactFileUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileUtils.anon.Big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileIcon {
  
  @JSImport("react-file-utils", "FileIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFileUtils.mod.FileIcon] {
    
    @scala.inline
    def big(value: Boolean): this.type = set("big", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filename(value: String): this.type = set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mimeType(value: String): this.type = set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FileIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Big): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
