package typingsSlinky.clearbladejsNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typingsSlinky.clearbladejsNode.mod.Resp, 
    scala.Unit
  ]
  type ItemOptions = typingsSlinky.clearbladejsNode.mod.CollectionOptionsWithID
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsNode.mod.QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsNode.mod.QueryValue]
}
