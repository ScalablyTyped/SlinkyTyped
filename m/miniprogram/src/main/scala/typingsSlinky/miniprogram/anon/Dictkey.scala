package typingsSlinky.miniprogram.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.miniprogram.LaunchQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Global data can be configured in `App()`. Other pages can get and modify the global data directly.
    */
  var globalData: js.UndefOr[js.Any] = js.native
  
  /**
    * On js error of the Mini Program
    */
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  
  /**
    * On switching Mini Program from foreground to background
    */
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * On completion of Mini Program initialization, invoked only once
    */
  var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchQuery], Unit]] = js.native
  
  /**
    * On startup of Mini Program or swithing to foreground from background
    */
  var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchQuery], Unit]] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalData(value: js.Any): Self = StObject.set(x, "globalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalDataUndefined: Self = StObject.set(x, "globalData", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: /* options */ js.UndefOr[LaunchQuery] => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* options */ js.UndefOr[LaunchQuery] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
