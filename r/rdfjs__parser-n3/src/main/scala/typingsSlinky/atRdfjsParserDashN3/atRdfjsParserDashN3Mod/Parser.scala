package typingsSlinky.atRdfjsParserDashN3.atRdfjsParserDashN3Mod

import typingsSlinky.rdfDashJs.rdfDashJsMod.BaseQuad
import typingsSlinky.rdfDashJs.rdfDashJsMod.Sink
import typingsSlinky.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser[Q /* <: BaseQuad */] extends Sink[Q] {
  def `import`(stream: Stream[Q], options: ParserOptions): Stream[Q] = js.native
}

