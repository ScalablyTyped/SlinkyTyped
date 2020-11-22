package typingsSlinky.realm.Realm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of functions as defined on the MongoDB Server.
  */
@js.native
trait DefaultFunctionsFactory
  extends BaseFunctionsFactory
     with /**
  * All the functions are accessable as members on this instance.
  */
/* name */ StringDictionary[RealmFunction[_, js.Array[_]]]
object DefaultFunctionsFactory {
  
  @scala.inline
  def apply(
    callFunction: (String, /* repeated */ js.Any) => js.Promise[_],
    callFunctionStreaming: (String, /* repeated */ js.Any) => js.Promise[AsyncIterable[js.typedarray.Uint8Array]]
  ): DefaultFunctionsFactory = {
    val __obj = js.Dynamic.literal(callFunction = js.Any.fromFunction2(callFunction), callFunctionStreaming = js.Any.fromFunction2(callFunctionStreaming))
    __obj.asInstanceOf[DefaultFunctionsFactory]
  }
}
