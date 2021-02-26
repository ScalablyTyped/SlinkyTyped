package typingsSlinky.reactMdUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdUtils.dirMod.DirProps
import typingsSlinky.reactMdUtils.dirMod.WritingDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dir {
  
  @JSImport("@react-md/utils", "Dir")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def defaultDir(value: WritingDirection | js.Function0[WritingDirection]): this.type = set("defaultDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultDirFunction0(value: () => WritingDirection): this.type = set("defaultDir", js.Any.fromFunction0(value))
  }
  
  implicit def make(companion: Dir.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DirProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
