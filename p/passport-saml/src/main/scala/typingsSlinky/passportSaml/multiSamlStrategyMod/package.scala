package typingsSlinky.passportSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object multiSamlStrategyMod {
  
  type SamlOptionsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* samlOptions */ js.UndefOr[typingsSlinky.passportSaml.mod.SamlConfig], 
    scala.Unit
  ]
}
