package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-types", "classMethod")
@js.native
object classMethod extends js.Object {
  
  def apply(
    kind: js.UndefOr[constructor | method | get | set],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement_],
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean]
  ): ClassMethod_ = js.native
}
