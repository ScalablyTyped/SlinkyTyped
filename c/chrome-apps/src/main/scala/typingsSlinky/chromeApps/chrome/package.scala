package typingsSlinky.chromeApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object chrome {
  
  /**
    * Convert constant and variables that function as enums to string literals.
    * Makes it possible to use both the enum and string.
    * String enums are a combination of 'enum type' and string literal type.
    */
  type IDict[T, K, F] = F
  
  type ToStringLiteral[C /* <: js.Object */, K, V] = typingsSlinky.chromeApps.chrome.IDict[
    C, 
    V, 
    /* import warning: importer.ImportType#apply Failed type conversion: C[V] */ js.Any
  ]
  
  /** @deprecated Should never be used, used to guide migrations. */
  type deprecated = scala.Nothing
  
  // #region internal
  //////////////
  // INTERNAL //
  //////////////
  /** @deprecated Could be used, if e.g. deprecated recently */
  type deprecatedButUsable = js.Any
  
  // | 'integer';
  ///
  /// BigInt is supported in Chrome now, but not in the api.
  /// TypeScript doesn't support it either, so till then, use helper types.
  ///
  /**
    * Double
    * -
    * Chrome uses JS number, but internally requires an integer or double.
    * This is a helper type to prevent mixup.
    */
  type double = scala.Double
  
  /**
    * Integer
    * -
    * Chrome uses JS number, but internally requires an integer or double.
    * This is a helper type to prevent mixup.
    */
  type integer = scala.Double
}
