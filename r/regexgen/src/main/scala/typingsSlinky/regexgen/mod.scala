package typingsSlinky.regexgen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regexgen", JSImport.Namespace)
  @js.native
  def apply(inputs: js.Array[String]): js.RegExp = js.native
  @JSImport("regexgen", JSImport.Namespace)
  @js.native
  def apply(inputs: js.Array[String], flags: String): js.RegExp = js.native
  
  @JSImport("regexgen", "Trie")
  @js.native
  class Trie () extends StObject {
    
    def add(input: String): Unit = js.native
    
    def addAll(inputs: js.Array[String]): Unit = js.native
    
    def minimize(): Unit = js.native
    
    def toRegExp(): js.RegExp = js.native
    def toRegExp(flags: String): js.RegExp = js.native
    
    def toString(flags: String): String = js.native
  }
}
