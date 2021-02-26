package typingsSlinky.difflib

import typingsSlinky.difflib.difflibStrings.delete
import typingsSlinky.difflib.difflibStrings.equal
import typingsSlinky.difflib.difflibStrings.insert
import typingsSlinky.difflib.difflibStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("difflib", "SequenceMatcher")
  @js.native
  class SequenceMatcher[T] protected () extends StObject {
    def this(isjunk: js.Function0[Boolean], left: T, right: T) = this()
    def this(isjunk: Null, left: T, right: T) = this()
    def this(isjunk: js.Function0[Boolean], left: T, right: T, autojunk: Boolean) = this()
    def this(isjunk: Null, left: T, right: T, autojunk: Boolean) = this()
    
    def getOpcodes(): js.Array[js.Tuple5[replace | delete | insert | equal, Double, Double, Double, Double]] = js.native
  }
}
