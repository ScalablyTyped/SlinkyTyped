package typingsSlinky.consul

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Acl = typingsSlinky.consul.mod.Acl_
  
  type Agent = typingsSlinky.consul.mod.Agent_
  
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[typingsSlinky.consul.mod.Response], 
    js.Any
  ]
  
  type Catalog = typingsSlinky.consul.mod.Catalog_
  
  type Event = typingsSlinky.consul.mod.Event_
  
  type Health = typingsSlinky.consul.mod.Health_
  
  type Kv = typingsSlinky.consul.mod.Kv_
  
  type Lock = typingsSlinky.consul.mod.Lock_
  
  type Session = typingsSlinky.consul.mod.Session_
  
  type Watch = typingsSlinky.consul.mod.Watch_
}
