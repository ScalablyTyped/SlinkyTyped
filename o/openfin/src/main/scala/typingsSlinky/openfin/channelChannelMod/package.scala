package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object channelChannelMod {
  
  type Action = js.Function0[js.Any] | (js.Function1[/* payload */ js.Any, js.Any]) | (js.Function2[
    /* payload */ js.Any, 
    /* id */ typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity, 
    js.Any
  ])
  
  type Middleware = js.Function0[js.Any] | (js.Function1[/* action */ java.lang.String, js.Any]) | (js.Function2[/* action */ java.lang.String, /* payload */ js.Any, js.Any]) | (js.Function3[
    /* action */ java.lang.String, 
    /* payload */ js.Any, 
    /* id */ typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity, 
    js.Any
  ])
}
