package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaginationConfig extends js.Object {
  
  /**
    * Whether to always display the first and last page numbers. If max-size is smaller than the number of pages, then the first and last page numbers are still shown with ellipses in-between as necessary. NOTE: max-size refers to the center of the range. This option may add up to 2 more numbers on each side of the displayed range for the end value and what would be an ellipsis but is replaced by a number because it is sequential.
    *
    * @default false
    */
  var boundaryLinkNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display First / Last buttons.
    *
    * @default false
    */
  var boundaryLinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display Previous / Next buttons.
    *
    * @default true
    */
  var directionLinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Text for First button.
    *
    * @default 'First'
    */
  var firstText: js.UndefOr[String] = js.native
  
  /**
    * Also displays ellipses when rotate is true and max-size is smaller than the number of pages.
    *
    * @default  false
    */
  var forceEllipses: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * Text for Last button.
    *
    * @default 'Last'
    */
  var lastText: js.UndefOr[String] = js.native
  
  /**
    * Limit number for pagination size.
    *
    * @default: null
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * Text for Next button.
    *
    * @default 'Next'
    */
  var nextText: js.UndefOr[String] = js.native
  
  /**
    * An optional expression assigned the total number of pages to display.
    *
    * @default angular.noop
    */
  var numPages: js.UndefOr[Double] = js.native
  
  /**
    * Text for Previous button.
    *
    * @default 'Previous'
    */
  var previousText: js.UndefOr[String] = js.native
  
  /**
    * Whether to keep current page in the middle of the visible ones.
    *
    * @default true
    */
  var rotate: js.UndefOr[Boolean] = js.native
  
  /**
    * Override the template for the component with a custom provided template.
    *
    * @default  'template/pagination/pagination.html'
    */
  var templateUrl: js.UndefOr[String] = js.native
  
  /**
    * Total number of items in all pages.
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object IPaginationConfig {
  
  @scala.inline
  def apply(): IPaginationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaginationConfig]
  }
  
  @scala.inline
  implicit class IPaginationConfigOps[Self <: IPaginationConfig] (val x: Self) extends AnyVal {
    
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
    def setBoundaryLinkNumbers(value: Boolean): Self = this.set("boundaryLinkNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryLinkNumbers: Self = this.set("boundaryLinkNumbers", js.undefined)
    
    @scala.inline
    def setBoundaryLinks(value: Boolean): Self = this.set("boundaryLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryLinks: Self = this.set("boundaryLinks", js.undefined)
    
    @scala.inline
    def setDirectionLinks(value: Boolean): Self = this.set("directionLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionLinks: Self = this.set("directionLinks", js.undefined)
    
    @scala.inline
    def setFirstText(value: String): Self = this.set("firstText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstText: Self = this.set("firstText", js.undefined)
    
    @scala.inline
    def setForceEllipses(value: Boolean): Self = this.set("forceEllipses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceEllipses: Self = this.set("forceEllipses", js.undefined)
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
    
    @scala.inline
    def setLastText(value: String): Self = this.set("lastText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastText: Self = this.set("lastText", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setNextText(value: String): Self = this.set("nextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextText: Self = this.set("nextText", js.undefined)
    
    @scala.inline
    def setNumPages(value: Double): Self = this.set("numPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumPages: Self = this.set("numPages", js.undefined)
    
    @scala.inline
    def setPreviousText(value: String): Self = this.set("previousText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousText: Self = this.set("previousText", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}
