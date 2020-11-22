package typingsSlinky.mendixmodelsdk.mod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.transactionManagerMod.ITransactionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "runInTransaction")
@js.native
object runInTransaction extends js.Object {
  
  def apply[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  def apply[T](model: IAbstractModel, options: ITransactionOptions, action: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
}
