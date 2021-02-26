package typingsSlinky.formol.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formol.mod.FieldSetProps
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldSet {
  
  @JSImport("formol", "FieldSet")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def choices(value: js.Array[_]): this.type = set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def choicesVarargs(value: js.Any*): this.type = set("choices", js.Array(value :_*))
    
    @scala.inline
    def dangerousRawHTMLLabels(value: Boolean): this.type = set("dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elementRef(value: Ref[_]): this.type = set("elementRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def elementRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("elementRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def elementRefNull: this.type = set("elementRef", null)
    
    @scala.inline
    def elementRefRefObject(value: ReactRef[_]): this.type = set("elementRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isChecked(value: Boolean): this.type = set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: () => Unit): this.type = set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FieldSet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FieldSetProps[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
