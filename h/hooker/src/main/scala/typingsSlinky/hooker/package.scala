package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hooker {
  
  type HookerPostHookFunction = js.Function2[
    /* result */ js.Any, 
    /* repeated */ js.Any, 
    typingsSlinky.hooker.IHookerPostHookResult | scala.Unit
  ]
  
  type HookerPreHookFunction = js.Function1[/* repeated */ js.Any, typingsSlinky.hooker.IHookerPreHookResult | scala.Unit]
}
