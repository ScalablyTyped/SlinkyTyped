package typingsSlinky.atlaskitSingleSelect.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitSingleSelect.anon.Event
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.default
import typingsSlinky.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typingsSlinky.atlaskitSingleSelect.mod.GroupType
import typingsSlinky.atlaskitSingleSelect.mod.ItemType
import typingsSlinky.atlaskitSingleSelect.mod.StatelessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatelessSelect {
  @JSImport("@atlaskit/single-select", "StatelessSelect")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.atlaskitSingleSelect.mod.StatelessSelect] {
    @scala.inline
    def appearance(value: default | subtle): this.type = set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelected(value: ItemType): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def droplistShouldFitContainer(value: Boolean): this.type = set("droplistShouldFitContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def filterValue(value: String): this.type = set("filterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def hasAutocomplete(value: Boolean): this.type = set("hasAutocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def invalidMessageReactElement(value: ReactElement): this.type = set("invalidMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def invalidMessage(value: TagMod[Any]): this.type = set("invalidMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def isDefaultOpen(value: Boolean): this.type = set("isDefaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def isFirstChild(value: Boolean): this.type = set("isFirstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def isInvalid(value: Boolean): this.type = set("isInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def isRequired(value: Boolean): this.type = set("isRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def items(value: js.Array[GroupType]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def loadingMessage(value: String): this.type = set("loadingMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def noMatchesFound(value: String): this.type = set("noMatchesFound", value.asInstanceOf[js.Any])
    @scala.inline
    def onFilterChange(value: /* filter */ String => Unit): this.type = set("onFilterChange", js.Any.fromFunction1(value))
    @scala.inline
    def onOpenChange(value: /* change */ Event => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSelected(value: /* item */ ItemType => Unit): this.type = set("onSelected", js.Any.fromFunction1(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedItem(value: ItemType): this.type = set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFitContainer(value: Boolean): this.type = set("shouldFitContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFlip(value: Boolean): this.type = set("shouldFlip", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldFocus(value: Boolean): this.type = set("shouldFocus", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatelessProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatelessSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

