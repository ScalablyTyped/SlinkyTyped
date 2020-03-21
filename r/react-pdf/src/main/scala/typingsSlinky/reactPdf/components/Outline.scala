package typingsSlinky.reactPdf.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.pdfjsDist.mod.PDFTreeNode
import typingsSlinky.reactPdf.AnonPageNumber
import typingsSlinky.reactPdf.outlineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Outline
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-pdf/dist/Outline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    className: String | js.Array[String] = null,
    onItemClick: /* hasPageNumber */ AnonPageNumber => Unit = null,
    onLoadError: /* error */ js.Error => Unit = null,
    onLoadSuccess: /* outline */ js.Array[PDFTreeNode] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1(onItemClick))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1(onLoadSuccess))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactPdf.outlineMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactPdf.outlineMod.Props
}

