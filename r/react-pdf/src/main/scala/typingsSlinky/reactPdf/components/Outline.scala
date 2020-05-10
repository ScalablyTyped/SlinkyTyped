package typingsSlinky.reactPdf.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.pdfjsDist.mod.PDFTreeNode
import typingsSlinky.reactPdf.AnonPageNumber
import typingsSlinky.reactPdf.outlineMod.Props
import typingsSlinky.reactPdf.outlineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Outline {
  @JSImport("react-pdf/dist/Outline", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def onItemClick(value: /* hasPageNumber */ AnonPageNumber => Unit): this.type = set("onItemClick", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadError(value: /* error */ js.Error => Unit): this.type = set("onLoadError", js.Any.fromFunction1(value))
    @scala.inline
    def onLoadSuccess(value: /* outline */ js.Array[PDFTreeNode] => Unit): this.type = set("onLoadSuccess", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Outline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

