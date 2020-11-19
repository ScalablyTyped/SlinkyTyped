package typingsSlinky.antd.anon

import typingsSlinky.antd.emptyMod.TransferLocale
import typingsSlinky.antd.generatePickerMod.PickerLocale
import typingsSlinky.antd.localeMod.ModalLocale
import typingsSlinky.antd.paginationPaginationMod.PaginationLocale
import typingsSlinky.antd.popconfirmMod.PopconfirmLocale
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/locale-provider.Locale> & {  exist :boolean | undefined} */
@js.native
trait PartialLocaleexistboolean extends js.Object {
  
  var Calendar: js.UndefOr[js.Object] = js.native
  
  var DatePicker: js.UndefOr[PickerLocale] = js.native
  
  var Empty: js.UndefOr[TransferLocale] = js.native
  
  var Form: js.UndefOr[DefaultValidateMessages] = js.native
  
  var Icon: js.UndefOr[js.Object] = js.native
  
  var Modal: js.UndefOr[ModalLocale] = js.native
  
  var PageHeader: js.UndefOr[js.Object] = js.native
  
  var Pagination: js.UndefOr[PaginationLocale] = js.native
  
  var Popconfirm: js.UndefOr[PopconfirmLocale] = js.native
  
  var Select: js.UndefOr[js.Object] = js.native
  
  var Table: js.UndefOr[TableLocale] = js.native
  
  var Text: js.UndefOr[js.Object] = js.native
  
  var TimePicker: js.UndefOr[js.Object] = js.native
  
  var Transfer: js.UndefOr[PartialTransferLocale] = js.native
  
  var Upload: js.UndefOr[UploadLocale] = js.native
  
  var exist: js.UndefOr[Boolean] = js.native
  
  var global: js.UndefOr[js.Object] = js.native
  
  var locale: js.UndefOr[String] = js.native
}
object PartialLocaleexistboolean {
  
  @scala.inline
  def apply(): PartialLocaleexistboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLocaleexistboolean]
  }
  
  @scala.inline
  implicit class PartialLocaleexistbooleanOps[Self <: PartialLocaleexistboolean] (val x: Self) extends AnyVal {
    
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
    def setCalendar(value: js.Object): Self = this.set("Calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar: Self = this.set("Calendar", js.undefined)
    
    @scala.inline
    def setDatePicker(value: PickerLocale): Self = this.set("DatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePicker: Self = this.set("DatePicker", js.undefined)
    
    @scala.inline
    def setEmpty(value: TransferLocale): Self = this.set("Empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("Empty", js.undefined)
    
    @scala.inline
    def setForm(value: DefaultValidateMessages): Self = this.set("Form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("Form", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Object): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("Icon", js.undefined)
    
    @scala.inline
    def setModal(value: ModalLocale): Self = this.set("Modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("Modal", js.undefined)
    
    @scala.inline
    def setPageHeader(value: js.Object): Self = this.set("PageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeader: Self = this.set("PageHeader", js.undefined)
    
    @scala.inline
    def setPagination(value: PaginationLocale): Self = this.set("Pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("Pagination", js.undefined)
    
    @scala.inline
    def setPopconfirm(value: PopconfirmLocale): Self = this.set("Popconfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopconfirm: Self = this.set("Popconfirm", js.undefined)
    
    @scala.inline
    def setSelect(value: js.Object): Self = this.set("Select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("Select", js.undefined)
    
    @scala.inline
    def setTable(value: TableLocale): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    
    @scala.inline
    def setText(value: js.Object): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setTimePicker(value: js.Object): Self = this.set("TimePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePicker: Self = this.set("TimePicker", js.undefined)
    
    @scala.inline
    def setTransfer(value: PartialTransferLocale): Self = this.set("Transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransfer: Self = this.set("Transfer", js.undefined)
    
    @scala.inline
    def setUpload(value: UploadLocale): Self = this.set("Upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("Upload", js.undefined)
    
    @scala.inline
    def setExist(value: Boolean): Self = this.set("exist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExist: Self = this.set("exist", js.undefined)
    
    @scala.inline
    def setGlobal(value: js.Object): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
