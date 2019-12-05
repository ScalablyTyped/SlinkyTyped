package typingsSlinky.reactDashPdf.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.pdfjsDashDist.pdfjsDashDistMod.PDFTreeNode
import typingsSlinky.reactDashPdf.Anon_PageNumber
import typingsSlinky.reactDashPdf.distOutlineMod.default
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
    onItemClick: /* hasPageNumber */ Anon_PageNumber => Unit = null,
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
  type Props = typingsSlinky.reactDashPdf.distOutlineMod.Props
}

