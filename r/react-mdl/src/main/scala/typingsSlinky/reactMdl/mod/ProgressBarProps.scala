package typingsSlinky.reactMdl.mod

import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarProps
  extends HTMLProps[js.Any] {
  
  var buffer: js.UndefOr[Double] = js.native
  
  var indeterminate: js.UndefOr[Boolean] = js.native
  
  var progress: js.UndefOr[Double] = js.native
}
object ProgressBarProps {
  
  @scala.inline
  def apply(): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarProps]
  }
  
  @scala.inline
  implicit class ProgressBarPropsMutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
