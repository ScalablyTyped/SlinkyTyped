package typingsSlinky.chaiDashEnzyme

import slinky.core.ReactComponentClass
import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.chaiDashEnzyme.chaiDashEnzymeMod.DebugWrapper
import typingsSlinky.cheerio.Cheerio
import typingsSlinky.enzyme.enzymeMod.ReactWrapper
import typingsSlinky.enzyme.enzymeMod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chai-enzyme", JSImport.Namespace)
@js.native
object chaiDashEnzymeMod extends js.Object {
  def apply(): ChaiPlugin = js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, ReactComponentClass[js.Object]]) | Cheerio | (ReactWrapper[js.Any, js.Any, ReactComponentClass[js.Object]])
}

