package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gridstack {
  
  /* Other items in https://github.com/gridstack/gridstack.js/blob/develop/doc/README.md
    * Grid attributes
    * Item attributes
    * Events
    */
  type GridStackElement = java.lang.String | org.scalajs.dom.raw.HTMLElement
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gridstack.gridstackStrings.added
    - typingsSlinky.gridstack.gridstackStrings.change
    - typingsSlinky.gridstack.gridstackStrings.disable
    - typingsSlinky.gridstack.gridstackStrings.dragstart
    - typingsSlinky.gridstack.gridstackStrings.dragstop
    - typingsSlinky.gridstack.gridstackStrings.dropped
    - typingsSlinky.gridstack.gridstackStrings.enable
    - typingsSlinky.gridstack.gridstackStrings.removed
    - typingsSlinky.gridstack.gridstackStrings.resize
    - typingsSlinky.gridstack.gridstackStrings.resizestart
    - typingsSlinky.gridstack.gridstackStrings.gsresizestop
    - java.lang.String
  */
  type GridStackEvent = typingsSlinky.gridstack._GridStackEvent | java.lang.String
}
