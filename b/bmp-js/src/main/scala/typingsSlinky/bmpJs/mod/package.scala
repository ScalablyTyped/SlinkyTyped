package typingsSlinky.bmpJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Decode_ = js.Function1[/* bmpData */ typingsSlinky.node.Buffer, typingsSlinky.bmpJs.mod.BmpDecoder]
  
  type Encode_ = js.Function2[
    /* imgData */ typingsSlinky.bmpJs.mod.ImageData, 
    /* quality */ js.UndefOr[scala.Double], 
    typingsSlinky.bmpJs.mod.ImageData
  ]
}
