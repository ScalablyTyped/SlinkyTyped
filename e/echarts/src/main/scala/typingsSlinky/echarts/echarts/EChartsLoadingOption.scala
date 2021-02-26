package typingsSlinky.echarts.echarts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for `echartsInstance.showLoading` method
  * {@link https://echarts.apache.org/en/api.html#echartsInstance.showLoading}
  */
@js.native
trait EChartsLoadingOption extends StObject {
  
  /**
    * Loading circle color.
    * @default '#c23531'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Font size.
    * @default 12
    * @since 4.8.0
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Line width of the "spinner".
    * @default 5
    * @since 4.8.0
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * Mask background color.
    * @default 'rgba(255, 255, 255, 0.8)'
    */
  var maskColor: js.UndefOr[String] = js.native
  
  /**
    * Show an animated "spinner" or not.
    * @default true
    * @since 4.8.0
    */
  var showSpinner: js.UndefOr[Boolean] = js.native
  
  /**
    * Radius of the "spinner".
    * @default 10
    * @since 4.8.0
    */
  var spinnerRadius: js.UndefOr[Double] = js.native
  
  /**
    * Loading text.
    * @default 'loading'
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Loading text color.
    * @default '#000'
    */
  var textColor: js.UndefOr[String] = js.native
  
  /**
    * Zlevel of loading. If not 0, it creates a new canvas for loading.
    * @default 0
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object EChartsLoadingOption {
  
  @scala.inline
  def apply(): EChartsLoadingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsLoadingOption]
  }
  
  @scala.inline
  implicit class EChartsLoadingOptionMutableBuilder[Self <: EChartsLoadingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    @scala.inline
    def setShowSpinner(value: Boolean): Self = StObject.set(x, "showSpinner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSpinnerUndefined: Self = StObject.set(x, "showSpinner", js.undefined)
    
    @scala.inline
    def setSpinnerRadius(value: Double): Self = StObject.set(x, "spinnerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnerRadiusUndefined: Self = StObject.set(x, "spinnerRadius", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
  }
}
