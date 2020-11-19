package typingsSlinky.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DeleteDocumentByQueryResponse = typingsSlinky.elasticsearch.mod.ReindexResponse
  
  type InfoParams = typingsSlinky.elasticsearch.mod.GenericParams
  
  type NameList = java.lang.String | js.Array[java.lang.String] | scala.Boolean
  
  type PingParams = typingsSlinky.elasticsearch.mod.GenericParams
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.elasticsearch.elasticsearchStrings.wait_for
    - typingsSlinky.elasticsearch.elasticsearchStrings._empty
  */
  type Refresh = typingsSlinky.elasticsearch.mod._Refresh | scala.Boolean
  
  type TimeSpan = java.lang.String
  
  type UpdateDocumentByQueryResponse = typingsSlinky.elasticsearch.mod.ReindexResponse
}
