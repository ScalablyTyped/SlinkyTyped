package typingsSlinky.reactNativeFirebase.mod.RNFirebase.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  def endAt(): Query = js.native
  def endAt(value: String): Query = js.native
  def endAt(value: String, key: String): Query = js.native
  def endAt(value: Boolean): Query = js.native
  def endAt(value: Boolean, key: String): Query = js.native
  def endAt(value: Double): Query = js.native
  def endAt(value: Double, key: String): Query = js.native
  def endAt(value: Null, key: String): Query = js.native
  
  def equalTo(): Query = js.native
  def equalTo(value: String): Query = js.native
  def equalTo(value: String, key: String): Query = js.native
  def equalTo(value: Boolean): Query = js.native
  def equalTo(value: Boolean, key: String): Query = js.native
  def equalTo(value: Double): Query = js.native
  def equalTo(value: Double, key: String): Query = js.native
  def equalTo(value: Null, key: String): Query = js.native
  
  def isEqual(): Boolean = js.native
  def isEqual(other: Query): Boolean = js.native
  
  def limitToFirst(limit: Double): Query = js.native
  
  def limitToLast(limit: Double): Query = js.native
  
  def off(): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], callback: QuerySuccessCallback): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], callback: QuerySuccessCallback, context: js.Object): Unit = js.native
  def off(eventType: QueryEventType): Unit = js.native
  def off(eventType: QueryEventType, callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def off(eventType: QueryEventType, callback: QuerySuccessCallback): Unit = js.native
  def off(eventType: QueryEventType, callback: QuerySuccessCallback, context: js.Object): Unit = js.native
  
  def on(eventType: QueryEventType, callback: QuerySuccessCallback): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
  def on(
    eventType: QueryEventType,
    callback: QuerySuccessCallback,
    cancelCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
  def on(
    eventType: QueryEventType,
    callback: QuerySuccessCallback,
    cancelCallbackOrContext: QueryErrorCallback
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
  def on(
    eventType: QueryEventType,
    callback: QuerySuccessCallback,
    cancelCallbackOrContext: QueryErrorCallback,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
  
  def once(eventType: QueryEventType): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: QueryEventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: QueryEventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: QueryErrorCallback
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: QueryEventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: QueryErrorCallback,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(eventType: QueryEventType, successCallback: QuerySuccessCallback): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: QueryEventType,
    successCallback: QuerySuccessCallback,
    failureCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: QueryEventType,
    successCallback: QuerySuccessCallback,
    failureCallbackOrContext: QueryErrorCallback
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: QueryEventType,
    successCallback: QuerySuccessCallback,
    failureCallbackOrContext: QueryErrorCallback,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  
  def orderByChild(path: String): Query = js.native
  
  def orderByKey(): Query = js.native
  
  def orderByPriority(): Query = js.native
  
  def orderByValue(): Query = js.native
  
  var ref: Reference = js.native
  
  def startAt(): Query = js.native
  def startAt(value: String): Query = js.native
  def startAt(value: String, key: String): Query = js.native
  def startAt(value: Boolean): Query = js.native
  def startAt(value: Boolean, key: String): Query = js.native
  def startAt(value: Double): Query = js.native
  def startAt(value: Double, key: String): Query = js.native
  def startAt(value: Null, key: String): Query = js.native
  
  def toJSON(): js.Object = js.native
}
