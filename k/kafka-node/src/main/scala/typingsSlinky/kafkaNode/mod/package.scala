package typingsSlinky.kafkaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BrokerMetadataResponse = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.kafkaNode.anon.Host]
  
  type CustomPartitioner = js.Function2[
    /* partitions */ js.Array[scala.Double], 
    /* key */ java.lang.String | typingsSlinky.node.Buffer, 
    scala.Double
  ]
}
