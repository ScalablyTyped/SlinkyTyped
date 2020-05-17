package typingsSlinky.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.listr.listrStrings.silent
  - typingsSlinky.listr.listrStrings.default
  - typingsSlinky.listr.listrStrings.verbose
  - typingsSlinky.listr.mod.ListrRendererClass[Ctx]
*/
trait ListrRendererValue[Ctx] extends js.Object

object ListrRendererValue {
  @scala.inline
  def silent[Ctx]: typingsSlinky.listr.listrStrings.silent = "silent".asInstanceOf[typingsSlinky.listr.listrStrings.silent]
  @scala.inline
  def default[Ctx]: typingsSlinky.listr.listrStrings.default = "default".asInstanceOf[typingsSlinky.listr.listrStrings.default]
  @scala.inline
  def verbose[Ctx]: typingsSlinky.listr.listrStrings.verbose = "verbose".asInstanceOf[typingsSlinky.listr.listrStrings.verbose]
  @scala.inline
  implicit def apply[Ctx](value: ListrRendererClass[Ctx]): ListrRendererValue[Ctx] = value.asInstanceOf[ListrRendererValue[Ctx]]
}

