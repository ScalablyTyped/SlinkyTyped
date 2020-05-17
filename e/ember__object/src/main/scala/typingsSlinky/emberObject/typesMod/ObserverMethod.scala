package typingsSlinky.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * keyof Target * / java.lang.String
  - js.ThisFunction4[
/ * this * / Target, 
/ * sender * / Sender, 
/ * key * / java.lang.String, 
/ * value * / js.Any, 
/ * rev * / scala.Double, 
scala.Unit]
*/
trait ObserverMethod[Target, Sender] extends js.Object

object ObserverMethod {
  @scala.inline
  implicit def apply[Target, Sender](value: /* keyof Target */ String): ObserverMethod[Target, Sender] = value.asInstanceOf[ObserverMethod[Target, Sender]]
  @scala.inline
  implicit def apply[Target, Sender](
    value: js.ThisFunction4[
      /* this */ Target, 
      /* sender */ Sender, 
      /* key */ String, 
      /* value */ js.Any, 
      /* rev */ Double, 
      Unit
    ]
  ): ObserverMethod[Target, Sender] = value.asInstanceOf[ObserverMethod[Target, Sender]]
}

