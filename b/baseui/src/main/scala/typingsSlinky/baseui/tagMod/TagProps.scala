package typingsSlinky.baseui.tagMod

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagProps extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var closeable: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var isFocused: js.UndefOr[Boolean] = js.native
  
  var isHovered: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[
    orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
  ] = js.native
  
  var onActionClick: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactElement], _]] = js.native
  
  var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactElement], _]] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ Event, _]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* event */ Event, _]] = js.native
  
  var overrides: js.UndefOr[TagOverrides] = js.native
  
  var size: js.UndefOr[small_ | medium_ | large_] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var variant: js.UndefOr[solid | light | outlined] = js.native
}
object TagProps {
  
  @scala.inline
  def apply(): TagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagProps]
  }
  
  @scala.inline
  implicit class TagPropsOps[Self <: TagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseable(value: Boolean): Self = this.set("closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseable: Self = this.set("closeable", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    
    @scala.inline
    def setIsHovered(value: Boolean): Self = this.set("isHovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHovered: Self = this.set("isHovered", js.undefined)
    
    @scala.inline
    def setKind(
      value: orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
    ): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOnActionClick(value: (/* e */ Event, /* children */ js.UndefOr[ReactElement]) => _): Self = this.set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActionClick: Self = this.set("onActionClick", js.undefined)
    
    @scala.inline
    def setOnActionKeyDown(value: (/* e */ Event, /* children */ js.UndefOr[ReactElement]) => _): Self = this.set("onActionKeyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActionKeyDown: Self = this.set("onActionKeyDown", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ Event => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* event */ Event => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOverrides(value: TagOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setSize(value: small_ | medium_ | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVariant(value: solid | light | outlined): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
