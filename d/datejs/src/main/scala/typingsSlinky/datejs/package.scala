package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object datejs {
  
  //NOTE: IDateJSStatic and IDateJS are provided here solely for backwards compatability with previous versions of this particular definition file (datejs.d.ts.)
  //DO NOT use them in new code (and it is strongly suggested you remove their use in any existing code); simply use the Javascript Date class instead.
  type IDateJS = typingsSlinky.datejs.Date
  
  type IDateJSStatic = typingsSlinky.datejs.DateConstructor
}
