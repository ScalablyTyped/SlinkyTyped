package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.`bottom-left`
import typingsSlinky.grommet.grommetStrings.`bottom-right`
import typingsSlinky.grommet.grommetStrings.`top-left`
import typingsSlinky.grommet.grommetStrings.`top-right`
import typingsSlinky.grommet.grommetStrings.bottom
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.left
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.right
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.top
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.utilsMod._RoundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Corner extends _RoundType {
  
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.native
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
}
object Corner {
  
  @scala.inline
  def apply(): Corner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Corner]
  }
  
  @scala.inline
  implicit class CornerMutableBuilder[Self <: Corner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorner(value: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
    
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
