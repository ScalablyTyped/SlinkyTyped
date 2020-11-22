package typingsSlinky.officeUiFabricReact.shimmerGapTypesMod

import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.uifabricMergeStyles.irawstyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerGapStyleProps extends js.Object {
  
  /**
    * Styles to override borderStyles with custom ones.
    * @deprecated in favor of mergeStyles API.
    */
  var borderStyle: js.UndefOr[IRawStyle] = js.native
  
  /**
    * Needed to provide a height to the root of the control.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Theme values passed to the component.
    */
  var theme: ITheme = js.native
}
object IShimmerGapStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IShimmerGapStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmerGapStyleProps]
  }
  
  @scala.inline
  implicit class IShimmerGapStylePropsOps[Self <: IShimmerGapStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: IRawStyle): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
}
