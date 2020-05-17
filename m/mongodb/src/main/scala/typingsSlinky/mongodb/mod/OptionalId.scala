package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.IdAny
import typingsSlinky.mongodb.anon.IdExtractIdType
import typingsSlinky.mongodb.mongodbStrings._id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodb.mod.WithId[TSchema]
  - (typingsSlinky.mongodb.mod.EnhancedOmit[TSchema, typingsSlinky.mongodb.mongodbStrings._id]) with typingsSlinky.mongodb.anon.IdExtractIdType[TSchema]
*/
trait OptionalId[TSchema /* <: IdAny */] extends UpdateOptionalId[TSchema]

object OptionalId {
  @scala.inline
  implicit def apply[TSchema](value: ((EnhancedOmit[TSchema, _id]) with IdExtractIdType[TSchema]) | WithId[TSchema]): OptionalId[TSchema] = value.asInstanceOf[OptionalId[TSchema]]
}

