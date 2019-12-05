package typingsSlinky.plist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plistMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.xmlbuilder.xmlbuilderMod.XMLToStringOptions

  type PlistBuildOptions = XMLToStringOptions
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.node.Buffer
    - typings.plist.plistMod.PlistObject
    - typings.plist.plistMod.PlistArray
  */
  type PlistValue = _PlistValue | String | Double | Boolean | js.Date | Buffer
}
