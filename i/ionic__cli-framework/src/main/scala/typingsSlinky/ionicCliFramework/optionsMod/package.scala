package typingsSlinky.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object optionsMod {
  
  type OptionPredicate[O /* <: typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataOption */] = js.Function2[
    /* option */ O, 
    /* value */ js.UndefOr[typingsSlinky.ionicCliFramework.definitionsMod.ParsedArg], 
    scala.Boolean
  ]
}
