package typingsSlinky.reactFloater.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactFloater.AnonZIndex
import typingsSlinky.reactFloater.CSSPropertieslengthnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  var arrow: CSSPropertieslengthnumber = js.native
  var close: CSSProperties = js.native
  var container: CSSProperties = js.native
  var content: CSSProperties = js.native
  var floater: CSSProperties = js.native
  var floaterCentered: CSSProperties = js.native
  var floaterClosing: CSSProperties = js.native
  var floaterOpening: CSSProperties = js.native
  var floaterWithAnimation: CSSProperties = js.native
  var floaterWithComponent: CSSProperties = js.native
  var footer: CSSProperties = js.native
  var options: AnonZIndex = js.native
  var title: CSSProperties = js.native
  var wrapper: CSSProperties = js.native
  var wrapperPosition: CSSProperties = js.native
}

object Styles {
  @scala.inline
  def apply(
    arrow: CSSPropertieslengthnumber,
    close: CSSProperties,
    container: CSSProperties,
    content: CSSProperties,
    floater: CSSProperties,
    floaterCentered: CSSProperties,
    floaterClosing: CSSProperties,
    floaterOpening: CSSProperties,
    floaterWithAnimation: CSSProperties,
    floaterWithComponent: CSSProperties,
    footer: CSSProperties,
    options: AnonZIndex,
    title: CSSProperties,
    wrapper: CSSProperties,
    wrapperPosition: CSSProperties
  ): Styles = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], floater = floater.asInstanceOf[js.Any], floaterCentered = floaterCentered.asInstanceOf[js.Any], floaterClosing = floaterClosing.asInstanceOf[js.Any], floaterOpening = floaterOpening.asInstanceOf[js.Any], floaterWithAnimation = floaterWithAnimation.asInstanceOf[js.Any], floaterWithComponent = floaterWithComponent.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any], wrapperPosition = wrapperPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: CSSPropertieslengthnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloater(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloaterCentered(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloaterClosing(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloaterOpening(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterOpening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloaterWithAnimation(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterWithAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloaterWithComponent(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterWithComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AnonZIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperPosition(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

