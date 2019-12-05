package typingsSlinky.raygun.raygunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raygun {
  type GroupingKey = js.Function5[
    /* payload */ RaygunPayload, 
    /* exception */ js.Error, 
    /* customData */ KeyValueObject, 
    /* request */ RaygunRequest, 
    /* tags */ js.Array[String], 
    String
  ]
  type OnBeforeSend = js.Function5[
    /* payload */ RaygunPayload, 
    /* exception */ js.Error, 
    /* customData */ KeyValueObject, 
    /* request */ RaygunRequest, 
    /* tags */ js.Array[String], 
    Boolean | RaygunPayload
  ]
}
