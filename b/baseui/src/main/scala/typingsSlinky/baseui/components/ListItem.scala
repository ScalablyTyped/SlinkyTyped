package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.li.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.listMod.ArtworkSizesT
import typingsSlinky.baseui.listMod.OverridesT
import typingsSlinky.baseui.listMod.PropsT
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("baseui/list", "ListItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any] with js.Object] {
    @scala.inline
    def artworkReactElement(value: ReactElement): this.type = set("artwork", value.asInstanceOf[js.Any])
    @scala.inline
    def artwork(value: TagMod[Any]): this.type = set("artwork", value.asInstanceOf[js.Any])
    @scala.inline
    def artworkSize(value: ArtworkSizesT | Double): this.type = set("artworkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def endEnhancerReactElement(value: ReactElement): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def endEnhancer(value: TagMod[Any]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: OverridesT): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def sublist(value: Boolean): this.type = set("sublist", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsT with RefAttributes[HTMLLIElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

