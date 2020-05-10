package typingsSlinky.reactInlinesvg.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactInlinesvg.helpersMod.InlineSVGError
import typingsSlinky.reactInlinesvg.mod.IFetchError
import typingsSlinky.reactInlinesvg.mod.IProps
import typingsSlinky.reactInlinesvg.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInlinesvg {
  @JSImport("react-inlinesvg", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def baseURL(value: String): this.type = set("baseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def cacheRequests(value: Boolean): this.type = set("cacheRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[HTMLElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: Ref[HTMLElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def loaderReactElement(value: ReactElement): this.type = set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def loader(value: TagMod[Any]): this.type = set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* error */ InlineSVGError | IFetchError => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: (/* src */ String, /* isCached */ Boolean) => Unit): this.type = set("onLoad", js.Any.fromFunction2(value))
    @scala.inline
    def preProcessor(value: /* code */ String => String): this.type = set("preProcessor", js.Any.fromFunction1(value))
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def uniqueHash(value: String): this.type = set("uniqueHash", value.asInstanceOf[js.Any])
    @scala.inline
    def uniquifyIDs(value: Boolean): this.type = set("uniquifyIDs", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IProps]))
  }
}

