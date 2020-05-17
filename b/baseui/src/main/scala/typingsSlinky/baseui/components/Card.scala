package typingsSlinky.baseui.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Thumbnail
import typingsSlinky.baseui.cardMod.CardOverrides
import typingsSlinky.baseui.cardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  @JSImport("baseui/card", "Card")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def actionReactElement(value: ReactElement): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def action(value: TagMod[Any]): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def hasThumbnail(value: /* props */ Thumbnail => Boolean): this.type = set("hasThumbnail", js.Any.fromFunction1(value))
    @scala.inline
    def headerImage(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImagePropsT */ js.Any)
    ): this.type = set("headerImage", value.asInstanceOf[js.Any])
    @scala.inline
    def overrides(value: CardOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def thumbnail(value: String): this.type = set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

