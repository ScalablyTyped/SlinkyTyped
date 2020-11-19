package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLayoutManagerGridLayout
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the duration of the animations in the layout manager"s grid layout
    *
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Number of columns in the grid
    *
    */
  var cols: js.UndefOr[Double] = js.native
  
  /**
    * Accepts number, string with height in px, percents,                        or asterisk (*) which will distribute all the height between all the columns equally.
    *                         It can also accept an array, specifying height for each column. If more than one column
    *                         has an asterisk value, the remaining height will be equally distributed between these columns.
    *                     array The column height can be set as an array of heights.
    *
    */
  var columnHeight: js.UndefOr[String | Double | js.Array[_]] = js.native
  
  /**
    * Accepts number or string with width in px, percents                        or asterisk (*) which will distribute all the width between all the columns equally.
    *                         It can also accept an array, specifying width for each column. If more than one column
    *                         has an asterisk value, the remaining width will be equally distributed between these columns.
    *                     array The column width can be set as an array of widths.
    *
    */
  var columnWidth: js.UndefOr[String | Double | js.Array[_]] = js.native
  
  /**
    * Specifies the margin left css property for items
    *
    */
  var marginLeft: js.UndefOr[Double] = js.native
  
  /**
    * Specifies the margin top css property for items
    *
    */
  var marginTop: js.UndefOr[Double] = js.native
  
  /**
    * Specifies whether the previous set options should be overriden when setting options
    *
    */
  var overrideConfigOnSetOption: js.UndefOr[Boolean] = js.native
  
  /**
    * Specified whether the items should rearrange to fit in the container when it is resized.
    *                         Have effect only when fixed columnWidth option is set.
    *
    */
  var rearrangeItems: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of rows in the grid
    *
    */
  var rows: js.UndefOr[Double] = js.native
}
object IgLayoutManagerGridLayout {
  
  @scala.inline
  def apply(): IgLayoutManagerGridLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerGridLayout]
  }
  
  @scala.inline
  implicit class IgLayoutManagerGridLayoutOps[Self <: IgLayoutManagerGridLayout] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setColumnHeightVarargs(value: js.Any*): Self = this.set("columnHeight", js.Array(value :_*))
    
    @scala.inline
    def setColumnHeight(value: String | Double | js.Array[_]): Self = this.set("columnHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeight: Self = this.set("columnHeight", js.undefined)
    
    @scala.inline
    def setColumnWidthVarargs(value: js.Any*): Self = this.set("columnWidth", js.Array(value :_*))
    
    @scala.inline
    def setColumnWidth(value: String | Double | js.Array[_]): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setOverrideConfigOnSetOption(value: Boolean): Self = this.set("overrideConfigOnSetOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideConfigOnSetOption: Self = this.set("overrideConfigOnSetOption", js.undefined)
    
    @scala.inline
    def setRearrangeItems(value: Boolean): Self = this.set("rearrangeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRearrangeItems: Self = this.set("rearrangeItems", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
