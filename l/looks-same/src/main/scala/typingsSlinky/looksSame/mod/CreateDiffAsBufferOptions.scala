package typingsSlinky.looksSame.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame.createDiff function without diff
  */
@js.native
trait CreateDiffAsBufferOptions extends js.Object {
  /**
    * makes the search algorithm of the antialiasing less strict
    */
  var antialiasingTolerance: js.UndefOr[Double] = js.native
  /**
    * The current image
    */
  var current: String | Buffer | BoundedImage = js.native
  /**
    * Color to highlight the differences
    * e.g. '#ff00ff'
    */
  var highlightColor: String = js.native
  /**
    * Ability to ignore antialiasing
    */
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
  /**
    * Ability to ignore text caret
    */
  var ignoreCaret: js.UndefOr[Boolean] = js.native
  /**
    * The baseline image
    */
  var reference: String | Buffer | BoundedImage = js.native
  /**
    * strict comparsion
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * ΔE value that will be treated as error in non-strict mode
    */
  var tolerance: js.UndefOr[Double] = js.native
}

object CreateDiffAsBufferOptions {
  @scala.inline
  def apply(
    current: String | Buffer | BoundedImage,
    highlightColor: String,
    reference: String | Buffer | BoundedImage
  ): CreateDiffAsBufferOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffAsBufferOptions]
  }
  @scala.inline
  implicit class CreateDiffAsBufferOptionsOps[Self <: CreateDiffAsBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: String | Buffer | BoundedImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: String | Buffer | BoundedImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAntialiasingTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasingTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialiasingTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasingTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAntialiasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAntialiasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAntialiasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAntialiasing")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCaret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCaret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCaret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCaret")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
  }
  
}

