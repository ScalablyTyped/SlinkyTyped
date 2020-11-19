package typingsSlinky.saml20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParseCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* profile */ typingsSlinky.saml20.mod.Profile, 
    /* version */ java.lang.String, 
    scala.Unit
  ]
}
