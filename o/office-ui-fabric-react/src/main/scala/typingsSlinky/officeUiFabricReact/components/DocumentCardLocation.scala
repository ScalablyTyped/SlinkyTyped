package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocation
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationProps
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyleProps
import typingsSlinky.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyles
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardLocation
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react", "DocumentCardLocation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    location: String,
    ariaLabel: String = null,
    componentRef: IRefObject[IDocumentCardLocation] = null,
    locationHref: String = null,
    onClick: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]] => Unit = null,
    styles: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (locationHref != null) __obj.updateDynamic("locationHref")(locationHref.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardLocationProps
}

