package typingsSlinky.clearbladejsServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CbServer {
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typingsSlinky.clearbladejsServer.CbServer.Resp, 
    scala.Unit
  ]
  type ItemOptions = typingsSlinky.clearbladejsServer.CbServer.CollectionOptionsWithID
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsServer.CbServer.QueryFilterValue]
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsServer.CbServer.QueryValue]
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
  type ReqTypes = typingsSlinky.clearbladejsServer.CbServer.BasicReq
}
