package typingsSlinky.relayRuntime.relayStoreTypesMod

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordSourceProxy extends StObject {
  
  def create(dataID: DataID, typeName: String): RecordProxy[js.Object] = js.native
  
  def delete(dataID: DataID): Unit = js.native
  
  // tslint:disable-next-line:no-unnecessary-generics
  def get[T](dataID: DataID): js.UndefOr[RecordProxy[T] | Null] = js.native
  
  def getRoot(): RecordProxy[js.Object] = js.native
}
object RecordSourceProxy {
  
  @scala.inline
  def apply(
    create: (DataID, String) => RecordProxy[js.Object],
    delete: DataID => Unit,
    get: DataID => js.UndefOr[RecordProxy[js.Any] | Null],
    getRoot: () => RecordProxy[js.Object]
  ): RecordSourceProxy = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[RecordSourceProxy]
  }
  
  @scala.inline
  implicit class RecordSourceProxyMutableBuilder[Self <: RecordSourceProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (DataID, String) => RecordProxy[js.Object]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: DataID => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: DataID => js.UndefOr[RecordProxy[js.Any] | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRoot(value: () => RecordProxy[js.Object]): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
  }
}
