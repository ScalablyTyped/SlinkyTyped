package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.checkTypesMod.ICheckStyleProps
import typingsSlinky.officeUiFabricReact.checkTypesMod.ICheckStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Check/Check.styles", JSImport.Namespace)
@js.native
object checkStylesMod extends js.Object {
  
  def getStyles(props: ICheckStyleProps): ICheckStyles = js.native
  
  @js.native
  object CheckGlobalClassNames extends js.Object {
    
    var check: String = js.native
    
    /** Must be manually applied to the parent element of the check. */
    var checkHost: String = js.native
    
    var circle: String = js.native
    
    var root: String = js.native
  }
}
