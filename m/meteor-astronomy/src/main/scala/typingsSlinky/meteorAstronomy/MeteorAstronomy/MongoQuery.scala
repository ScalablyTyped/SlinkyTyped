package typingsSlinky.meteorAstronomy.MeteorAstronomy

import typingsSlinky.meteor.Mongo.ObjectID
import typingsSlinky.meteor.Mongo.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.meteor.Mongo.Selector[T]
  - typingsSlinky.meteor.Mongo.ObjectID
  - java.lang.String
*/
trait MongoQuery[T] extends js.Object

object MongoQuery {
  @scala.inline
  implicit def apply[T](value: ObjectID): MongoQuery[T] = value.asInstanceOf[MongoQuery[T]]
  @scala.inline
  implicit def apply[T](value: Selector[T]): MongoQuery[T] = value.asInstanceOf[MongoQuery[T]]
  @scala.inline
  implicit def apply[T](value: String): MongoQuery[T] = value.asInstanceOf[MongoQuery[T]]
}

