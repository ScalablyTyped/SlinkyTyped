package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EXTDisjointTimerQuery extends js.Object {
  var GPU_DISJOINT_EXT: Double = js.native
  var QUERY_COUNTER_BITS_EXT: Double = js.native
  var QUERY_RESULT_AVAILABLE_EXT: Double = js.native
  var QUERY_RESULT_EXT: Double = js.native
  var TIMESTAMP_EXT: Double = js.native
  var TIME_ELAPSED_EXT: Double = js.native
  def beginQueryEXT(target: Double, query: typingsSlinky.std.WebGLQuery): Unit = js.native
  def createQueryEXT(): typingsSlinky.std.WebGLQuery = js.native
  def deleteQueryEXT(query: typingsSlinky.std.WebGLQuery): Unit = js.native
  def endQueryEXT(target: Double): Unit = js.native
  def getQueryObjectEXT(query: typingsSlinky.std.WebGLQuery, target: Double): js.Any = js.native
  def queryCounterEXT(query: typingsSlinky.std.WebGLQuery, target: Double): Unit = js.native
}

object EXTDisjointTimerQuery {
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: Double,
    QUERY_COUNTER_BITS_EXT: Double,
    QUERY_RESULT_AVAILABLE_EXT: Double,
    QUERY_RESULT_EXT: Double,
    TIMESTAMP_EXT: Double,
    TIME_ELAPSED_EXT: Double,
    beginQueryEXT: (Double, typingsSlinky.std.WebGLQuery) => Unit,
    createQueryEXT: () => typingsSlinky.std.WebGLQuery,
    deleteQueryEXT: typingsSlinky.std.WebGLQuery => Unit,
    endQueryEXT: Double => Unit,
    getQueryObjectEXT: (typingsSlinky.std.WebGLQuery, Double) => js.Any,
    queryCounterEXT: (typingsSlinky.std.WebGLQuery, Double) => Unit
  ): EXTDisjointTimerQuery = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_COUNTER_BITS_EXT = QUERY_COUNTER_BITS_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIMESTAMP_EXT = TIMESTAMP_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any], beginQueryEXT = js.Any.fromFunction2(beginQueryEXT), createQueryEXT = js.Any.fromFunction0(createQueryEXT), deleteQueryEXT = js.Any.fromFunction1(deleteQueryEXT), endQueryEXT = js.Any.fromFunction1(endQueryEXT), getQueryObjectEXT = js.Any.fromFunction2(getQueryObjectEXT), queryCounterEXT = js.Any.fromFunction2(queryCounterEXT))
    __obj.asInstanceOf[EXTDisjointTimerQuery]
  }
  @scala.inline
  implicit class EXTDisjointTimerQueryOps[Self <: EXTDisjointTimerQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGPU_DISJOINT_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GPU_DISJOINT_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUERY_COUNTER_BITS_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUERY_COUNTER_BITS_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUERY_RESULT_AVAILABLE_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUERY_RESULT_AVAILABLE_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUERY_RESULT_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUERY_RESULT_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIMESTAMP_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMESTAMP_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIME_ELAPSED_EXT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIME_ELAPSED_EXT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginQueryEXT(value: (Double, typingsSlinky.std.WebGLQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginQueryEXT")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateQueryEXT(value: () => typingsSlinky.std.WebGLQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQueryEXT")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteQueryEXT(value: typingsSlinky.std.WebGLQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteQueryEXT")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndQueryEXT(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endQueryEXT")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQueryObjectEXT(value: (typingsSlinky.std.WebGLQuery, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryObjectEXT")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withQueryCounterEXT(value: (typingsSlinky.std.WebGLQuery, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCounterEXT")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

