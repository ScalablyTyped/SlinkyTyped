package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActions
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyleProps
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyles
import typingsSlinky.std.Number
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardActionsBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
    ] {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActions.base", "DocumentCardActionsBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    actions: js.Array[IButtonProps],
    componentRef: IRefObject[IDocumentCardActions] = null,
    styles: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles] = null,
    theme: ITheme = null,
    views: Number = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
  ] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDocumentCardActionsProps
}

