package typingsSlinky.falcorHttpDatasource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("falcor-http-datasource", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object FalcorHttpDataSource extends js.Object {
    
    /**
      * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
      **/
    type XMlHttpSource = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource */ js.Any
  }
  
  /**
    * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
    **/
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @js.native
  class XMlHttpSource protected () extends js.Object {
    def this(jsonGraphUrl: String) = this()
    def this(jsonGraphUrl: String, config: js.Any) = this()
  }
  
  /**
    * A HttpDataSource object is a {@link DataSource} can be used to retrieve data from a remote JSONGraph object using the browser's XMLHttpRequest.
    **/
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FalcorModel.DataSource * / any */ @js.native
  class default protected () extends js.Object {
    def this(jsonGraphUrl: String) = this()
    def this(jsonGraphUrl: String, config: js.Any) = this()
  }
}
