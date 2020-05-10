package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.extractorMod.Extractor
import typingsSlinky.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtractor extends js.Object {
  var extractor: Extractor = js.native
  var staticReflector: StaticReflector = js.native
}

object AnonExtractor {
  @scala.inline
  def apply(extractor: Extractor, staticReflector: StaticReflector): AnonExtractor = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], staticReflector = staticReflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtractor]
  }
  @scala.inline
  implicit class AnonExtractorOps[Self <: AnonExtractor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtractor(value: Extractor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticReflector(value: StaticReflector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticReflector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

