package typingsSlinky.hyphen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Asynchronous hyphenation function returning a promise for the hyphenated text.
    * @param text The text to be hyphenated.
    * @param options Options for the hyphenation process.
    * @returns A promise of the hyphenated text.
    */
  type HyphenationFunctionAsync = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.hyphen.anon.ReadonlyHyphenationOption], 
    js.Promise[java.lang.String]
  ]
  
  /**
    * Synchronous hyphenation function returning the hyphenated text immediately.
    * @param text The text to be hyphenated.
    * @param options Options for the hyphenation process.
    * @returns The hyphenated text.
    */
  type HyphenationFunctionSync = js.Function2[
    /* text */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.hyphen.anon.ReadonlyHyphenationOption], 
    java.lang.String
  ]
}
