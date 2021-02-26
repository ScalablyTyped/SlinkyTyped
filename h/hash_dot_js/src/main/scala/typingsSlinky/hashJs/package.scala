package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object hashJs {
  
  type HmacConstructor = js.Function3[
    /* hash */ typingsSlinky.hashJs.BlockHash[js.Any], 
    /* key */ js.Any, 
    /* enc */ js.UndefOr[typingsSlinky.hashJs.hashJsStrings.hex], 
    typingsSlinky.hashJs.Hmac
  ]
  
  type Ripemd160Constructor = js.Function0[typingsSlinky.hashJs.Ripemd160]
  
  type Sha1Constructor = js.Function0[typingsSlinky.hashJs.Sha1]
  
  type Sha224Constructor = js.Function0[typingsSlinky.hashJs.Sha224]
  
  type Sha256Constructor = js.Function0[typingsSlinky.hashJs.Sha256]
  
  type Sha384Constructor = js.Function0[typingsSlinky.hashJs.Sha384]
  
  type Sha512Constructor = js.Function0[typingsSlinky.hashJs.Sha512]
}
