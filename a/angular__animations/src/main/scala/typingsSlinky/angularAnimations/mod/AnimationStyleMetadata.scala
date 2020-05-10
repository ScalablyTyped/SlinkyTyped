package typingsSlinky.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularAnimations.angularAnimationsStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationStyleMetadata extends AnimationMetadata {
  /**
    * A percentage of the total animate time at which the style is to be applied.
    */
  var offset: Double | Null = js.native
  /**
    * A set of CSS style properties.
    */
  var styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]) = js.native
}

object AnimationStyleMetadata {
  @scala.inline
  def apply(
    styles: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk]),
    `type`: AnimationMetadataType
  ): AnimationStyleMetadata = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStyleMetadata]
  }
  @scala.inline
  implicit class AnimationStyleMetadataOps[Self <: AnimationStyleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(
      value: Asterisk | (StringDictionary[String | Double]) | (js.Array[(StringDictionary[String | Double]) | Asterisk])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(null)
        ret
    }
  }
  
}

