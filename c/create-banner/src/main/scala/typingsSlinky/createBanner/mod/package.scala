package typingsSlinky.createBanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // @credit @sindresorhus/type-fest
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: typingsSlinky.createBanner.mod.Primitive */] = LiteralType | (BaseType with typingsSlinky.createBanner.anon._empty)
  
  // @credit @sindresorhus/type-fest
  type Primitive = js.UndefOr[
    scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.BigInt
  ]
}
