package typingsSlinky.parse.Parse.Object

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.parse.Anon_ClassName
import typingsSlinky.parse.Parse.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Object")
@js.native
object ^ extends js.Object {
  def createWithoutData[T /* <: typingsSlinky.parse.Parse.Object[_] */](id: String): T = js.native
  def destroyAll[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T], options: DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def extend(className: Anon_ClassName): js.Any = js.native
  def extend(className: Anon_ClassName, protoProps: js.Any): js.Any = js.native
  def extend(className: Anon_ClassName, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T], keys: String, options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T], keys: js.Array[String | js.Array[String]], options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fromJSON[T /* <: typingsSlinky.parse.Parse.Object[_] */](json: js.Any): T = js.native
  def fromJSON[T /* <: typingsSlinky.parse.Parse.Object[_] */](json: js.Any, `override`: Boolean): T = js.native
  def pinAll(objects: js.Array[typingsSlinky.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
  def pinAllWithName(name: String, objects: js.Array[typingsSlinky.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
  def registerSubclass[T /* <: typingsSlinky.parse.Parse.Object[_] */](className: String, clazz: Instantiable1[js.UndefOr[/* options */ js.Any], T]): Unit = js.native
  def saveAll[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def saveAll[T /* <: typingsSlinky.parse.Parse.Object[_] */](list: js.Array[T], options: SaveAllOptions): js.Promise[js.Array[T]] = js.native
  def unPinAll(objects: js.Array[typingsSlinky.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
  def unPinAllObjects(): js.Promise[Unit] = js.native
  def unPinAllObjectsWithName(name: String): js.Promise[Unit] = js.native
  def unPinAllWithName(name: String, objects: js.Array[typingsSlinky.parse.Parse.Object[_]]): js.Promise[Unit] = js.native
}

