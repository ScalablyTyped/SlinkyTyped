package typingsSlinky.classValidator

import typingsSlinky.classValidator.validationOptionsMod.ValidationOptions
import typingsSlinky.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isUUIDMod {
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "IS_UUID")
  @js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(version: UUIDVersion): PropertyDecorator = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "IsUUID")
  @js.native
  def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUUID", "isUUID")
  @js.native
  def isUUID(value: js.Any): Boolean = js.native
  @JSImport("class-validator/types/decorator/string/IsUUID", "isUUID")
  @js.native
  def isUUID(value: js.Any, version: UUIDVersion): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.classValidator.classValidatorNumbers.`3`
    - typingsSlinky.classValidator.classValidatorNumbers.`4`
    - typingsSlinky.classValidator.classValidatorNumbers.`5`
    - typingsSlinky.classValidator.classValidatorStrings.`3`
    - typingsSlinky.classValidator.classValidatorStrings.`4`
    - typingsSlinky.classValidator.classValidatorStrings.`5`
    - typingsSlinky.classValidator.classValidatorStrings.all
  */
  trait UUIDVersion extends StObject
  object UUIDVersion {
    
    @scala.inline
    def `3`: typingsSlinky.classValidator.classValidatorNumbers.`3` = 3.asInstanceOf[typingsSlinky.classValidator.classValidatorNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.classValidator.classValidatorNumbers.`4` = 4.asInstanceOf[typingsSlinky.classValidator.classValidatorNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.classValidator.classValidatorNumbers.`5` = 5.asInstanceOf[typingsSlinky.classValidator.classValidatorNumbers.`5`]
    
    @scala.inline
    def all: typingsSlinky.classValidator.classValidatorStrings.all = "all".asInstanceOf[typingsSlinky.classValidator.classValidatorStrings.all]
  }
}
