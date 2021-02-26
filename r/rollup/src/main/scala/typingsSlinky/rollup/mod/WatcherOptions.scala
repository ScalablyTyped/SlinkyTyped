package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatcherOptions extends StObject {
  
  var buildDelay: js.UndefOr[Double] = js.native
  
  var chokidar: js.UndefOr[ChokidarOptions] = js.native
  
  var clearScreen: js.UndefOr[Boolean] = js.native
  
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
  
  var skipWrite: js.UndefOr[Boolean] = js.native
}
object WatcherOptions {
  
  @scala.inline
  def apply(): WatcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherOptions]
  }
  
  @scala.inline
  implicit class WatcherOptionsMutableBuilder[Self <: WatcherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildDelay(value: Double): Self = StObject.set(x, "buildDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDelayUndefined: Self = StObject.set(x, "buildDelay", js.undefined)
    
    @scala.inline
    def setChokidar(value: ChokidarOptions): Self = StObject.set(x, "chokidar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChokidarUndefined: Self = StObject.set(x, "chokidar", js.undefined)
    
    @scala.inline
    def setClearScreen(value: Boolean): Self = StObject.set(x, "clearScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearScreenUndefined: Self = StObject.set(x, "clearScreen", js.undefined)
    
    @scala.inline
    def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeRegExp(value: js.RegExp): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRegExp(value: js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setSkipWrite(value: Boolean): Self = StObject.set(x, "skipWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipWriteUndefined: Self = StObject.set(x, "skipWrite", js.undefined)
  }
}
