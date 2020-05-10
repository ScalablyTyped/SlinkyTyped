package typingsSlinky.reactList.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactList.mod.ReactListProps
import typingsSlinky.reactList.mod.^
import typingsSlinky.reactList.reactListStrings.x
import typingsSlinky.reactList.reactListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactList {
  @JSImport("react-list", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def axis(value: x | y): this.type = set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def itemRenderer(value: (/* index */ Double, /* key */ Double | String) => ReactElement): this.type = set("itemRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def itemSizeEstimator(value: (/* index */ Double, /* cache */ js.Object) => Double): this.type = set("itemSizeEstimator", js.Any.fromFunction2(value))
    @scala.inline
    def itemSizeGetter(value: /* index */ Double => Double): this.type = set("itemSizeGetter", js.Any.fromFunction1(value))
    @scala.inline
    def itemsRenderer(value: (/* items */ js.Array[ReactElement], /* ref */ String) => ReactElement): this.type = set("itemsRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollParentGetter(value: () => ReactElement): this.type = set("scrollParentGetter", js.Any.fromFunction0(value))
    @scala.inline
    def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def useStaticSize(value: Boolean): this.type = set("useStaticSize", value.asInstanceOf[js.Any])
    @scala.inline
    def useTranslate3d(value: Boolean): this.type = set("useTranslate3d", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

