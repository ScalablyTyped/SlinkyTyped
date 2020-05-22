package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extractor extends js.Object {
  var extractor: typingsSlinky.angularCompiler.extractorMod.Extractor
  var staticReflector: StaticReflector
}

object Extractor {
  @scala.inline
  def apply(extractor: typingsSlinky.angularCompiler.extractorMod.Extractor, staticReflector: StaticReflector): Extractor = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], staticReflector = staticReflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extractor]
  }
}

