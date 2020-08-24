package typingsSlinky.materialUiLab.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typingsSlinky.materialUiLab.materialUiLabStrings.default
import typingsSlinky.materialUiLab.materialUiLabStrings.grey
import typingsSlinky.materialUiLab.materialUiLabStrings.inherit
import typingsSlinky.materialUiLab.materialUiLabStrings.outlined
import typingsSlinky.materialUiLab.materialUiLabStrings.primary
import typingsSlinky.materialUiLab.materialUiLabStrings.secondary
import typingsSlinky.materialUiLab.timelineDotTimelineDotMod.TimelineDotProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineDot {
  @JSImport("@material-ui/lab", "TimelineDot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: PartialClassNameMapTimeliDefaultDefault): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: inherit | primary | secondary | grey): this.type = set("color", value.asInstanceOf[js.Any])
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
    @scala.inline
    def variant(value: default | outlined): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimelineDotProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimelineDot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

