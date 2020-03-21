package typingsSlinky.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HelmetCspDirectiveValue = java.lang.String | typingsSlinky.helmet.mod.IHelmetContentSecurityPolicyDirectiveFunction
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.helmet.helmetStrings.script
    - typingsSlinky.helmet.helmetStrings.style
  */
  type HelmetCspRequireSriForValue = typingsSlinky.helmet.mod._HelmetCspRequireSriForValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.helmet.helmetStrings.`allow-forms`
    - typingsSlinky.helmet.helmetStrings.`allow-modals`
    - typingsSlinky.helmet.helmetStrings.`allow-orientation-lock`
    - typingsSlinky.helmet.helmetStrings.`allow-pointer-lock`
    - typingsSlinky.helmet.helmetStrings.`allow-popups-to-escape-sandbox`
    - typingsSlinky.helmet.helmetStrings.`allow-popups`
    - typingsSlinky.helmet.helmetStrings.`allow-presentation`
    - typingsSlinky.helmet.helmetStrings.`allow-same-origin`
    - typingsSlinky.helmet.helmetStrings.`allow-scripts`
    - typingsSlinky.helmet.helmetStrings.`allow-top-navigation`
  */
  type HelmetCspSandboxDirective = typingsSlinky.helmet.mod._HelmetCspSandboxDirective | java.lang.String
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    java.lang.String
  ]
  type IHelmetSetIfFunction = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    scala.Boolean
  ]
}
