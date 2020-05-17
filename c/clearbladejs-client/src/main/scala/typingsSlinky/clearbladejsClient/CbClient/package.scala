package typingsSlinky.clearbladejsClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbClient {
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typingsSlinky.clearbladejsClient.CbClient.Resp, 
    scala.Unit
  ]
  type ItemOptions = typingsSlinky.clearbladejsClient.CbClient.CollectionOptionsWithID
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsClient.CbClient.QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsClient.CbClient.QueryValue]
}
