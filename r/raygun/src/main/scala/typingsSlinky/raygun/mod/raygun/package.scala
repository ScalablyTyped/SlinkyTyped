package typingsSlinky.raygun.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raygun {
  type GroupingKey = js.Function5[
    /* payload */ typingsSlinky.raygun.mod.raygun.RaygunPayload, 
    /* exception */ js.Error, 
    /* customData */ typingsSlinky.raygun.mod.raygun.KeyValueObject, 
    /* request */ typingsSlinky.raygun.mod.raygun.RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    java.lang.String
  ]
  type OnBeforeSend = js.Function5[
    /* payload */ typingsSlinky.raygun.mod.raygun.RaygunPayload, 
    /* exception */ js.Error, 
    /* customData */ typingsSlinky.raygun.mod.raygun.KeyValueObject, 
    /* request */ typingsSlinky.raygun.mod.raygun.RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    scala.Boolean | typingsSlinky.raygun.mod.raygun.RaygunPayload
  ]
}
