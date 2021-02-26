package typingsSlinky.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TimeLimiter limits the number of items handled by a {@link PIXI.BasePrepare} to a specified
  * number of milliseconds per frame.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait TimeLimiter extends StObject {
  
  /**
    * Checks to see if another item can be uploaded. This should only be called once per item.
    * @return {boolean} If the item is allowed to be uploaded.
    */
  def allowedToUpload(): Boolean = js.native
  
  /**
    * Resets any counting properties to start fresh on a new frame.
    */
  def beginFrame(): Unit = js.native
}
object TimeLimiter {
  
  @scala.inline
  def apply(allowedToUpload: () => Boolean, beginFrame: () => Unit): TimeLimiter = {
    val __obj = js.Dynamic.literal(allowedToUpload = js.Any.fromFunction0(allowedToUpload), beginFrame = js.Any.fromFunction0(beginFrame))
    __obj.asInstanceOf[TimeLimiter]
  }
  
  @scala.inline
  implicit class TimeLimiterMutableBuilder[Self <: TimeLimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedToUpload(value: () => Boolean): Self = StObject.set(x, "allowedToUpload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginFrame(value: () => Unit): Self = StObject.set(x, "beginFrame", js.Any.fromFunction0(value))
  }
}
