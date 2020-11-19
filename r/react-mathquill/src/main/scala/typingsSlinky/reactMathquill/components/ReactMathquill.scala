package typingsSlinky.reactMathquill.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.edtrIoMathquill.mod.Config
import typingsSlinky.edtrIoMathquill.mod.MQ
import typingsSlinky.reactMathquill.mod.Props
import typingsSlinky.reactMathquill.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMathquill {
  
  @JSImport("react-mathquill", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def config(value: Config): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def latex(value: String): this.type = set("latex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mathquillDidMount(value: /* mathField */ MQ => Unit): this.type = set("mathquillDidMount", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* mathField */ MQ => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactMathquill.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
