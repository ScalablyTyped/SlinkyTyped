package typingsSlinky.emotionSerialize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - js.UndefOr[scala.Nothing]
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
  
  type CSSProperties = typingsSlinky.csstype.mod.PropertiesFallback[scala.Double | java.lang.String, java.lang.String with js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - js.UndefOr[scala.Nothing]
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
  
  type Keyframes = typingsSlinky.emotionSerialize.anon.Anim with java.lang.String
}
