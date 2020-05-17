package typingsSlinky.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjacentSpace extends js.Object {
  /**
    * Controls extra space before `nav` element; defaults to `false`
    */
  var adjacentSpace: js.UndefOr[Boolean] = js.native
  /**
    * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
    */
  var ie7Hack: js.UndefOr[Boolean] = js.native
  /**
    * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
    */
  var mergeLimit: Double = js.native
  /**
    * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
    */
  var mergeablePseudoClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
    */
  var mergeablePseudoElements: js.Array[String] = js.native
  /**
    * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
    */
  var multiplePseudoMerging: Boolean = js.native
}

object AdjacentSpace {
  @scala.inline
  def apply(mergeLimit: Double, mergeablePseudoElements: js.Array[String], multiplePseudoMerging: Boolean): AdjacentSpace = {
    val __obj = js.Dynamic.literal(mergeLimit = mergeLimit.asInstanceOf[js.Any], mergeablePseudoElements = mergeablePseudoElements.asInstanceOf[js.Any], multiplePseudoMerging = multiplePseudoMerging.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjacentSpace]
  }
  @scala.inline
  implicit class AdjacentSpaceOps[Self <: AdjacentSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeablePseudoElements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeablePseudoElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplePseudoMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplePseudoMerging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdjacentSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjacentSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacentSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withIe7Hack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie7Hack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIe7Hack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ie7Hack")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeablePseudoClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeablePseudoClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeablePseudoClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeablePseudoClasses")(js.undefined)
        ret
    }
  }
  
}

