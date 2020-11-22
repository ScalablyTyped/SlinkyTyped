package typingsSlinky.npmProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Options = typingsSlinky.npmRegistryFetch.mod.Options with typingsSlinky.npmProfile.mod.ProfileFetchOptions
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.npmProfile.npmProfileBooleans.`false`
    - typingsSlinky.npmProfile.anon.Dictkey
    - js.Tuple2[java.lang.String, java.lang.String]
    - java.lang.String
  */
  type TFAStatus = typingsSlinky.npmProfile.mod._TFAStatus | (js.Tuple2[java.lang.String, java.lang.String]) | scala.Null | java.lang.String
}
