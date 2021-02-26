package typingsSlinky.recast

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patcherMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("recast/lib/patcher", "Patcher")
  @js.native
  class Patcher protected () extends PatcherType {
    def this(lines: js.Any) = this()
  }
  @JSImport("recast/lib/patcher", "Patcher")
  @js.native
  val Patcher: PatcherConstructor = js.native
  
  @JSImport("recast/lib/patcher", "getReprinter")
  @js.native
  def getReprinter(path: js.Any): js.UndefOr[js.Function1[/* print */ js.Any, _]] = js.native
  
  @js.native
  trait PatcherConstructor
    extends Instantiable1[/* lines */ js.Any, PatcherType]
  
  @js.native
  trait PatcherType extends StObject {
    
    def deleteComments(node: js.Any): js.Any = js.native
    
    def get(): js.Any = js.native
    def get(loc: js.Any): js.Any = js.native
    
    def replace(loc: js.Any, lines: js.Any): js.Any = js.native
    
    def tryToReprintComments(newNode: js.Any, oldNode: js.Any, print: js.Any): js.Any = js.native
  }
}
