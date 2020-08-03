package typingsSlinky.rcPicker.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcPicker.headerMod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  @JSImport("rc-picker/es/panels/Header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def nextIconReactElement(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def nextIcon(value: ReactElement): this.type = set("nextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def onNext(value: () => Unit): this.type = set("onNext", js.Any.fromFunction0(value))
    @scala.inline
    def onPrev(value: () => Unit): this.type = set("onPrev", js.Any.fromFunction0(value))
    @scala.inline
    def onSuperNext(value: () => Unit): this.type = set("onSuperNext", js.Any.fromFunction0(value))
    @scala.inline
    def onSuperPrev(value: () => Unit): this.type = set("onSuperPrev", js.Any.fromFunction0(value))
    @scala.inline
    def prevIconReactElement(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def prevIcon(value: ReactElement): this.type = set("prevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superNextIconReactElement(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superNextIcon(value: ReactElement): this.type = set("superNextIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superPrevIconReactElement(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def superPrevIcon(value: ReactElement): this.type = set("superPrevIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HeaderProps]))
  }
}

