package typingsSlinky.classValidator

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.classValidator.constraintMetadataMod.ConstraintMetadata
import typingsSlinky.classValidator.validationMetadataMod.ValidationMetadata
import typingsSlinky.classValidator.validationSchemaMod.ValidationSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataStorageMod {
  
  @JSImport("class-validator/types/metadata/MetadataStorage", "MetadataStorage")
  @js.native
  class MetadataStorage () extends StObject {
    
    /**
      * Adds a new constraint metadata.
      */
    def addConstraintMetadata(metadata: ConstraintMetadata): Unit = js.native
    
    /**
      * Adds a new validation metadata.
      */
    def addValidationMetadata(metadata: ValidationMetadata): Unit = js.native
    
    /**
      * Adds a new validation metadata.
      */
    def addValidationSchema(schema: ValidationSchema): Unit = js.native
    
    var constraintMetadatas: js.Any = js.native
    
    /**
      * Gets all validation metadatas for the given object with the given groups.
      */
    def getTargetValidationMetadatas(targetConstructor: js.Function, targetSchema: String): js.Array[ValidationMetadata] = js.native
    def getTargetValidationMetadatas(targetConstructor: js.Function, targetSchema: String, groups: js.Array[String]): js.Array[ValidationMetadata] = js.native
    
    /**
      * Gets all validator constraints for the given object.
      */
    def getTargetValidatorConstraints(target: js.Function): js.Array[ConstraintMetadata] = js.native
    
    /**
      * Groups metadata by their property names.
      */
    def groupByPropertyName(metadata: js.Array[ValidationMetadata]): StringDictionary[js.Array[ValidationMetadata]] = js.native
    
    val hasValidationMetaData: Boolean = js.native
    
    var validationMetadatas: js.Any = js.native
  }
  
  @JSImport("class-validator/types/metadata/MetadataStorage", "getMetadataStorage")
  @js.native
  def getMetadataStorage(): MetadataStorage = js.native
}
