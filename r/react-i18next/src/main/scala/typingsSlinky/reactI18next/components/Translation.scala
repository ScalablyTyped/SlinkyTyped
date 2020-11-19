package typingsSlinky.reactI18next.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.i18next.mod.TFunction
import typingsSlinky.reactI18next.anon.Lng
import typingsSlinky.reactI18next.mod.Namespace
import typingsSlinky.reactI18next.mod.TranslationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Translation {
  
  @JSImport("react-i18next", "Translation")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def i18n(value: typingsSlinky.i18next.mod.i18n): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nsVarargs(value: String*): this.type = set("ns", js.Array(value :_*))
    
    @scala.inline
    def ns(value: Namespace): this.type = set("ns", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TranslationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: (TFunction, Lng, Boolean) => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[TranslationProps]))
  }
}
