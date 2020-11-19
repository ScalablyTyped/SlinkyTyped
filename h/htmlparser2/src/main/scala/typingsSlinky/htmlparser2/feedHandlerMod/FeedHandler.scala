package typingsSlinky.htmlparser2.feedHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandler * / any */ @JSImport("htmlparser2/lib/FeedHandler", "FeedHandler")
@js.native
/**
  *
  * @param callback
  * @param options
  */
class FeedHandler () extends js.Object {
  def this(callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any) = this()
  def this(callback: js.Function1[/* error */ js.Error | Null, Unit]) = this()
  def this(
    callback: js.UndefOr[scala.Nothing],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
  ) = this()
  def this(
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
  ) = this()
  def this(
    callback: js.Function1[/* error */ js.Error | Null, Unit],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomHandlerOptions */ js.Any
  ) = this()
  
  var feed: js.UndefOr[Feed] = js.native
  
  def onend(): Unit = js.native
}
