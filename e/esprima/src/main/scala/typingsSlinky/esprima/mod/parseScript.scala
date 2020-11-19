package typingsSlinky.esprima.mod

import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esprima", "parseScript")
@js.native
object parseScript extends js.Object {
  
  def apply(input: String): Program = js.native
  def apply(
    input: String,
    config: js.UndefOr[scala.Nothing],
    delegate: js.Function2[/* node */ Node, /* meta */ js.Any, Unit]
  ): Program = js.native
  def apply(input: String, config: ParseOptions): Program = js.native
  def apply(
    input: String,
    config: ParseOptions,
    delegate: js.Function2[/* node */ Node, /* meta */ js.Any, Unit]
  ): Program = js.native
}
