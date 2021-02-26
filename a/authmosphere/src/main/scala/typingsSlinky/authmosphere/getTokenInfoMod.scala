package typingsSlinky.authmosphere

import typingsSlinky.authmosphere.loggerMod.Logger
import typingsSlinky.authmosphere.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTokenInfoMod {
  
  type GetTokenInfo[T] = js.Function3[
    /* tokenInfoUrl */ String, 
    /* accessToken */ String, 
    /* logger */ js.UndefOr[Logger], 
    js.Promise[Token[T]]
  ]
}
