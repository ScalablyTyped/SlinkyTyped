package typingsSlinky.clearbladejsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CbCallback = js.Function2[
    /* error */ scala.Boolean, 
    /* response */ typingsSlinky.clearbladejsNode.mod.Resp, 
    scala.Unit
  ]
  
  @scala.inline
  def ClearBlade: typingsSlinky.clearbladejsNode.mod.ClearBladeGlobal = typingsSlinky.clearbladejsNode.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ClearBlade").asInstanceOf[typingsSlinky.clearbladejsNode.mod.ClearBladeGlobal]
  @scala.inline
  def ClearBlade_=(x: typingsSlinky.clearbladejsNode.mod.ClearBladeGlobal): scala.Unit = typingsSlinky.clearbladejsNode.mod.^.asInstanceOf[js.Dynamic].updateDynamic("ClearBlade")(x.asInstanceOf[js.Any])
  
  type ItemOptions = typingsSlinky.clearbladejsNode.mod.CollectionOptionsWithID
  
  type KeyValuePair = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MessageCallback = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type QueryFilter = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsNode.mod.QueryFilterValue]
  
  type QueryFilterValue = org.scalablytyped.runtime.StringDictionary[typingsSlinky.clearbladejsNode.mod.QueryValue]
  
  type QueryValue = java.lang.String | scala.Double | scala.Boolean
}
