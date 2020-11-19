package typingsSlinky.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BinaryRecord = typingsSlinky.orientjs.mod.ORecord with typingsSlinky.node.Buffer
  
  type ODocument = typingsSlinky.orientjs.mod.ORecord
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.orientjs.mod.ORawExpression
    - typingsSlinky.orientjs.mod.OSqlFunction
  */
  type OSqlExpression = typingsSlinky.orientjs.mod._OSqlExpression | java.lang.String
  
  type Version = scala.Double | java.lang.String
}
