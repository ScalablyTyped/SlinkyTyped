package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.constructor
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "classMethod")
@js.native
object classMethod extends js.Object {
  
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean],
    generator: js.UndefOr[Boolean],
    async: js.UndefOr[Boolean]
  ): ClassMethod_ = js.native
}
