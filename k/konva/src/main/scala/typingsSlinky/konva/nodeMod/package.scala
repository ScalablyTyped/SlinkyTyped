package typingsSlinky.konva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nodeMod {
  
  type Filter = js.ThisFunction1[
    /* this */ typingsSlinky.konva.nodeMod.Node[typingsSlinky.konva.nodeMod.NodeConfig], 
    /* imageData */ org.scalajs.dom.raw.ImageData, 
    scala.Unit
  ]
  
  type KonvaEventListener[This, EventType] = js.ThisFunction1[
    /* this */ This, 
    /* ev */ typingsSlinky.konva.nodeMod.KonvaEventObject[EventType], 
    scala.Unit
  ]
}
