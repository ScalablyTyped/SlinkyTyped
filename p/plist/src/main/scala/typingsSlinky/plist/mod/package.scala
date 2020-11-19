package typingsSlinky.plist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PlistBuildOptions = typingsSlinky.xmlbuilder.mod.XMLToStringOptions
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsSlinky.std.Date
    - typingsSlinky.node.Buffer
    - typingsSlinky.plist.mod.PlistObject
    - typingsSlinky.plist.mod.PlistArray
  */
  type PlistValue = typingsSlinky.plist.mod._PlistValue | java.lang.String | scala.Double | scala.Boolean | js.Date | typingsSlinky.node.Buffer
}
