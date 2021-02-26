package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.accent
import typingsSlinky.baseui.baseuiStrings.black
import typingsSlinky.baseui.baseuiStrings.blue
import typingsSlinky.baseui.baseuiStrings.brown
import typingsSlinky.baseui.baseuiStrings.custom_
import typingsSlinky.baseui.baseuiStrings.green
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.light
import typingsSlinky.baseui.baseuiStrings.medium_
import typingsSlinky.baseui.baseuiStrings.negative
import typingsSlinky.baseui.baseuiStrings.neutral
import typingsSlinky.baseui.baseuiStrings.orange
import typingsSlinky.baseui.baseuiStrings.outlined
import typingsSlinky.baseui.baseuiStrings.positive
import typingsSlinky.baseui.baseuiStrings.primary
import typingsSlinky.baseui.baseuiStrings.purple
import typingsSlinky.baseui.baseuiStrings.red
import typingsSlinky.baseui.baseuiStrings.small_
import typingsSlinky.baseui.baseuiStrings.solid
import typingsSlinky.baseui.baseuiStrings.warning
import typingsSlinky.baseui.baseuiStrings.white
import typingsSlinky.baseui.baseuiStrings.yellow
import typingsSlinky.baseui.tagMod.TagOverrides
import typingsSlinky.baseui.tagMod.TagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  @JSImport("baseui/tag", "Tag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.tagMod.Tag] {
    
    @scala.inline
    def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isHovered(value: Boolean): this.type = set("isHovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def kind(
      value: orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
    ): this.type = set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActionClick(value: (/* e */ Event, /* children */ js.UndefOr[ReactElement]) => _): this.type = set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onActionKeyDown(value: (/* e */ Event, /* children */ js.UndefOr[ReactElement]) => _): this.type = set("onActionKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: /* event */ Event => _): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* event */ Event => _): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: TagOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: small_ | medium_ | large_): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variant(value: solid | light | outlined): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tag.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
