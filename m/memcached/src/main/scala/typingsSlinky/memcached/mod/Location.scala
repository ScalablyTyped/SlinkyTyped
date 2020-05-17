package typingsSlinky.memcached.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declaration for single server or Memcached cluster location
  *
  * to connect to a single server use
  * "127.0.0.1:11211"
  *
  * to connect to a cluster of Memcached servers use
  * ["127.0.0.1:11211","127.0.0.1:11212"]
  *
  * to connect to servers with weight use
  * {"127.0.0.1:11211": 1,"127.0.0.1:11212": 2}
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - org.scalablytyped.runtime.StringDictionary[scala.Double]
*/
trait Location extends js.Object

object Location {
  @scala.inline
  implicit def apply(value: js.Array[String]): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: String): Location = value.asInstanceOf[Location]
  @scala.inline
  implicit def apply(value: StringDictionary[Double]): Location = value.asInstanceOf[Location]
}

