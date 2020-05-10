package typingsSlinky.saxStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Size of internal transform stream buffer - defaults to 350 objects.
    */
  var highWaterMark: js.UndefOr[Double] = js.native
  /**
    * If true, then lowercase tag names and attribute names in loose mode, rather than uppercasing them.
    */
  var lowercase: js.UndefOr[Boolean] = js.native
  /**
    * If true, then turn any whitespace into a single space.
    */
  var normalize: js.UndefOr[Boolean] = js.native
  /**
    * Default to false, if true makes sax parser to accept valid XML only.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * If true, only parse predefined XML entities (&amp;, &apos;, &gt;, &lt;, and &quot;).
    */
  var strictEntities: js.UndefOr[Boolean] = js.native
  /**
    * Name of the tag to select objects from XML file, an Array of tag names can be used -
    * when multiple tags are specified stream pushes `{ tag, record }` tuples.
    */
  var tag: String | js.Array[String] = js.native
  /**
    * If false, then don't track line/col/position.
    */
  var trackPosition: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to trim text and comment nodes.
    */
  var trim: js.UndefOr[Boolean] = js.native
  /**
    * If true, then namespaces are supported.
    */
  var xmlns: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(tag: String | js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTag(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
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
    def withStrictEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(js.undefined)
        ret
    }
  }
  
}

