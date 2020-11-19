package typingsSlinky.glob.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlobStatic
  extends EventEmitter
     with Instantiable1[/* pattern */ String, IGlob]
     with Instantiable2[
      /* pattern */ String, 
      (/* cb */ js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]) | (/* options */ IOptions), 
      IGlob
    ]
     with Instantiable3[
      /* pattern */ String, 
      /* options */ IOptions, 
      /* cb */ js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit], 
      IGlob
    ]
