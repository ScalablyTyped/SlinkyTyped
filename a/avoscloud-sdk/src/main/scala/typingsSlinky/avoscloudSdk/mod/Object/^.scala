package typingsSlinky.avoscloudSdk.mod.Object

import typingsSlinky.avoscloudSdk.mod.Promise
import typingsSlinky.avoscloudSdk.mod.SuccessFailureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("avoscloud-sdk", "Object")
@js.native
object ^ extends js.Object {
  
  def destroyAll[T](list: js.Array[typingsSlinky.avoscloudSdk.mod.Object]): Promise[T] = js.native
  def destroyAll[T](list: js.Array[typingsSlinky.avoscloudSdk.mod.Object], options: DestroyAllOptions): Promise[T] = js.native
  
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.UndefOr[scala.Nothing], classProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  
  def fetchAll[T](list: js.Array[typingsSlinky.avoscloudSdk.mod.Object], options: SuccessFailureOptions): Promise[T] = js.native
  
  def fetchAllIfNeeded[T](list: js.Array[typingsSlinky.avoscloudSdk.mod.Object], options: SuccessFailureOptions): Promise[T] = js.native
  
  def saveAll[T](list: js.Array[typingsSlinky.avoscloudSdk.mod.Object]): Promise[T] = js.native
  def saveAll[T](list: js.Array[typingsSlinky.avoscloudSdk.mod.Object], options: SaveAllOptions): Promise[T] = js.native
}
