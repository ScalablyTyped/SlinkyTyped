package typingsSlinky.jointjs.mod.dia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Paper {
  
  type AfterRenderCallback = js.Function3[
    /* stats */ typingsSlinky.jointjs.mod.dia.Paper.UpdateStats, 
    /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  
  type BeforeRenderCallback = js.Function2[
    /* opt */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  
  type Dimension = scala.Double | java.lang.String | scala.Null
  
  type ProgressCallback = js.Function5[
    /* done */ scala.Boolean, 
    /* processed */ scala.Double, 
    /* total */ scala.Double, 
    /* stats */ typingsSlinky.jointjs.mod.dia.Paper.UpdateStats, 
    /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
    scala.Unit
  ]
  
  type ViewportCallback = js.Function3[
    /* view */ typingsSlinky.jointjs.mod.mvc.View[js.Any], 
    /* isMounted */ scala.Boolean, 
    /* paper */ typingsSlinky.jointjs.mod.dia.Paper, 
    scala.Boolean
  ]
}
