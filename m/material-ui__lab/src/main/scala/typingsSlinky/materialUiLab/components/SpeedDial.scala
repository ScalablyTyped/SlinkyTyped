package typingsSlinky.materialUiLab.components

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.withStylesMod.ClassNameMap
import typingsSlinky.materialUiLab.anon.PartialFabProps
import typingsSlinky.materialUiLab.materialUiLabStrings.down
import typingsSlinky.materialUiLab.materialUiLabStrings.left
import typingsSlinky.materialUiLab.materialUiLabStrings.right
import typingsSlinky.materialUiLab.materialUiLabStrings.up
import typingsSlinky.materialUiLab.speedDialSpeedDialMod.CloseReason
import typingsSlinky.materialUiLab.speedDialSpeedDialMod.OpenReason
import typingsSlinky.materialUiLab.speedDialSpeedDialMod.SpeedDialClassKey
import typingsSlinky.materialUiLab.speedDialSpeedDialMod.SpeedDialProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SpeedDial {
  @JSImport("@material-ui/lab", "SpeedDial")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def FabProps(value: PartialFabProps): this.type = set("FabProps", value.asInstanceOf[js.Any])
    @scala.inline
    def TransitionComponentFunctionComponent(
      value: ReactComponentClass[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
        ]
    ): this.type = set("TransitionComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def TransitionComponentComponentClass(
      value: ReactComponentClass[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
        ]
    ): this.type = set("TransitionComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def TransitionComponent(
      value: ReactComponentClass[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
        ]
    ): this.type = set("TransitionComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def TransitionProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
    ): this.type = set("TransitionProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: Partial[ClassNameMap[SpeedDialClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: up | down | left | right): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[_] | ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def onClose(value: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ CloseReason) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def onOpen(value: (/* event */ SyntheticEvent[Event, js.Object], /* reason */ OpenReason) => Unit): this.type = set("onOpen", js.Any.fromFunction2(value))
    @scala.inline
    def openIconReactElement(value: ReactElement): this.type = set("openIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def openIcon(value: ReactElement): this.type = set("openIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
    ): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpeedDialProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(ariaLabel: String, open: Boolean): Builder = {
    val __props = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpeedDialProps]))
  }
}

