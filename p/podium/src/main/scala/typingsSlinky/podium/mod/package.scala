package typingsSlinky.podium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Criteria = java.lang.String | typingsSlinky.podium.mod.CriteriaObject
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.podium.mod.EventOptionsObject
    - typingsSlinky.podium.mod.Podium
  */
  type Events = typingsSlinky.podium.mod._Events | java.lang.String
  
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[typingsSlinky.podium.mod.Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  
  type Tags = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
