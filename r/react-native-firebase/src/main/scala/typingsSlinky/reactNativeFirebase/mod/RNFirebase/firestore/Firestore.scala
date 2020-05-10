package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore

import typingsSlinky.reactNativeFirebase.mod.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firestore extends js.Object {
  val app: App = js.native
  def batch(): WriteBatch = js.native
  def collection(collectionPath: String): CollectionReference = js.native
  def disableNetwork(): js.Promise[Unit] = js.native
  def doc(documentPath: String): DocumentReference = js.native
  def enableNetwork(): js.Promise[Unit] = js.native
  def enablePersistence(enabled: Boolean): js.Promise[Unit] = js.native
  def runTransaction(updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[_]]): js.Promise[_] = js.native
  def settings(settings: Settings): js.Promise[Unit] = js.native
}

object Firestore {
  @scala.inline
  def apply(
    app: App,
    batch: () => WriteBatch,
    collection: String => CollectionReference,
    disableNetwork: () => js.Promise[Unit],
    doc: String => DocumentReference,
    enableNetwork: () => js.Promise[Unit],
    enablePersistence: Boolean => js.Promise[Unit],
    runTransaction: js.Function1[/* transaction */ Transaction, js.Promise[_]] => js.Promise[_],
    settings: Settings => js.Promise[Unit]
  ): Firestore = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], batch = js.Any.fromFunction0(batch), collection = js.Any.fromFunction1(collection), disableNetwork = js.Any.fromFunction0(disableNetwork), doc = js.Any.fromFunction1(doc), enableNetwork = js.Any.fromFunction0(enableNetwork), enablePersistence = js.Any.fromFunction1(enablePersistence), runTransaction = js.Any.fromFunction1(runTransaction), settings = js.Any.fromFunction1(settings))
    __obj.asInstanceOf[Firestore]
  }
  @scala.inline
  implicit class FirestoreOps[Self <: Firestore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: App): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatch(value: () => WriteBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCollection(value: String => CollectionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisableNetwork(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNetwork")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoc(value: String => DocumentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableNetwork(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetwork")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunTransaction(value: js.Function1[/* transaction */ Transaction, js.Promise[_]] => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSettings(value: Settings => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

