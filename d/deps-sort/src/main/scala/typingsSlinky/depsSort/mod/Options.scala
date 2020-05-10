package typingsSlinky.depsSort.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * module-deps constructor options
  */
@js.native
trait Options
  extends /* prop */ StringDictionary[js.Any] {
  /**
    * Set 'row.dedupe' for files that match existing contents. Sets 'row.dedupeIndex' when 'index' is enabled.
    * When 'row.dedupe' is set, 'row.sameDeps' will be set to a boolean of whether the dependencies at the dedupe target match (true) or just the source content (false).
    */
  var dedupe: js.UndefOr[Boolean] = js.native
  /**
    * array of names or object mapping names to true not to mangle with integer indexes when 'index' is turned on.
    * If 'expose' maps names to strings, those strings will be used to resolve the indexed references.
    */
  var expose: js.UndefOr[js.Array[String] | (StringDictionary[Boolean | String])] = js.native
  /**
    * When true, for each module-deps row, insert 'row.index' with the numeric index and
    * 'row.indexDeps' like 'row.deps' but mapping require strings to row indices
    */
  var index: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedupe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedupe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(js.undefined)
        ret
    }
    @scala.inline
    def withExpose(value: js.Array[String] | (StringDictionary[Boolean | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expose")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

