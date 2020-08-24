package typingsSlinky.roslib.mod

import typingsSlinky.roslib.anon.Xml
import typingsSlinky.roslib.roslibNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "UrdfBox")
@js.native
class UrdfBox protected () extends UrdfGeometry {
  /**
    * A Box element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  var dimension: Vector3 = js.native
  var `type`: `1` = js.native
}

