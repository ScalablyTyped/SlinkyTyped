package typingsSlinky.androiduix.android.text.method

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method.ReplacementTransformationMethod")
@js.native
abstract class ReplacementTransformationMethod () extends TransformationMethod {
  /* protected */ def getOriginal(): js.Array[String] = js.native
  /* protected */ def getReplacement(): js.Array[String] = js.native
}

@JSGlobal("android.text.method.ReplacementTransformationMethod")
@js.native
object ReplacementTransformationMethod extends js.Object {
  @js.native
  class ReplacementCharSequence protected ()
    extends typingsSlinky.std.String {
    def this(source: String, original: js.Array[String], replacement: js.Array[String]) = this()
    var mOriginal: js.Any = js.native
    var mReplacement: js.Any = js.native
    var mSource: js.Any = js.native
    def startReplace(start: Double, end: Double): String = js.native
  }
  
}

