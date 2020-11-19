package typingsSlinky.mochaSteps.mod

import typingsSlinky.mocha.Mocha.Func
import typingsSlinky.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def step(title: String): Test = js.native
  def step(title: String, fn: Func): Test = js.native
  
  def xstep(title: String): Test = js.native
  def xstep(title: String, fn: Func): Test = js.native
}
