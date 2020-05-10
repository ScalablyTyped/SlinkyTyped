package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.beakTypesMod.IBeak
import typingsSlinky.officeUiFabricReact.beakTypesMod.IBeakProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Beak {
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Beak/Beak", "Beak")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.beakMod.Beak] {
    @scala.inline
    def bottom(value: String): this.type = set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IBeak | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IBeak]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IBeak]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: RectangleEdge): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def left(value: String): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def right(value: String): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def top(value: String): this.type = set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBeakProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Beak.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

