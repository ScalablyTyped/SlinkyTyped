package typingsSlinky.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalOptions extends js.Object {
  var allowEmptyStartVector: Boolean = js.native
  var signalStart: Boolean = js.native
  var startVector: String | js.Array[String] = js.native
  var traverseContext: TraversalContext = js.native
}

object TraversalOptions {
  @scala.inline
  def apply(
    allowEmptyStartVector: Boolean,
    signalStart: Boolean,
    startVector: String | js.Array[String],
    traverseContext: TraversalContext
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal(allowEmptyStartVector = allowEmptyStartVector.asInstanceOf[js.Any], signalStart = signalStart.asInstanceOf[js.Any], startVector = startVector.asInstanceOf[js.Any], traverseContext = traverseContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalOptions]
  }
  @scala.inline
  implicit class TraversalOptionsOps[Self <: TraversalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEmptyStartVector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyStartVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignalStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signalStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartVector(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraverseContext(value: TraversalContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverseContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

