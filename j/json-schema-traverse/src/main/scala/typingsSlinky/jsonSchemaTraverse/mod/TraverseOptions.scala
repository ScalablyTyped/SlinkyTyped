package typingsSlinky.jsonSchemaTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraverseOptions extends js.Object {
  /** Without option allKeys: true callback will be called only with root schema. */
  var allKeys: js.UndefOr[Boolean] = js.native
  /**
    * Callback function `cb` is called for each schema object (not including draft-06 boolean schemas),
    * including the root schema, in pre-order traversal. Schema references (`$ref`) are not resolved,
    * they are passed as is. Alternatively, you can pass a `{pre, post}` object as `cb`, and then `pre`
    * will be called before traversing child elements, and `post` will be called
    * after all child elementshave been traversed.
    */
  var cb: js.UndefOr[TraverseCallback] = js.native
}

object TraverseOptions {
  @scala.inline
  def apply(): TraverseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraverseOptions]
  }
  @scala.inline
  implicit class TraverseOptionsOps[Self <: TraverseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCbFunction7(
      value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withCb(value: TraverseCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.undefined)
        ret
    }
  }
  
}

