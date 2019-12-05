package typingsSlinky.consul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object consulMod {
  type Acl = Acl_
  type Agent = Agent_
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[Response], 
    js.Any
  ]
  type Catalog = Catalog_
  type Event = Event_
  type Health = Health_
  type Kv = Kv_
  type Lock = Lock_
  type Session = Session_
  type Watch = Watch_
}
