package typingsSlinky.classTransformer

import typingsSlinky.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typingsSlinky.classTransformer.transformationTypeEnumMod.TransformationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMetadataMod {
  
  @JSImport("class-transformer/metadata/TransformMetadata", "TransformMetadata")
  @js.native
  class TransformMetadata protected () extends StObject {
    def this(
      target: js.Function,
      propertyName: String,
      transformFn: js.Function3[/* value */ js.Any, /* obj */ js.Any, /* transformationType */ TransformationType, _],
      options: TransformOptions
    ) = this()
    
    var options: TransformOptions = js.native
    
    var propertyName: String = js.native
    
    var target: js.Function = js.native
    
    def transformFn(value: js.Any, obj: js.Any, transformationType: TransformationType): js.Any = js.native
  }
}
