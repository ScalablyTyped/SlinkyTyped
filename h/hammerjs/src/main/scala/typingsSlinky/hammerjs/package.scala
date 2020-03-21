package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hammerjs {
  type HammerListener = js.Function1[/* event */ typingsSlinky.hammerjs.HammerInput, scala.Unit]
  type PanRecognizer = typingsSlinky.hammerjs.AttrRecognizer
  type PinchRecognizer = typingsSlinky.hammerjs.AttrRecognizer
  type PressRecognizer = typingsSlinky.hammerjs.AttrRecognizer
  type RecognizerTuple = js.Array[typingsSlinky.hammerjs.RecognizerStatic] | (js.Tuple2[typingsSlinky.hammerjs.RecognizerStatic, typingsSlinky.hammerjs.RecognizerOptions]) | (js.Tuple3[
    typingsSlinky.hammerjs.RecognizerStatic, 
    typingsSlinky.hammerjs.RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]) | (js.Tuple4[
    typingsSlinky.hammerjs.RecognizerStatic, 
    typingsSlinky.hammerjs.RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String], 
    java.lang.String | typingsSlinky.hammerjs.Recognizer | (js.Array[java.lang.String | typingsSlinky.hammerjs.Recognizer])
  ])
  type RotateRecognizer = typingsSlinky.hammerjs.AttrRecognizer
  type SwipeRecognizer = typingsSlinky.hammerjs.AttrRecognizer
  type TapRecognizer = typingsSlinky.hammerjs.AttrRecognizer
}
