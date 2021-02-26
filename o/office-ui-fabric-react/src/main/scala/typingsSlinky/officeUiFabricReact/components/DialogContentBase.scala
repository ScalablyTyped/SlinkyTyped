package typingsSlinky.officeUiFabricReact.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContent
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyleProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyles
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogContentBase {
  
  @JSImport("office-ui-fabric-react", "DialogContentBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.DialogContentBase] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRef(value: IRefObject[IDialogContent]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDialogContent | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDialogContent]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggableHeaderClassName(value: String): this.type = set("draggableHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isMultiline(value: Boolean): this.type = set("isMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _): this.type = set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def responsiveMode(value: ResponsiveMode): this.type = set("responsiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylesFunction1(value: IDialogContentStyleProps => DeepPartial[IDialogContentStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def subText(value: String): this.type = set("subText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subTextId(value: String): this.type = set("subTextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleId(value: String): this.type = set("titleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def topButtonsProps(value: js.Array[IButtonProps]): this.type = set("topButtonsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def topButtonsPropsVarargs(value: IButtonProps*): this.type = set("topButtonsProps", js.Array(value :_*))
    
    @scala.inline
    def `type`(value: DialogType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DialogContentBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
