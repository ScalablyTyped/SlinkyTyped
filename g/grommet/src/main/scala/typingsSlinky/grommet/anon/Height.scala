package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.fill
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends StObject {
  
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | fill | full | String] = js.native
  
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | fill | full | String] = js.native
}
object Height {
  
  @scala.inline
  def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
