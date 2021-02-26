package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.antDesignProStrings.down
import typingsSlinky.antDesignPro.antDesignProStrings.up
import typingsSlinky.antDesignPro.numberInfoMod.NumberInfoProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NumberInfo {
  
  @JSImport("ant-design-pro", "NumberInfo")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.NumberInfo] {
    
    @scala.inline
    def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: up | down): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitle(value: ReactElement | String): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTitleReactElement(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTotal(value: Double): this.type = set("subTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suffix(value: String): this.type = set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement | String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def total(value: ReactElement | String): this.type = set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalReactElement(value: ReactElement): this.type = set("total", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NumberInfo.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NumberInfoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
