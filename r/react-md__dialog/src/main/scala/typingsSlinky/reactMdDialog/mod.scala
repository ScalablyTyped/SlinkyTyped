package typingsSlinky.reactMdDialog

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHeadingElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDialog.anon.DialogPropsPickDialogProp
import typingsSlinky.reactMdDialog.anon.DialogPropsPickDialogPropAbout
import typingsSlinky.reactMdDialog.anon.FixedDialogPropsPickFixed
import typingsSlinky.reactMdDialog.anon.FixedDialogPropsPickFixedAbout
import typingsSlinky.reactMdDialog.dialogContentMod.DialogContentProps
import typingsSlinky.reactMdDialog.dialogFooterMod.DialogFooterProps
import typingsSlinky.reactMdDialog.dialogHeaderMod.DialogHeaderProps
import typingsSlinky.reactMdDialog.dialogTitleMod.DialogTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val Dialog: ForwardRefExoticComponent[DialogPropsPickDialogProp | DialogPropsPickDialogPropAbout] = js.native
  /**
    * This component is used to render the main content within a dialog. There are
    * really only benefits when using the component alongside the `DialogHeader`
    * and/or `DialogFooter` since it is set up so only the content will scroll
    * while the header and footer will be "fixed".
    */
  val DialogContent: ForwardRefExoticComponent[DialogContentProps with RefAttributes[HTMLDivElement]] = js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component doesn't do anything to complex. It really just applies custom
    * styles so that when the `DialogContent` component is used, the header will be
    * "fixed" to the top of the dialog while the content scrolls. It also applies
    * some minimal padding.
    */
  val DialogHeader: ForwardRefExoticComponent[DialogHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * This component adds some base styles to an `<h2>` element for a title within
    * a `Dialog`.
    */
  val DialogTitle: ForwardRefExoticComponent[DialogTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  /**
    * The `FixedDialog` is a wrapper for the `Dialog` component that can be used to
    * be fix itself to another element. Another term for this component might be a
    * "Pop out Dialog".
    */
  val FixedDialog: ForwardRefExoticComponent[FixedDialogPropsPickFixed | FixedDialogPropsPickFixedAbout] = js.native
  val NestedDialogContextProvider: ReactComponentClass[js.Object] = js.native
}

