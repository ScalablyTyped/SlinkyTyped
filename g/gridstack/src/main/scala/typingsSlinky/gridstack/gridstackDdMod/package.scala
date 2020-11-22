package typingsSlinky.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gridstackDdMod {
  
  type DDCallback = js.Function3[
    /* event */ org.scalajs.dom.raw.Event, 
    /* arg2 */ typingsSlinky.gridstack.typesMod.GridItemHTMLElement, 
    /* helper */ js.UndefOr[typingsSlinky.gridstack.typesMod.GridItemHTMLElement], 
    scala.Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gridstack.gridstackStrings.minWidth
    - typingsSlinky.gridstack.gridstackStrings.minHeight
    - java.lang.String
  */
  type DDKey = typingsSlinky.gridstack.gridstackDdMod._DDKey | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gridstack.gridstackStrings.enable
    - typingsSlinky.gridstack.gridstackStrings.disable
    - typingsSlinky.gridstack.gridstackStrings.destroy
    - typingsSlinky.gridstack.gridstackStrings.option
    - java.lang.String
    - js.Any
  */
  type DDOpts = typingsSlinky.gridstack.gridstackDdMod._DDOpts | java.lang.String | js.Any
  
  type DDValue = scala.Double | java.lang.String
}
