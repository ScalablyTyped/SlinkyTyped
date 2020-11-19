package typingsSlinky.blueprintjsCore.dialogMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.overlayMod.IBackdropProps
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayableProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogProps
  extends IOverlayableProps
     with IBackdropProps
     with IProps {
  
  /**
    * Name of a Blueprint UI icon (or an icon element) to render in the
    * dialog's header. Note that the header will only be rendered if `title` is
    * provided.
    */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /**
    * Whether to show the close button in the dialog's header.
    * Note that the header will only be rendered if `title` is provided.
    * @default true
    */
  var isCloseButtonShown: js.UndefOr[Boolean] = js.native
  
  /**
    * Toggles the visibility of the overlay and its children.
    * This prop is required because the component is controlled.
    */
  var isOpen: Boolean = js.native
  
  /**
    * CSS styles to apply to the dialog.
    * @default {}
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Title of the dialog. If provided, an element with `Classes.DIALOG_HEADER`
    * will be rendered inside the dialog before any children elements.
    */
  var title: js.UndefOr[ReactElement] = js.native
  
  /**
    * Name of the transition for internal `CSSTransition`. Providing your own
    * name here will require defining new CSS transition properties.
    */
  var transitionName: js.UndefOr[String] = js.native
}
object IDialogProps {
  
  @scala.inline
  def apply(isOpen: Boolean): IDialogProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogProps]
  }
  
  @scala.inline
  implicit class IDialogPropsOps[Self <: IDialogProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setIsCloseButtonShown(value: Boolean): Self = this.set("isCloseButtonShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCloseButtonShown: Self = this.set("isCloseButtonShown", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
  }
}
