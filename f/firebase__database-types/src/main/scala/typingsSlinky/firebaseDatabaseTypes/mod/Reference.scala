package typingsSlinky.firebaseDatabaseTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference extends Query {
  
  def child(path: String): Reference = js.native
  
  var key: String | Null = js.native
  
  def onDisconnect(): OnDisconnect = js.native
  
  var parent: Reference | Null = js.native
  
  def push(): ThenableReference = js.native
  def push(value: js.UndefOr[scala.Nothing], onComplete: js.Function1[/* a */ js.Error | Null, _]): ThenableReference = js.native
  def push(value: js.Any): ThenableReference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): ThenableReference = js.native
  
  def remove(): js.Promise[_] = js.native
  def remove(onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  
  var root: Reference = js.native
  
  def set(value: js.Any): js.Promise[_] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  
  def setPriority(priority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  
  def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
  
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.UndefOr[scala.Nothing],
    applyLocally: Boolean
  ): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ js.Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, _]
  ): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ js.Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, _],
    applyLocally: Boolean
  ): js.Promise[_] = js.native
  
  def update(values: js.Object): js.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
}
