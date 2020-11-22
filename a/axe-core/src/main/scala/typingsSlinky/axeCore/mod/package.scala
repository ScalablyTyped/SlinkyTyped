package typingsSlinky.axeCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CheckLocale = org.scalablytyped.runtime.StringDictionary[typingsSlinky.axeCore.anon.Fail]
  
  type ElementContext = org.scalajs.dom.raw.Node | java.lang.String | typingsSlinky.axeCore.mod.ContextObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.axeCore.axeCoreStrings.minor
    - typingsSlinky.axeCore.axeCoreStrings.moderate
    - typingsSlinky.axeCore.axeCoreStrings.serious
    - typingsSlinky.axeCore.axeCoreStrings.critical
    - scala.Null
  */
  type ImpactValue = typingsSlinky.axeCore.mod._ImpactValue | scala.Null
  
  type RuleLocale = org.scalablytyped.runtime.StringDictionary[typingsSlinky.axeCore.anon.Description]
  
  type RuleObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.axeCore.anon.Enabled]
  
  type RunCallback = js.Function2[/* error */ js.Error, /* results */ typingsSlinky.axeCore.mod.AxeResults, scala.Unit]
  
  type TagValue = java.lang.String
}
