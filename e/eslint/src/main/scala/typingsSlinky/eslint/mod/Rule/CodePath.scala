package typingsSlinky.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePath extends js.Object {
  var childCodePaths: js.Array[CodePath] = js.native
  var currentSegments: js.Array[CodePathSegment] = js.native
  var finalSegments: js.Array[CodePathSegment] = js.native
  var id: String = js.native
  var initialSegment: CodePathSegment = js.native
  var returnedSegments: js.Array[CodePathSegment] = js.native
  var thrownSegments: js.Array[CodePathSegment] = js.native
  var upper: CodePath | Null = js.native
}

object CodePath {
  @scala.inline
  def apply(
    childCodePaths: js.Array[CodePath],
    currentSegments: js.Array[CodePathSegment],
    finalSegments: js.Array[CodePathSegment],
    id: String,
    initialSegment: CodePathSegment,
    returnedSegments: js.Array[CodePathSegment],
    thrownSegments: js.Array[CodePathSegment]
  ): CodePath = {
    val __obj = js.Dynamic.literal(childCodePaths = childCodePaths.asInstanceOf[js.Any], currentSegments = currentSegments.asInstanceOf[js.Any], finalSegments = finalSegments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialSegment = initialSegment.asInstanceOf[js.Any], returnedSegments = returnedSegments.asInstanceOf[js.Any], thrownSegments = thrownSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePath]
  }
  @scala.inline
  implicit class CodePathOps[Self <: CodePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildCodePaths(value: js.Array[CodePath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCodePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSegments(value: js.Array[CodePathSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalSegments(value: js.Array[CodePathSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialSegment(value: CodePathSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnedSegments(value: js.Array[CodePathSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnedSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrownSegments(value: js.Array[CodePathSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thrownSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpper(value: CodePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upper")(null)
        ret
    }
  }
  
}

