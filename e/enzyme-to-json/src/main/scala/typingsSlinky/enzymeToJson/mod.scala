package typingsSlinky.enzymeToJson

import slinky.core.ReactComponentClass
import typingsSlinky.cheerio.cheerio.Cheerio
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enzyme-to-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default[P, S](wrapper: Cheerio): js.Object = js.native
  def default[P, S](wrapper: ReactWrapper[P, S, ReactComponentClass[js.Object]]): js.Object = js.native
  def default[P, S](wrapper: ShallowWrapper[P, S, ReactComponentClass[js.Object]]): js.Object = js.native
}
