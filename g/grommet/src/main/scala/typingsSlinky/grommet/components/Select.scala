package typingsSlinky.grommet.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.grommet.anon.Left
import typingsSlinky.grommet.anon.Multiple
import typingsSlinky.grommet.dropMod.DropProps
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.selectMod.SelectProps
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import typingsSlinky.grommet.utilsMod.PlaceHolderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Select {
  @JSImport("grommet", "Select")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.grommet.mod.Select] {
    @scala.inline
    def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnChange(value: Boolean): this.type = set("closeOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean | (js.Array[Double | String | js.Object])): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledKeyFunction1(value: /* repeated */ js.Any => _): this.type = set("disabledKey", js.Any.fromFunction1(value))
    @scala.inline
    def disabledKey(value: String | (js.Function1[/* repeated */ js.Any, _])): this.type = set("disabledKey", value.asInstanceOf[js.Any])
    @scala.inline
    def dropAlign(value: Left): this.type = set("dropAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def dropHeight(value: xsmall | small | medium | large | xlarge | String): this.type = set("dropHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def dropProps(value: DropProps): this.type = set("dropProps", value.asInstanceOf[js.Any])
    @scala.inline
    def dropTarget(value: js.Object): this.type = set("dropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def emptySearchMessage(value: String): this.type = set("emptySearchMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction1(value: /* repeated */ js.Any => _): this.type = set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def icon(value: Boolean | (js.Function1[/* repeated */ js.Any, _]) | TagMod[Any]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def labelKeyFunction1(value: /* repeated */ js.Any => _): this.type = set("labelKey", js.Any.fromFunction1(value))
    @scala.inline
    def labelKey(value: String | (js.Function1[/* repeated */ js.Any, _])): this.type = set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def messages(value: Multiple): this.type = set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* repeated */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onClose(value: /* repeated */ js.Any => _): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def onMore(value: /* repeated */ js.Any => _): this.type = set("onMore", js.Any.fromFunction1(value))
    @scala.inline
    def onOpen(value: /* repeated */ js.Any => _): this.type = set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def onSearch(value: /* search */ String => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: PlaceHolderType): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: Double | js.Array[Double]): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def valueReactElement(value: ReactElement): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String | ReactElement | js.Object | (js.Array[String | js.Object])): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def valueKeyFunction1(value: /* repeated */ js.Any => _): this.type = set("valueKey", js.Any.fromFunction1(value))
    @scala.inline
    def valueKey(value: String | (js.Function1[/* repeated */ js.Any, _])): this.type = set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def valueLabelReactElement(value: ReactElement): this.type = set("valueLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def valueLabel(value: TagMod[Any]): this.type = set("valueLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(options: js.Array[String | Boolean | Double | ReactElement | js.Object]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectProps]))
  }
}

