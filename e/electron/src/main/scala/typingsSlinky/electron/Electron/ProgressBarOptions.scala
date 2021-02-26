package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.error
import typingsSlinky.electron.electronStrings.indeterminate
import typingsSlinky.electron.electronStrings.none
import typingsSlinky.electron.electronStrings.normal
import typingsSlinky.electron.electronStrings.paused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarOptions extends StObject {
  
  /**
    * Mode for the progress bar. Can be `none`, `normal`, `indeterminate`, `error` or
    * `paused`.
    *
    * @platform win32
    */
  var mode: none | normal | indeterminate | error | paused = js.native
}
object ProgressBarOptions {
  
  @scala.inline
  def apply(mode: none | normal | indeterminate | error | paused): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: none | normal | indeterminate | error | paused): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
