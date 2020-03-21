package typingsSlinky.aframe

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.three.mod.PropertyBinding
import typingsSlinky.three.propertyBindingMod.PropertyBinding.Composite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPropertyBinding
  extends Instantiable2[/* rootNode */ js.Any, /* path */ String, PropertyBinding] {
  def create(root: js.Any, path: js.Any): typingsSlinky.three.propertyBindingMod.PropertyBinding | Composite = js.native
  def create(root: js.Any, path: js.Any, parsedPath: js.Any): typingsSlinky.three.propertyBindingMod.PropertyBinding | Composite = js.native
  def findNode(root: js.Any, nodeName: String): js.Any = js.native
  def parseTrackName(trackName: String): js.Any = js.native
}

