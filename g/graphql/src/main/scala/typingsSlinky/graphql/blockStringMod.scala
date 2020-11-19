package typingsSlinky.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql/language/blockString", JSImport.Namespace)
@js.native
object blockStringMod extends js.Object {
  
  def dedentBlockStringValue(rawString: String): String = js.native
  
  def getBlockStringIndentation(lines: js.Array[String]): Double = js.native
  
  def printBlockString(value: String): String = js.native
  def printBlockString(value: String, indentation: js.UndefOr[scala.Nothing], preferMultipleLines: Boolean): String = js.native
  def printBlockString(value: String, indentation: String): String = js.native
  def printBlockString(value: String, indentation: String, preferMultipleLines: Boolean): String = js.native
}
