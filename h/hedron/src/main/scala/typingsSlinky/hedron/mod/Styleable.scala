package typingsSlinky.hedron.mod

import typingsSlinky.hedron.hedronStrings.`inline-block`
import typingsSlinky.hedron.hedronStrings.`inline-flex`
import typingsSlinky.hedron.hedronStrings.`inline-grid`
import typingsSlinky.hedron.hedronStrings.`inline-table`
import typingsSlinky.hedron.hedronStrings.`inline`
import typingsSlinky.hedron.hedronStrings.`list-item`
import typingsSlinky.hedron.hedronStrings.`run-in`
import typingsSlinky.hedron.hedronStrings.`table-caption`
import typingsSlinky.hedron.hedronStrings.`table-cell`
import typingsSlinky.hedron.hedronStrings.`table-column-group`
import typingsSlinky.hedron.hedronStrings.`table-column`
import typingsSlinky.hedron.hedronStrings.`table-footer-group`
import typingsSlinky.hedron.hedronStrings.`table-header-group`
import typingsSlinky.hedron.hedronStrings.`table-row-group`
import typingsSlinky.hedron.hedronStrings.`table-row`
import typingsSlinky.hedron.hedronStrings.block
import typingsSlinky.hedron.hedronStrings.collapse
import typingsSlinky.hedron.hedronStrings.contents
import typingsSlinky.hedron.hedronStrings.flex
import typingsSlinky.hedron.hedronStrings.grid
import typingsSlinky.hedron.hedronStrings.hidden
import typingsSlinky.hedron.hedronStrings.inherit
import typingsSlinky.hedron.hedronStrings.initial
import typingsSlinky.hedron.hedronStrings.none
import typingsSlinky.hedron.hedronStrings.table
import typingsSlinky.hedron.hedronStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styleable extends js.Object {
  
  /**
    * Background Property
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * Border property
    */
  var border: js.UndefOr[String] = js.native
  
  /**
    * Display Property
    */
  var display: js.UndefOr[
    `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
  ] = js.native
  
  /**
    * Height Property
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Controls hidden
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of padding added
    */
  var margin: js.UndefOr[String] = js.native
  
  /**
    * Opacity Property
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * The amount of padding added
    */
  var padding: js.UndefOr[String] = js.native
  
  /**
    * Visibilty Property
    */
  var visibility: js.UndefOr[visible | hidden | collapse | initial | inherit] = js.native
  
  /**
    * Width Property
    */
  var width: js.UndefOr[String] = js.native
}
object Styleable {
  
  @scala.inline
  def apply(): Styleable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styleable]
  }
  
  @scala.inline
  implicit class StyleableOps[Self <: Styleable] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDisplay(
      value: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row`
    ): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setVisibility(value: visible | hidden | collapse | initial | inherit): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
