package typingsSlinky.hyphen.mod

import typingsSlinky.hyphen.anon.ReadonlyFactoryOptions
import typingsSlinky.hyphen.anon.ReadonlyPatternsDefinitio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyphen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates a hyphenation function that can be used to hyphenate text.
    * @param patternsDefinition The hyphenation patterns definition for a language.
    * @param options Settings for the hyphenation function.
    * @returns Depending on the options a synchronous or asynchronous hyphenation function.
    */
  def apply(patternsDefinition: ReadonlyPatternsDefinitio): HyphenationFunctionAsync | HyphenationFunctionSync = js.native
  def apply(patternsDefinition: ReadonlyPatternsDefinitio, options: ReadonlyFactoryOptions): HyphenationFunctionAsync | HyphenationFunctionSync = js.native
}
