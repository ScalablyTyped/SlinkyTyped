package typingsSlinky.materialUiCore.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.anon.PartialClassNameMapListItRoot
import typingsSlinky.materialUiCore.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps
import typingsSlinky.materialUiCore.listItemSecondaryActionMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemSecondaryAction {
  @JSImport("@material-ui/core/ListItemSecondaryAction", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: PartialClassNameMapListItRoot): this.type = set("classes", value.asInstanceOf[js.Any])
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
  
  def withProps(p: ListItemSecondaryActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemSecondaryAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

