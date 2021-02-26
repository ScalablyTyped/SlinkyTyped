package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accessor extends StObject {
  
  /* protected */ def _get(propertyName: String): js.Any = js.native
  @JSName("_get")
  /* protected */ def _get_T_T[T](propertyName: String): T = js.native
  
  /* protected */ def _set[T](propertyName: String, value: T): this.type = js.native
  
  var declaredClass: String = js.native
  
  def destroy(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  def get(propertyName: String): js.Any = js.native
  @JSName("get")
  def get_T_T[T](propertyName: String): T = js.native
  
  var initialized: Boolean = js.native
  
  /* protected */ def notifyChange(propertyName: String): Unit = js.native
  
  def set(props: HashMap[_]): this.type = js.native
  def set[T](propertyName: String, value: T): this.type = js.native
  
  def watch(path: String, callback: WatchCallback): WatchHandle = js.native
  def watch(path: String, callback: WatchCallback, sync: Boolean): WatchHandle = js.native
  def watch(path: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  def watch(path: js.Array[String], callback: WatchCallback, sync: Boolean): WatchHandle = js.native
}
