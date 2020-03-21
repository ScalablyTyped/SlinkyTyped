package typingsSlinky.navigo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Keys = java.lang.String
  type Params = typingsSlinky.navigo.mod.State
  type RouteHandler = (js.Function2[
    /* params */ typingsSlinky.navigo.mod.Params, 
    /* query */ java.lang.String, 
    scala.Unit
  ]) | typingsSlinky.navigo.AnonAs
  type State = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in navigo.navigo.Keys ]: any}
    */ typingsSlinky.navigo.navigoStrings.State with js.Any
}
