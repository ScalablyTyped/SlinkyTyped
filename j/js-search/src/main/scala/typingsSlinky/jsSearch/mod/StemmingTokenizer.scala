package typingsSlinky.jsSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-search", "StemmingTokenizer")
@js.native
class StemmingTokenizer protected () extends ITokenizer {
  def this(stemmingFunction: StemmingFunction, decoratedTokenizer: ITokenizer) = this()
}
