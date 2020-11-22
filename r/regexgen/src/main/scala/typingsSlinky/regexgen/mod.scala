package typingsSlinky.regexgen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexgen", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(inputs: js.Array[String]): js.RegExp = js.native
  def apply(inputs: js.Array[String], flags: String): js.RegExp = js.native
  
  @js.native
  class Trie () extends js.Object {
    
    def add(input: String): Unit = js.native
    
    def addAll(inputs: js.Array[String]): Unit = js.native
    
    def minimize(): Unit = js.native
    
    def toRegExp(): js.RegExp = js.native
    def toRegExp(flags: String): js.RegExp = js.native
    
    def toString(flags: String): String = js.native
  }
}
