package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.dockerodeStrings.`next-exit`
import typingsSlinky.dockerode.dockerodeStrings.`not-running`
import typingsSlinky.dockerode.dockerodeStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerWaitOptions extends StObject {
  
  /** Since v1.30 */
  var condition: js.UndefOr[`not-running` | `next-exit` | removed] = js.native
}
object ContainerWaitOptions {
  
  @scala.inline
  def apply(): ContainerWaitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerWaitOptions]
  }
  
  @scala.inline
  implicit class ContainerWaitOptionsMutableBuilder[Self <: ContainerWaitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: `not-running` | `next-exit` | removed): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
