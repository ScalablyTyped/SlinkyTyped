package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.APIResponseSuccess
import typingsSlinky.ionic.definitionsMod.PaginatorGuard
import typingsSlinky.ionic.definitionsMod.PaginatorRequestGenerator
import typingsSlinky.ionic.definitionsMod.Response
import typingsSlinky.ionic.definitionsMod.SSHKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/definitions.PaginateArgs<ionic.ionic/definitions.Response<std.Array<ionic.ionic/definitions.SSHKey>>>> */
@js.native
trait PartialPaginateArgsResponMax extends StObject {
  
  var guard: js.UndefOr[PaginatorGuard[Response[js.Array[SSHKey]]]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var reqgen: js.UndefOr[PaginatorRequestGenerator] = js.native
  
  var state: js.UndefOr[PartialPaginatorState] = js.native
}
object PartialPaginateArgsResponMax {
  
  @scala.inline
  def apply(): PartialPaginateArgsResponMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaginateArgsResponMax]
  }
  
  @scala.inline
  implicit class PartialPaginateArgsResponMaxMutableBuilder[Self <: PartialPaginateArgsResponMax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuard(value: /* res */ APIResponseSuccess => /* is T */ Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setReqgen(value: () => js.Promise[Req]): Self = StObject.set(x, "reqgen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReqgenUndefined: Self = StObject.set(x, "reqgen", js.undefined)
    
    @scala.inline
    def setState(value: PartialPaginatorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
