package typingsSlinky.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/utils/comparer", JSImport.Namespace)
@js.native
object comparerMod extends js.Object {
  
  @js.native
  object comparer extends js.Object {
    
    def default(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("default")
    var default_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    
    def identity(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("identity")
    var identity_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    
    def shallow(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("shallow")
    var shallow_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    
    def structural(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("structural")
    var structural_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  }
  
  type IEqualsComparer[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
}
