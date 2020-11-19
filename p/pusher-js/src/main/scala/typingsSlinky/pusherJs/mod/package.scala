package typingsSlinky.pusherJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Authorizer = js.Function2[
    /* channel */ typingsSlinky.pusherJs.mod.Channel, 
    /* options */ typingsSlinky.pusherJs.mod.Config, 
    typingsSlinky.pusherJs.anon.Authorize
  ]
  
  type EventCallback = js.Function2[/* context */ js.Any, /* data */ js.Any, scala.Unit]
}
