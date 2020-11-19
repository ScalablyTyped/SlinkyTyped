package typingsSlinky.firebaseStorageTypes.mod

import typingsSlinky.firebaseStorageTypes.anon.PartialObserverUploadTask
import typingsSlinky.firebaseUtil.subscribeMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTask extends js.Object {
  
  def cancel(): Boolean = js.native
  
  def `catch`(onRejected: js.Function1[/* a */ js.Error, _]): js.Promise[_] = js.native
  
  def on(event: TaskEvent): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.UndefOr[scala.Nothing],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.Function1[/* a */ js.Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.UndefOr[scala.Nothing],
    error: js.Function1[/* a */ js.Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: js.UndefOr[scala.Nothing], error: Null, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.UndefOr[scala.Nothing],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.Function1[/* a */ js.Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: js.Function1[/* a */ js.Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
    error: Null,
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: js.UndefOr[scala.Nothing], complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ js.Error, _]): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: Null,
    error: js.Function1[/* a */ js.Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: PartialObserverUploadTask): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: PartialObserverUploadTask,
    error: js.UndefOr[scala.Nothing],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: PartialObserverUploadTask,
    error: js.Function1[/* a */ js.Error, _]
  ): js.Function = js.native
  def on(
    event: TaskEvent,
    nextOrObserver: PartialObserverUploadTask,
    error: js.Function1[/* a */ js.Error, _],
    complete: Unsubscribe
  ): js.Function = js.native
  def on(event: TaskEvent, nextOrObserver: PartialObserverUploadTask, error: Null, complete: Unsubscribe): js.Function = js.native
  
  def pause(): Boolean = js.native
  
  def resume(): Boolean = js.native
  
  var snapshot: UploadTaskSnapshot = js.native
  
  def `then`(): js.Promise[_] = js.native
  def `then`(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* a */ js.Error, _]): js.Promise[_] = js.native
  def `then`(onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Promise[_] = js.native
  def `then`(
    onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _],
    onRejected: js.Function1[/* a */ js.Error, _]
  ): js.Promise[_] = js.native
  def `then`(onFulfilled: Null, onRejected: js.Function1[/* a */ js.Error, _]): js.Promise[_] = js.native
}
