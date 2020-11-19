package typingsSlinky.chaiEnzyme

import slinky.core.ReactComponentClass
import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.cheerio.Cheerio
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chai-enzyme", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): ChaiPlugin = js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, ReactComponentClass[js.Object]]) | Cheerio | (ReactWrapper[js.Any, js.Any, ReactComponentClass[js.Object]])
}
