package typingsSlinky.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.hammerjs.RecognizerStatic]
  - js.Tuple2[typingsSlinky.hammerjs.RecognizerStatic, typingsSlinky.hammerjs.RecognizerOptions]
  - js.Tuple3[
typingsSlinky.hammerjs.RecognizerStatic, 
typingsSlinky.hammerjs.RecognizerOptions, 
java.lang.String | js.Array[java.lang.String]]
  - js.Tuple4[
typingsSlinky.hammerjs.RecognizerStatic, 
typingsSlinky.hammerjs.RecognizerOptions, 
java.lang.String | js.Array[java.lang.String], 
java.lang.String | typingsSlinky.hammerjs.Recognizer | (js.Array[java.lang.String | typingsSlinky.hammerjs.Recognizer])]
*/
trait RecognizerTuple extends js.Object

object RecognizerTuple {
  @scala.inline
  implicit def apply(value: js.Array[RecognizerStatic]): RecognizerTuple = value.asInstanceOf[RecognizerTuple]
  @scala.inline
  implicit def apply(value: js.Tuple2[RecognizerStatic, RecognizerOptions]): RecognizerTuple = value.asInstanceOf[RecognizerTuple]
  @scala.inline
  implicit def apply(value: js.Tuple3[RecognizerStatic, RecognizerOptions, String | js.Array[String]]): RecognizerTuple = value.asInstanceOf[RecognizerTuple]
  @scala.inline
  implicit def apply(
    value: js.Tuple4[
      RecognizerStatic, 
      RecognizerOptions, 
      String | js.Array[String], 
      String | Recognizer | (js.Array[String | Recognizer])
    ]
  ): RecognizerTuple = value.asInstanceOf[RecognizerTuple]
}

