package typingsSlinky.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokenizer extends js.Object {
  
  def createSplitterRegexp(src: String): js.RegExp = js.native
  def createSplitterRegexp(src: String, flag: String): js.RegExp = js.native
  
  def getLineTokens(line: String, startState: String): js.Array[Token] = js.native
  def getLineTokens(line: String, startState: js.Array[String]): js.Array[Token] = js.native
  
  def removeCapturingGroups(src: String): String = js.native
}
