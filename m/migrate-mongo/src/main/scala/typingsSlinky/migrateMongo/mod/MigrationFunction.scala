package typingsSlinky.migrateMongo.mod

import typingsSlinky.mongodb.mod.Db
import typingsSlinky.mongodb.mod.MongoCallback
import typingsSlinky.mongodb.mod.MongoClient
import typingsSlinky.mongodb.mod.UpdateWriteOpResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * db * / typingsSlinky.mongodb.mod.Db, 
(/ * next * / typingsSlinky.mongodb.mod.MongoCallback[typingsSlinky.mongodb.mod.UpdateWriteOpResult]) | (/ * client * / typingsSlinky.mongodb.mod.MongoClient), 
js.Promise[scala.Unit] | scala.Unit]
  - js.Function3[
/ * db * / typingsSlinky.mongodb.mod.Db, 
/ * client * / typingsSlinky.mongodb.mod.MongoClient, 
/ * next * / typingsSlinky.mongodb.mod.MongoCallback[typingsSlinky.mongodb.mod.UpdateWriteOpResult], 
scala.Unit]
*/
trait MigrationFunction extends js.Object

object MigrationFunction {
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* db */ Db, 
      (/* next */ MongoCallback[UpdateWriteOpResult]) | (/* client */ MongoClient), 
      js.Promise[Unit] | Unit
    ]
  ): MigrationFunction = value.asInstanceOf[MigrationFunction]
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* db */ Db, 
      /* client */ MongoClient, 
      /* next */ MongoCallback[UpdateWriteOpResult], 
      Unit
    ]
  ): MigrationFunction = value.asInstanceOf[MigrationFunction]
}

