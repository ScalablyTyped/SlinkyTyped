package typingsSlinky.reactMdDialog

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHeadingElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdDialog.anon.PickBaseDialogPropshidden
import typingsSlinky.reactMdDialog.anon.PickBaseDialogPropshiddenAbout
import typingsSlinky.reactMdDialog.anon.PickBaseFixedDialogPropsh
import typingsSlinky.reactMdDialog.anon.PickBaseFixedDialogPropshAbout
import typingsSlinky.reactMdDialog.dialogContentMod.DialogContentProps
import typingsSlinky.reactMdDialog.dialogFooterMod.DialogFooterProps
import typingsSlinky.reactMdDialog.dialogHeaderMod.DialogHeaderProps
import typingsSlinky.reactMdDialog.dialogTitleMod.DialogTitleProps
import typingsSlinky.reactMdDialog.nestedDialogContextMod.NestedDialogContextProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/dialog", "Dialog")
  @js.native
  val Dialog: ForwardRefExoticComponent[PickBaseDialogPropshidden | PickBaseDialogPropshiddenAbout] = js.native
  
  @JSImport("@react-md/dialog", "DialogContent")
  @js.native
  val DialogContent: ForwardRefExoticComponent[DialogContentProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogHeader")
  @js.native
  val DialogHeader: ForwardRefExoticComponent[DialogHeaderProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogTitle")
  @js.native
  val DialogTitle: ForwardRefExoticComponent[DialogTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  
  @JSImport("@react-md/dialog", "FixedDialog")
  @js.native
  val FixedDialog: ForwardRefExoticComponent[PickBaseFixedDialogPropsh | PickBaseFixedDialogPropshAbout] = js.native
  
  @JSImport("@react-md/dialog", "NestedDialogContextProvider")
  @js.native
  def NestedDialogContextProvider(hasChildren: NestedDialogContextProviderProps): ReactElement = js.native
}
