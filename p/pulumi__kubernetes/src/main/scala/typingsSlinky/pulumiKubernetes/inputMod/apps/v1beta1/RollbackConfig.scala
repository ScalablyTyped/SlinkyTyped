package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED.
  */
@js.native
trait RollbackConfig extends StObject {
  
  /**
    * The revision to rollback to. If set to 0, rollback to the last revision.
    */
  var revision: js.UndefOr[Input[Double]] = js.native
}
object RollbackConfig {
  
  @scala.inline
  def apply(): RollbackConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfig]
  }
  
  @scala.inline
  implicit class RollbackConfigMutableBuilder[Self <: RollbackConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevision(value: Input[Double]): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
