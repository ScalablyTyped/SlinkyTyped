package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-types/ts3.6", "objectMethod")
@js.native
object objectMethod extends js.Object {
  
  def apply(
    kind: js.UndefOr[get | set | method],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement_],
    computed: js.UndefOr[Boolean]
  ): ObjectMethod_ = js.native
}
