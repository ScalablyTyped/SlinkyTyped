package typingsSlinky.antDesignPro.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.descriptionMod.DescriptionProps
import typingsSlinky.antDesignPro.descriptionMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Description {
  @JSImport("ant-design-pro/lib/DescriptionList/Description", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def termReactElement(value: ReactElement): this.type = set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def term(value: TagMod[Any]): this.type = set("term", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DescriptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Description.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

