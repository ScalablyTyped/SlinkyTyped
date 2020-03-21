package typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.std.Number
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActionsProps extends ClassAttributes[DocumentCardActionsBase] {
  /**
    * The actions available for this document.
    */
  var actions: js.Array[IButtonProps]
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardActions]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The number of views this document has received.
    */
  var views: js.UndefOr[Number] = js.undefined
}

object IDocumentCardActionsProps {
  @scala.inline
  def apply(
    actions: js.Array[IButtonProps],
    className: String = null,
    componentRef: IRefObject[IDocumentCardActions] = null,
    key: Key = null,
    ref: LegacyRef[DocumentCardActionsBase] = null,
    styles: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles] = null,
    theme: ITheme = null,
    views: Number = null
  ): IDocumentCardActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActionsProps]
  }
}

