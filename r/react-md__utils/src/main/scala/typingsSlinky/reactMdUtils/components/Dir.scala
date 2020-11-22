package typingsSlinky.reactMdUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdUtils.dirMod.DirProps
import typingsSlinky.reactMdUtils.dirMod.WritingDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dir {
  
  @JSImport("@react-md/utils", "Dir")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def defaultDirFunction0(value: () => WritingDirection): this.type = set("defaultDir", js.Any.fromFunction0(value))
    
    @scala.inline
    def defaultDir(value: WritingDirection | js.Function0[WritingDirection]): this.type = set("defaultDir", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DirProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Dir.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
