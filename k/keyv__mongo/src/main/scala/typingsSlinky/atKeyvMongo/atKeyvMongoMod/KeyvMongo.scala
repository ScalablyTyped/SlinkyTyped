package typingsSlinky.atKeyvMongo.atKeyvMongoMod

import typingsSlinky.atKeyvMongo.atKeyvMongoBooleans.`false`
import typingsSlinky.keyv.keyvMod.Store
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyvMongo[TValue]
  extends EventEmitter
     with Store[TValue] {
  var namespace: js.UndefOr[String] = js.native
  val ttlSupport: `false` = js.native
}

