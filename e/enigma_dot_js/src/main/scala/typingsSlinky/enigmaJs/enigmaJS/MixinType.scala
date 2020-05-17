package typingsSlinky.enigmaJs.enigmaJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.enigmaJs.enigmaJsStrings.Doc
  - typingsSlinky.enigmaJs.enigmaJsStrings.GenericObject
  - typingsSlinky.enigmaJs.enigmaJsStrings.GenericBookmark
  - java.lang.String
*/
trait MixinType extends js.Object

object MixinType {
  @scala.inline
  def Doc: typingsSlinky.enigmaJs.enigmaJsStrings.Doc = "Doc".asInstanceOf[typingsSlinky.enigmaJs.enigmaJsStrings.Doc]
  @scala.inline
  def GenericObject: typingsSlinky.enigmaJs.enigmaJsStrings.GenericObject = "GenericObject".asInstanceOf[typingsSlinky.enigmaJs.enigmaJsStrings.GenericObject]
  @scala.inline
  def GenericBookmark: typingsSlinky.enigmaJs.enigmaJsStrings.GenericBookmark = "GenericBookmark".asInstanceOf[typingsSlinky.enigmaJs.enigmaJsStrings.GenericBookmark]
  @scala.inline
  implicit def apply(value: String): MixinType = value.asInstanceOf[MixinType]
}

