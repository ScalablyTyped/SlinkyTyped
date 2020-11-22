package typingsSlinky.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcUtilsMod {
  
  type Fn[ARGS /* <: js.Array[_] */, R] = js.Function1[/* args */ ARGS, R]
  
  type Hrtime = js.Tuple2[scala.Double, scala.Double]
  
  type InputFile = typingsSlinky.ipfsCore.srcUtilsMod.BaseFile with typingsSlinky.ipfsCore.srcUtilsMod.InputFileExt
  
  type UnixFSFile = typingsSlinky.ipfsCore.srcUtilsMod.BaseFile with typingsSlinky.ipfsCore.srcUtilsMod.UnixFSeExt
}
