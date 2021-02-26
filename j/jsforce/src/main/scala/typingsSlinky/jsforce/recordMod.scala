package typingsSlinky.jsforce

import typingsSlinky.jsforce.anon.Id
import typingsSlinky.jsforce.connectionMod.Connection
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.jsforce.salesforceIdMod.SalesforceId
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  @JSImport("jsforce/record", "RecordReference")
  @js.native
  class RecordReference[T] protected () extends StObject {
    def this(conn: Connection, `type`: String, id: SalesforceId) = this()
    
    def blob(fieldName: String): Stream = js.native
    
    def del(): js.Promise[RecordResult] = js.native
    def del(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
    def del(options: js.Object): js.Promise[RecordResult] = js.native
    def del(options: js.Object, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    
    def delete(): js.Promise[RecordResult] = js.native
    def delete(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
    def delete(options: js.Object): js.Promise[RecordResult] = js.native
    def delete(options: js.Object, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    
    def destroy(): js.Promise[RecordResult] = js.native
    def destroy(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
    def destroy(options: js.Object): js.Promise[RecordResult] = js.native
    def destroy(options: js.Object, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    
    def retrieve(): js.Promise[Record[T]] = js.native
    def retrieve(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* record */ Record[T], Unit]
    ): js.Promise[Record[T]] = js.native
    def retrieve(options: js.Object): js.Promise[Record[T]] = js.native
    def retrieve(options: js.Object, callback: js.Function2[/* err */ js.Error, /* record */ Record[T], Unit]): js.Promise[Record[T]] = js.native
    
    def update(record: Partial[T]): js.Promise[RecordResult] = js.native
    def update(
      record: Partial[T],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
    def update(record: Partial[T], options: js.Object): js.Promise[RecordResult] = js.native
    def update(
      record: Partial[T],
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
  }
  
  type Record[T] = Id with T
}
