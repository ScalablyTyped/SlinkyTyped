package typingsSlinky.nodeIp2region

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SearchCallback = js.Function2[
    /* err */ typingsSlinky.node.NodeJS.ErrnoException, 
    /* result */ typingsSlinky.nodeIp2region.mod.SearchResult, 
    scala.Unit
  ]
  
  type SearchResult = typingsSlinky.nodeIp2region.anon.City | scala.Null
}
