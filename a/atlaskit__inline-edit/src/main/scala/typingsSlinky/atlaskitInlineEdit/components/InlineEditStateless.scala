package typingsSlinky.atlaskitInlineEdit.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitInlineEdit.mod.StatelessProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineEditStateless {
  
  @JSImport("@atlaskit/inline-edit", "InlineEditStateless")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.atlaskitInlineEdit.mod.InlineEditStateless] {
    
    @scala.inline
    def areActionButtonsHidden(value: Boolean): this.type = set("areActionButtonsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableEditViewFieldBase(value: Boolean): this.type = set("disableEditViewFieldBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editView(value: ReactElement): this.type = set("editView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invalidMessage(value: ReactElement): this.type = set("invalidMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isConfirmOnBlurDisabled(value: Boolean): this.type = set("isConfirmOnBlurDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFitContainerWidthReadView(value: Boolean): this.type = set("isFitContainerWidthReadView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isInvalid(value: Boolean): this.type = set("isInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isLabelHidden(value: Boolean): this.type = set("isLabelHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isWaiting(value: Boolean): this.type = set("isWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelHtmlFor(value: String): this.type = set("labelHtmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldConfirmOnEnter(value: Boolean): this.type = set("shouldConfirmOnEnter", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatelessProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    isEditing: Boolean,
    onCancel: () => Unit,
    onConfirm: () => Unit,
    onEditRequested: () => Unit,
    readView: ReactElement
  ): Builder = {
    val __props = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), onEditRequested = js.Any.fromFunction0(onEditRequested), readView = readView.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatelessProps]))
  }
}
