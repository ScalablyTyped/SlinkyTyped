package typingsSlinky.materialUiLab.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeli
import typingsSlinky.materialUiLab.materialUiLabStrings.alternate
import typingsSlinky.materialUiLab.materialUiLabStrings.left
import typingsSlinky.materialUiLab.materialUiLabStrings.right
import typingsSlinky.materialUiLab.timelineTimelineMod.TimelineProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeline {
  
  @JSImport("@material-ui/lab", "Timeline")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def align(value: left | right | alternate): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: PartialClassNameMapTimeli): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def innerRef(value: Ref[_] | ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Timeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
