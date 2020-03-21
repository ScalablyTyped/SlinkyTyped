package typingsSlinky.ionicCore.virtualScrollInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCore.ionicCoreStrings.item
  - typingsSlinky.ionicCore.ionicCoreStrings.header
  - typingsSlinky.ionicCore.ionicCoreStrings.footer
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def footer: typingsSlinky.ionicCore.ionicCoreStrings.footer = this.cast("footer")
  @scala.inline
  def header: typingsSlinky.ionicCore.ionicCoreStrings.header = this.cast("header")
  @scala.inline
  def item: typingsSlinky.ionicCore.ionicCoreStrings.item = this.cast("item")
}

