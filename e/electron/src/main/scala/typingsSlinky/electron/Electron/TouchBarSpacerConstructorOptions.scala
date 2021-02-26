package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.flexible
import typingsSlinky.electron.electronStrings.large
import typingsSlinky.electron.electronStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarSpacerConstructorOptions extends StObject {
  
  /**
    * Size of spacer, possible values are:
    */
  var size: js.UndefOr[small | large | flexible] = js.native
}
object TouchBarSpacerConstructorOptions {
  
  @scala.inline
  def apply(): TouchBarSpacerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBarSpacerConstructorOptions]
  }
  
  @scala.inline
  implicit class TouchBarSpacerConstructorOptionsMutableBuilder[Self <: TouchBarSpacerConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: small | large | flexible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
