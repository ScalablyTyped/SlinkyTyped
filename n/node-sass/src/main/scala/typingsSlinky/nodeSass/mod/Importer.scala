package typingsSlinky.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSass.mod.AsyncImporter
  - typingsSlinky.nodeSass.mod.SyncImporter
*/
trait Importer extends js.Object

object Importer {
  @scala.inline
  implicit def apply(value: AsyncImporter): Importer = value.asInstanceOf[Importer]
  @scala.inline
  implicit def apply(value: SyncImporter): Importer = value.asInstanceOf[Importer]
}

