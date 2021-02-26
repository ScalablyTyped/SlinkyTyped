package typingsSlinky.elasticApmNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CaptureErrorCallback = js.Function2[/* err */ js.Error | scala.Null, /* id */ java.lang.String, scala.Unit]
  
  type FilterFn = js.Function1[
    /* payload */ typingsSlinky.elasticApmNode.mod.Payload, 
    typingsSlinky.elasticApmNode.mod.Payload | scala.Boolean | scala.Unit
  ]
  
  type KeyValueConfig = java.lang.String | typingsSlinky.elasticApmNode.mod.Labels | js.Array[js.Array[typingsSlinky.elasticApmNode.mod.LabelValue]]
  
  type LabelValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  
  type Labels = org.scalablytyped.runtime.StringDictionary[typingsSlinky.elasticApmNode.mod.LabelValue]
  
  type PatchHandler = js.Function3[
    /* exports */ js.Any, 
    /* agent */ typingsSlinky.elasticApmNode.mod.Agent, 
    /* options */ typingsSlinky.elasticApmNode.mod.PatchOptions, 
    js.Any
  ]
  
  type Payload = org.scalablytyped.runtime.StringDictionary[js.Any]
}
