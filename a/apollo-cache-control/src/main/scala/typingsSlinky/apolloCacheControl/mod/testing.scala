package typingsSlinky.apolloCacheControl.mod

import typingsSlinky.apolloCacheControl.anon.RequiredCacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-cache-control", "__testing__")
@js.native
object testing extends js.Object {
  
  def addHint(
    hints: MapResponsePathHints,
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsePath */ js.Any,
    hint: CacheHint
  ): Unit = js.native
  @JSName("addHint")
  var addHint_Original: js.Function3[
    /* hints */ MapResponsePathHints, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsePath */ /* path */ js.Any, 
    /* hint */ CacheHint, 
    Unit
  ] = js.native
  
  def computeOverallCachePolicy(hints: MapResponsePathHints): js.UndefOr[RequiredCacheHint] = js.native
  @JSName("computeOverallCachePolicy")
  var computeOverallCachePolicy_Original: js.Function1[/* hints */ MapResponsePathHints, js.UndefOr[RequiredCacheHint]] = js.native
}
