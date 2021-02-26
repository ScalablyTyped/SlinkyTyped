package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.Horizontal
import typingsSlinky.reactNative.reactNativeStrings.Inverse
import typingsSlinky.reactNative.reactNativeStrings.Large
import typingsSlinky.reactNative.reactNativeStrings.LargeInverse
import typingsSlinky.reactNative.reactNativeStrings.Normal
import typingsSlinky.reactNative.reactNativeStrings.Small
import typingsSlinky.reactNative.reactNativeStrings.SmallInverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarAndroidProps extends ViewProps {
  
  /**
    * Whether to show the ProgressBar (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of the progress bar.
    */
  var color: js.UndefOr[ColorValue] = js.native
  
  /**
    * If the progress bar will show indeterminate progress.
    * Note that this can only be false if styleAttr is Horizontal.
    */
  var indeterminate: js.UndefOr[Boolean] = js.native
  
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * Style of the ProgressBar. One of:
    Horizontal
    Normal (default)
    Small
    Large
    Inverse
    SmallInverse
    LargeInverse
    */
  var styleAttr: js.UndefOr[Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse] = js.native
}
object ProgressBarAndroidProps {
  
  @scala.inline
  def apply(): ProgressBarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarAndroidProps]
  }
  
  @scala.inline
  implicit class ProgressBarAndroidPropsMutableBuilder[Self <: ProgressBarAndroidProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    @scala.inline
    def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setStyleAttr(value: Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse): Self = StObject.set(x, "styleAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleAttrUndefined: Self = StObject.set(x, "styleAttr", js.undefined)
  }
}
