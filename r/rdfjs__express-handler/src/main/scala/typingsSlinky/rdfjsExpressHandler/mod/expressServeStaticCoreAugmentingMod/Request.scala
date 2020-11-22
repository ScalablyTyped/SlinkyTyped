package typingsSlinky.rdfjsExpressHandler.mod.expressServeStaticCoreAugmentingMod

import typingsSlinky.rdfJs.mod.DatasetCore
import typingsSlinky.rdfJs.mod.Quad
import typingsSlinky.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  def dataset(): js.Promise[DatasetCore[Quad, Quad]] = js.native
  def dataset(parserOptions: js.Any): js.Promise[DatasetCore[Quad, Quad]] = js.native
  
  def quadStream(): Stream[Quad] = js.native
  def quadStream(parserOptions: js.Any): Stream[Quad] = js.native
}
