package typingsSlinky.emotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typingsSlinky.emotionSerialize.mod.ComponentSelector
    - typingsSlinky.emotionSerialize.mod.Keyframes
    - typingsSlinky.emotionUtils.mod.SerializedStyles
    - typingsSlinky.emotionSerialize.mod.CSSObject
    - typingsSlinky.emotionSerialize.mod.ArrayCSSInterpolation
  */
  type CSSInterpolation = js.UndefOr[
    typingsSlinky.emotionSerialize.mod._CSSInterpolation | scala.Null | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.emotionSerialize.mod.Keyframes | typingsSlinky.emotionUtils.mod.SerializedStyles
  ]
  type CSSProperties = typingsSlinky.csstype.mod.PropertiesFallback[scala.Double | java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - `js.undefined`
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - typingsSlinky.emotionSerialize.mod.ComponentSelector
    - typingsSlinky.emotionSerialize.mod.Keyframes
    - typingsSlinky.emotionUtils.mod.SerializedStyles
    - typingsSlinky.emotionSerialize.mod.ArrayInterpolation[MP]
    - typingsSlinky.emotionSerialize.mod.ObjectInterpolation[MP]
    - typingsSlinky.emotionSerialize.helperMod.Equal[
  MP, 
  js.UndefOr[scala.Nothing], 
  scala.Nothing, 
  typingsSlinky.emotionSerialize.mod.FunctionInterpolation[MP]]
  */
  type Interpolation[MP] = js.UndefOr[
    typingsSlinky.emotionSerialize.mod._Interpolation[MP] | (typingsSlinky.emotionSerialize.helperMod.Equal[
      MP, 
      js.UndefOr[scala.Nothing], 
      scala.Nothing, 
      typingsSlinky.emotionSerialize.mod.FunctionInterpolation[MP]
    ]) | scala.Null | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.emotionSerialize.mod.Keyframes | typingsSlinky.emotionUtils.mod.SerializedStyles
  ]
  type Keyframes = typingsSlinky.emotionSerialize.AnonAnim with java.lang.String
}
