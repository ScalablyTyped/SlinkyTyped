package typingsSlinky.parseEntities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Error handler.
    */
  type ErrorHandler[C] = js.ThisFunction3[
    /* this */ C, 
    /* reason */ java.lang.String, 
    /* position */ typingsSlinky.parseEntities.mod.Position, 
    /* code */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Character reference handler.
    */
  type ReferenceHandler[C] = js.ThisFunction3[
    /* this */ C, 
    /* value */ java.lang.String, 
    /* location */ typingsSlinky.parseEntities.mod.Location, 
    /* source */ typingsSlinky.parseEntities.mod.Location, 
    scala.Unit
  ]
  
  /**
    * Text handler.
    */
  type TextHandler[C] = js.ThisFunction2[
    /* this */ C, 
    /* value */ java.lang.String, 
    /* location */ typingsSlinky.parseEntities.mod.Location, 
    scala.Unit
  ]
}
