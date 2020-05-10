package typingsSlinky.csso.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompressOptions extends js.Object {
  /**
    * Transform a copy of input AST if true. Useful in case of AST reuse.
    * @default false
    */
  @JSName("clone")
  var clone_FCompressOptions: js.UndefOr[Boolean] = js.native
  /**
    * Specify what comments to leave:
    * - 'exclamation' or true – leave all exclamation comments
    * - 'first-exclamation' – remove every comment except first one
    * - false – remove all comments
    * @default true
    */
  var comments: js.UndefOr[String | Boolean] = js.native
  /**
    * Enables merging of @media rules with the same media query by splitted by other rules.
    * The optimisation is unsafe in general, but should work fine in most cases. Use it on your own risk.
    * @default false
    */
  var forceMediaMerge: js.UndefOr[Boolean] = js.native
  /**
    * Function to track every step of transformation.
    */
  var logger: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Disable or enable a structure optimisations.
    * @default true
    */
  var restructure: js.UndefOr[Boolean] = js.native
  /**
    * Usage data for advanced optimisations.
    */
  var usage: js.UndefOr[Usage] = js.native
}

object CompressOptions {
  @scala.inline
  def apply(): CompressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressOptions]
  }
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withForceMediaMerge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMediaMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceMediaMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceMediaMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withRestructure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restructure")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: Usage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
  }
  
}

