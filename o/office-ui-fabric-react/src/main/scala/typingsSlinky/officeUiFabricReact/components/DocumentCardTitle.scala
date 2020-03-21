package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitle
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyleProps
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyles
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardTitle
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react", "DocumentCardTitle")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    title: String,
    componentRef: IRefObject[IDocumentCardTitle] = null,
    shouldTruncate: js.UndefOr[Boolean] = js.undefined,
    showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldTruncate)) __obj.updateDynamic("shouldTruncate")(shouldTruncate.asInstanceOf[js.Any])
    if (!js.isUndefined(showAsSecondaryTitle)) __obj.updateDynamic("showAsSecondaryTitle")(showAsSecondaryTitle.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardTitleProps
}

