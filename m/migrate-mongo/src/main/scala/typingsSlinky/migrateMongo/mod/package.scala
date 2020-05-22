package typingsSlinky.migrateMongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MigrationFunction = (js.Function2[
    /* db */ typingsSlinky.mongodb.mod.Db, 
    (/* next */ typingsSlinky.mongodb.mod.MongoCallback[typingsSlinky.mongodb.mod.UpdateWriteOpResult]) | (/* client */ typingsSlinky.mongodb.mod.MongoClient), 
    js.Promise[scala.Unit] | scala.Unit
  ]) | (js.Function3[
    /* db */ typingsSlinky.mongodb.mod.Db, 
    /* client */ typingsSlinky.mongodb.mod.MongoClient, 
    /* next */ typingsSlinky.mongodb.mod.MongoCallback[typingsSlinky.mongodb.mod.UpdateWriteOpResult], 
    scala.Unit
  ])
}
