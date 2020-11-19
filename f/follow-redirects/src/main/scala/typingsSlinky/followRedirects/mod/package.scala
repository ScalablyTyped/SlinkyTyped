package typingsSlinky.followRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Override[T, U] = (typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, /* keyof U */ java.lang.String]
  ]) with U
  
  type WrappedScheme[T /* <: typingsSlinky.followRedirects.mod.Scheme[_, _, _] */] = typingsSlinky.followRedirects.mod.Override[T, typingsSlinky.followRedirects.mod.RedirectScheme[js.Any, js.Any, js.Any]]
}
