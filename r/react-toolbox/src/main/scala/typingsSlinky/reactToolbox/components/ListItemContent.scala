package typingsSlinky.reactToolbox.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToolbox.listListItemContentMod.ListItemContentProps
import typingsSlinky.reactToolbox.listListItemContentMod.ListItemContentTheme
import typingsSlinky.reactToolbox.reactToolboxStrings.auto
import typingsSlinky.reactToolbox.reactToolboxStrings.large
import typingsSlinky.reactToolbox.reactToolboxStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemContent {
  @JSImport("react-toolbox/lib/list", "ListItemContent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactToolbox.libListMod.ListItemContent] {
    @scala.inline
    def captionReactElement(value: ReactElement): this.type = set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def caption(value: TagMod[Any]): this.type = set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def legend(value: String): this.type = set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ListItemContentTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: auto | normal | large): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItemContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

