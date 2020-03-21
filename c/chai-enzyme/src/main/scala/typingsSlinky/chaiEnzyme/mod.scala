package typingsSlinky.chaiEnzyme

import slinky.core.ReactComponentClass
import typingsSlinky.chai.Chai_.ChaiPlugin
import typingsSlinky.cheerio.Cheerio_
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai-enzyme", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): ChaiPlugin = js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, ReactComponentClass[js.Object]]) | Cheerio_ | (ReactWrapper[js.Any, js.Any, ReactComponentClass[js.Object]])
}

