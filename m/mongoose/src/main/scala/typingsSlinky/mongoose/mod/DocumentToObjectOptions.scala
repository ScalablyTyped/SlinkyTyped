package typingsSlinky.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentToObjectOptions extends js.Object {
  /** depopulate any populated paths, replacing them with their original refs (defaults to false) */
  var depopulate: js.UndefOr[Boolean] = js.native
  /** whether to convert Maps to POJOs. (defaults to false) */
  var flattenMaps: js.UndefOr[Boolean] = js.native
  /** apply all getters (path and virtual getters) */
  var getters: js.UndefOr[Boolean] = js.native
  /** remove empty objects (defaults to true) */
  var minimize: js.UndefOr[Boolean] = js.native
  /**
    * A transform function to apply to the resulting document before returning
    * @param doc The mongoose document which is being converted
    * @param ret The plain object representation which has been converted
    * @param options The options in use (either schema options or the options passed inline)
    */
  var transform: js.UndefOr[js.Function3[/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any, _]] = js.native
  /** whether to include the version key (defaults to true) */
  var versionKey: js.UndefOr[Boolean] = js.native
  /** apply virtual getters (can override getters option) */
  var virtuals: js.UndefOr[Boolean] = js.native
}

object DocumentToObjectOptions {
  @scala.inline
  def apply(): DocumentToObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentToObjectOptions]
  }
  @scala.inline
  implicit class DocumentToObjectOptionsOps[Self <: DocumentToObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepopulate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depopulate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepopulate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depopulate")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattenMaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlattenMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flattenMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withGetters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* doc */ js.Any, /* ret */ js.Any, /* options */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtuals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtuals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtuals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtuals")(js.undefined)
        ret
    }
  }
  
}

