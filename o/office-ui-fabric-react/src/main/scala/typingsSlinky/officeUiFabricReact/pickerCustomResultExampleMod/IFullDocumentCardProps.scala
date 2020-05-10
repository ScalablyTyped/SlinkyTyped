package typingsSlinky.officeUiFabricReact.pickerCustomResultExampleMod

import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps
import typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityProps
import typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps
import typingsSlinky.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typingsSlinky.officeUiFabricReact.documentCardTypesMod.IDocumentCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFullDocumentCardProps extends js.Object {
  var documentActionsProps: js.UndefOr[IDocumentCardActionsProps] = js.native
  var documentActivityProps: js.UndefOr[IDocumentCardActivityProps] = js.native
  var documentCardProps: js.UndefOr[IDocumentCardProps] = js.native
  var documentPreviewProps: js.UndefOr[IDocumentCardPreviewProps] = js.native
  var documentTitleProps: js.UndefOr[IDocumentCardTitleProps] = js.native
}

object IFullDocumentCardProps {
  @scala.inline
  def apply(): IFullDocumentCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullDocumentCardProps]
  }
  @scala.inline
  implicit class IFullDocumentCardPropsOps[Self <: IFullDocumentCardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentActionsProps(value: IDocumentCardActionsProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentActionsProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentActionsProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentActionsProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentActivityProps(value: IDocumentCardActivityProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentActivityProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentActivityProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentActivityProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentCardProps(value: IDocumentCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentCardProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentCardProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentCardProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentPreviewProps(value: IDocumentCardPreviewProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentPreviewProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentPreviewProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentPreviewProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentTitleProps(value: IDocumentCardTitleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTitleProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentTitleProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTitleProps")(js.undefined)
        ret
    }
  }
  
}

