package typingsSlinky.appBuilderLib.pkgOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.tofit
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.none_
  - typingsSlinky.appBuilderLib.appBuilderLibStrings.proportional
*/
trait BackgroundScaling extends js.Object

object BackgroundScaling {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def proportional: typingsSlinky.appBuilderLib.appBuilderLibStrings.proportional = this.cast("proportional")
  @scala.inline
  def tofit: typingsSlinky.appBuilderLib.appBuilderLibStrings.tofit = this.cast("tofit")
}

