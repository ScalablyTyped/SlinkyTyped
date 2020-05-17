package typingsSlinky.postcss.mod

import typingsSlinky.postcss.anon.ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.postcss.mod.AcceptedPlugin because Already inherited */ @js.native
trait Plugin_[T] extends Transformer {
  var postcss: Transformer = js.native
  def apply(): Transformer = js.native
  def apply(opts: T): Transformer = js.native
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: ToString): LazyResult = js.native
  def process(css: ToString, opts: js.Any): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
}

