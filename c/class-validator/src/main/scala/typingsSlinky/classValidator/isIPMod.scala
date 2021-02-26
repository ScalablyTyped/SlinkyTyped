package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isIPMod {
  
  @JSImport("class-validator/types/decorator/string/IsIP", "IS_IP")
  @js.native
  val IS_IP: /* "isIp" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(version: IsIpVersion): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "IsIP")
  @js.native
  def IsIP_(version: IsIpVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIP", "isIP")
  @js.native
  def isIP(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsIP", "isIP")
  @js.native
  def isIP(value: js.Any, version: IsIpVersion): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.classValidator.classValidatorNumbers.`4`
    - typingsSlinky.classValidator.classValidatorNumbers.`6`
    - typingsSlinky.classValidator.classValidatorStrings.`4`
    - typingsSlinky.classValidator.classValidatorStrings.`6`
  */
  trait IsIpVersion extends StObject
  object IsIpVersion {
    
    @scala.inline
    def `4`: typingsSlinky.classValidator.classValidatorNumbers.`4` = 4.asInstanceOf[typingsSlinky.classValidator.classValidatorNumbers.`4`]
    
    @scala.inline
    def `6`: typingsSlinky.classValidator.classValidatorNumbers.`6` = 6.asInstanceOf[typingsSlinky.classValidator.classValidatorNumbers.`6`]
  }
}
