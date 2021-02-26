package typingsSlinky.chaiEnzyme

import slinky.core.ReactComponentClass
import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.cheerio.cheerio.Cheerio
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chai-enzyme", JSImport.Namespace)
  @js.native
  def apply(): ChaiPlugin = js.native
  @JSImport("chai-enzyme", JSImport.Namespace)
  @js.native
  def apply(wrapper: js.Function1[/* debugWrapper */ DebugWrapper, String]): ChaiPlugin = js.native
  
  type DebugWrapper = (ShallowWrapper[js.Any, js.Any, ReactComponentClass[js.Object]]) | Cheerio | (ReactWrapper[js.Any, js.Any, ReactComponentClass[js.Object]])
}
