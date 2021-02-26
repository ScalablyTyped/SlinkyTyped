package typingsSlinky.nodeMysqlWrapper.mod

import typingsSlinky.nodeMysqlWrapper.Mongo.Collection
import typingsSlinky.nodeMysqlWrapper.Mongo.Cursor
import typingsSlinky.nodeMysqlWrapper.anon.Fetch
import typingsSlinky.nodeMysqlWrapper.anon.Fields
import typingsSlinky.nodeMysqlWrapper.anon.Reactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "MeteorCollection")
@js.native
class MeteorCollection[T] protected () extends StObject {
  def this(table: Table[T]) = this()
  def this(table: Table[T], name: String) = this()
  
  //ONLY MONGO/METEOR COLLECTION METHODS START
  def allow(options: Fetch[T]): Boolean = js.native
  
  var collection: Collection[T] = js.native
  
  def deny(options: Fetch[T]): Boolean = js.native
  
  def fill(criteriaRawJsObject: js.Any): Unit = js.native
  
  def fillAll(): Unit = js.native
  
  def fillOne(criteriaRawJsObject: js.Any): Unit = js.native
  
  def find(): Cursor[T] = js.native
  def find(selector: js.UndefOr[scala.Nothing], options: Fields): Cursor[T] = js.native
  def find(selector: js.Any): Cursor[T] = js.native
  def find(selector: js.Any, options: Fields): Cursor[T] = js.native
  
  def findOne(): T = js.native
  def findOne(selector: js.UndefOr[scala.Nothing], options: Reactive): T = js.native
  def findOne(selector: js.Any): T = js.native
  def findOne(selector: js.Any, options: Reactive): T = js.native
  
  var rawCollection: Collection[T] = js.native
  
  def startListeningToDatabase(): Unit = js.native
  
  var table: Table[T] = js.native
}
