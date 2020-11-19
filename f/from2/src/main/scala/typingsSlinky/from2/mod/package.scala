package typingsSlinky.from2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Chunk = java.lang.String | typingsSlinky.node.Buffer | js.typedarray.Uint8Array | scala.Null
  
  type From2Ctor[R /* <: typingsSlinky.from2.mod.ReadInput | typingsSlinky.from2.mod.ReadObjectInput */] = org.scalablytyped.runtime.Instantiable1[/* read */ R, typingsSlinky.node.NodeJS.ReadableStream]
  
  type NextCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ typingsSlinky.from2.mod.Chunk, scala.Unit]
  
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, scala.Unit]
  
  type ReadCallback[N /* <: typingsSlinky.from2.mod.NextCallback | typingsSlinky.from2.mod.NextObjectCallback */] = js.Function2[/* size */ scala.Double, /* next */ N, scala.Unit]
  
  type ReadInput = typingsSlinky.from2.mod.ReadCallback[typingsSlinky.from2.mod.NextCallback] | js.Array[typingsSlinky.from2.mod.Chunk]
  
  type ReadObjectInput = typingsSlinky.from2.mod.ReadCallback[typingsSlinky.from2.mod.NextObjectCallback] | js.Array[js.Any]
}
