package typingsSlinky.reactPdf.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.pdfjsDist.mod.PDFTreeNode
import typingsSlinky.reactPdf.anon.PageNumber
import typingsSlinky.reactPdf.outlineMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Outline {
  
  @JSImport("react-pdf", "Outline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPdf.mod.Outline] {
    
    @scala.inline
    def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNameVarargs(value: String*): this.type = set("className", js.Array(value :_*))
    
    @scala.inline
    def onItemClick(value: /* hasPageNumber */ PageNumber => Unit): this.type = set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadError(value: /* error */ js.Error => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadSuccess(value: /* outline */ js.Array[PDFTreeNode] => Unit): this.type = set("onLoadSuccess", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Outline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
