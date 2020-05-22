package typingsSlinky.bemCn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BemCn = js.Function1[/* blockName */ java.lang.String, typingsSlinky.bemCn.mod.Block_]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsSlinky.bemCn.mod.BemBlock
    - typingsSlinky.bemCn.anon.ToString
    - js.UndefOr[scala.Nothing]
  */
  type BemMix = js.UndefOr[typingsSlinky.bemCn.mod._BemMix | js.Array[java.lang.String] | java.lang.String]
  type BemMods = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | js.Any]
  type BemState = typingsSlinky.std.Record[java.lang.String, scala.Boolean]
  type Block_ = typingsSlinky.bemCn.mod.IBlock with java.lang.String
}
