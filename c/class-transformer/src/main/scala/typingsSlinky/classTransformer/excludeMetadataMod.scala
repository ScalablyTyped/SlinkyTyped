package typingsSlinky.classTransformer

import typingsSlinky.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer/metadata/ExcludeMetadata", JSImport.Namespace)
@js.native
object excludeMetadataMod extends js.Object {
  
  @js.native
  class ExcludeMetadata protected () extends js.Object {
    def this(target: js.Function, propertyName: String, options: ExcludeOptions) = this()
    
    var options: ExcludeOptions = js.native
    
    var propertyName: String = js.native
    
    var target: js.Function = js.native
  }
}
