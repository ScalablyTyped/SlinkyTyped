package typingsSlinky.androiduix.android.graphics.drawable

import typingsSlinky.androiduix.android.graphics.drawable.Drawable.Callback
import typingsSlinky.androiduix.android.graphics.drawable.Drawable.ConstantState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleDrawable
  extends Drawable
     with Callback {
  
  @JSName("drawableSizeChange")
  def drawableSizeChange_MScaleDrawable(who: Drawable): Unit = js.native
  
  def getDrawable(): Drawable = js.native
  
  var mMutated: js.Any = js.native
  
  var mScaleState: js.Any = js.native
  
  var mTmpRect: js.Any = js.native
}
object ScaleDrawable {
  
  @js.native
  trait ScaleState extends ConstantState {
    
    def canConstantState(): Boolean = js.native
    
    var mCanConstantState: js.Any = js.native
    
    var mCheckedConstantState: js.Any = js.native
    
    var mDrawable: Drawable = js.native
    
    var mGravity: Double = js.native
    
    var mScaleHeight: Double = js.native
    
    var mScaleWidth: Double = js.native
    
    var mUseIntrinsicSizeAsMin: Boolean = js.native
  }
  object ScaleState {
    
    @scala.inline
    def apply(
      canConstantState: () => Boolean,
      mCanConstantState: js.Any,
      mCheckedConstantState: js.Any,
      mDrawable: Drawable,
      mGravity: Double,
      mScaleHeight: Double,
      mScaleWidth: Double,
      mUseIntrinsicSizeAsMin: Boolean,
      newDrawable: () => Drawable
    ): ScaleState = {
      val __obj = js.Dynamic.literal(canConstantState = js.Any.fromFunction0(canConstantState), mCanConstantState = mCanConstantState.asInstanceOf[js.Any], mCheckedConstantState = mCheckedConstantState.asInstanceOf[js.Any], mDrawable = mDrawable.asInstanceOf[js.Any], mGravity = mGravity.asInstanceOf[js.Any], mScaleHeight = mScaleHeight.asInstanceOf[js.Any], mScaleWidth = mScaleWidth.asInstanceOf[js.Any], mUseIntrinsicSizeAsMin = mUseIntrinsicSizeAsMin.asInstanceOf[js.Any], newDrawable = js.Any.fromFunction0(newDrawable))
      __obj.asInstanceOf[ScaleState]
    }
    
    @scala.inline
    implicit class ScaleStateMutableBuilder[Self <: ScaleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanConstantState(value: () => Boolean): Self = StObject.set(x, "canConstantState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMCanConstantState(value: js.Any): Self = StObject.set(x, "mCanConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCheckedConstantState(value: js.Any): Self = StObject.set(x, "mCheckedConstantState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDrawable(value: Drawable): Self = StObject.set(x, "mDrawable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMGravity(value: Double): Self = StObject.set(x, "mGravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScaleHeight(value: Double): Self = StObject.set(x, "mScaleHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMScaleWidth(value: Double): Self = StObject.set(x, "mScaleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUseIntrinsicSizeAsMin(value: Boolean): Self = StObject.set(x, "mUseIntrinsicSizeAsMin", value.asInstanceOf[js.Any])
    }
  }
}
