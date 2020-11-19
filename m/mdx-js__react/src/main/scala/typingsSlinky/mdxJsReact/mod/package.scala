package typingsSlinky.mdxJsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Taken from https://github.com/sindresorhus/type-fest/blob/794de74c6e0d1650fe07b91d22d970b68c1d3e37/source/except.d.ts#L1-L22
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ java.lang.String */] = typingsSlinky.std.Pick[
    ObjectType, 
    typingsSlinky.std.Exclude[/* keyof ObjectType */ java.lang.String, KeysType]
  ]
  
  type MDXProviderComponentsProp = typingsSlinky.mdxJsReact.mod.MDXProviderComponents | (js.Function1[
    /* components */ typingsSlinky.mdxJsReact.mod.MDXProviderComponents, 
    typingsSlinky.mdxJsReact.mod.MDXProviderComponents
  ])
}
