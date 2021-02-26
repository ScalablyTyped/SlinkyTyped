package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AllowedCSIDriver represents a single inline CSI Driver that is allowed to be used.
  */
@js.native
trait AllowedCSIDriver extends StObject {
  
  /**
    * Name is the registered name of the CSI driver
    */
  var name: Input[String] = js.native
}
object AllowedCSIDriver {
  
  @scala.inline
  def apply(name: Input[String]): AllowedCSIDriver = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedCSIDriver]
  }
  
  @scala.inline
  implicit class AllowedCSIDriverMutableBuilder[Self <: AllowedCSIDriver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
