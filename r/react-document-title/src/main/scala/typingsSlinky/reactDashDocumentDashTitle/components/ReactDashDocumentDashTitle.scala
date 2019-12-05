package typingsSlinky.reactDashDocumentDashTitle.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDocumentDashTitle.reactDashDocumentDashTitleMod.DocumentTitleProps
import typingsSlinky.reactDashDocumentDashTitle.reactDashDocumentDashTitleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashDocumentDashTitle
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(title: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DocumentTitleProps
}

