package typingsSlinky.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cardinality condition for the Waiter resource. A cardinality condition is
  * met when the number of variables under a specified path prefix reaches a
  * predefined number. For example, if you set a Cardinality condition where
  * the `path` is set to `/foo` and the number of paths is set to `2`, the
  * following variables would meet the condition in a RuntimeConfig resource:
  * + `/foo/variable1 = &quot;value1&quot;` + `/foo/variable2 =
  * &quot;value2&quot;` + `/bar/variable3 = &quot;value3&quot;`  It would not
  * satisfy the same condition with the `number` set to `3`, however, because
  * there is only 2 paths that start with `/foo`. Cardinality conditions are
  * recursive; all subtrees under the specific path prefix are counted.
  */
@js.native
trait SchemaCardinality extends js.Object {
  /**
    * The number variables under the `path` that must exist to meet this
    * condition. Defaults to 1 if not specified.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The root of the variable subtree to monitor. For example, `/foo`.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaCardinality {
  @scala.inline
  def apply(): SchemaCardinality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardinality]
  }
  @scala.inline
  implicit class SchemaCardinalityOps[Self <: SchemaCardinality] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

