package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsSlinky.officeUiFabricReact.stickyTypesMod.StickyPositionType
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky {
  @JSImport("office-ui-fabric-react", "Sticky")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.Sticky] {
    @scala.inline
    def componentRefFunction1(value: /* ref */ IStickyProps | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IStickyProps]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IStickyProps]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def isScrollSynced(value: Boolean): this.type = set("isScrollSynced", value.asInstanceOf[js.Any])
    @scala.inline
    def stickyBackgroundColor(value: String): this.type = set("stickyBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def stickyPosition(value: StickyPositionType): this.type = set("stickyPosition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IStickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Sticky.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

