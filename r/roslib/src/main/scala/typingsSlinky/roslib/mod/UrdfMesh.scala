package typingsSlinky.roslib.mod

import typingsSlinky.roslib.anon.Xml
import typingsSlinky.roslib.roslibNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "UrdfMesh")
@js.native
class UrdfMesh protected () extends UrdfGeometry {
  /**
    * A Box element in a URDF.
    *
    * @constructor
    * @param options - object with following keys:
    *  * xml - the XML element to parse
    */
  def this(options: Xml) = this()
  
  var filename: String = js.native
  
  var scale: Vector3 | Null = js.native
  
  var `type`: `3` = js.native
}
