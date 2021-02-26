package typingsSlinky.orientjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * A lightweight definiton for orientjs module, Official node.js driver for OrientDB.
    *
    * @param {orientjs.ServerConfig} config
    * @returns {orientjs.OServer}
    */
  @scala.inline
  def apply(config: typingsSlinky.orientjs.mod.ServerConfig): typingsSlinky.orientjs.mod.OServer = typingsSlinky.orientjs.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.orientjs.mod.OServer]
  
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
