package typingsSlinky.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/wrap", JSImport.Namespace)
@js.native
object utilWrapMod extends js.Object {
  def default(
    done: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  def withError(func: js.Function, regex: js.RegExp): js.Any = js.native
  def withWarning(func: js.Function, regex: js.RegExp): js.Promise[_] = js.native
}

