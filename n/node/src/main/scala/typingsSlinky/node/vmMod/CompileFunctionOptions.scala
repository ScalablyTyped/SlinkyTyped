package typingsSlinky.node.vmMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileFunctionOptions extends BaseOptions {
  /**
    * Provides an optional data with V8's code cache data for the supplied source.
    */
  var cachedData: js.UndefOr[Buffer] = js.native
  /**
    * An array containing a collection of context extensions (objects wrapping the current scope) to be applied while compiling
    */
  var contextExtensions: js.UndefOr[js.Array[js.Object]] = js.native
  /**
    * The sandbox/context in which the said function should be compiled in.
    */
  var parsingContext: js.UndefOr[Context] = js.native
  /**
    * Specifies whether to produce new cache data.
    * Default: `false`,
    */
  var produceCachedData: js.UndefOr[Boolean] = js.native
}

object CompileFunctionOptions {
  @scala.inline
  def apply(): CompileFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileFunctionOptions]
  }
  @scala.inline
  implicit class CompileFunctionOptionsOps[Self <: CompileFunctionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCachedData(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedData")(js.undefined)
        ret
    }
    @scala.inline
    def withContextExtensions(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withParsingContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsingContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsingContext")(js.undefined)
        ret
    }
    @scala.inline
    def withProduceCachedData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceCachedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduceCachedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produceCachedData")(js.undefined)
        ret
    }
  }
  
}

