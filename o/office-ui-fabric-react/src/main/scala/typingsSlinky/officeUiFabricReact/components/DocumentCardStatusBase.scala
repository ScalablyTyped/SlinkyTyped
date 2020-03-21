package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatus
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusProps
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyleProps
import typingsSlinky.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyles
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardStatusBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardStatus.base", "DocumentCardStatusBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    status: String,
    componentRef: IRefObject[IDocumentCardStatus] = null,
    statusIcon: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardStatusStyleProps, IDocumentCardStatusStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardStatusBaseMod.DocumentCardStatusBase
  ] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (statusIcon != null) __obj.updateDynamic("statusIcon")(statusIcon.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardStatusProps
}

