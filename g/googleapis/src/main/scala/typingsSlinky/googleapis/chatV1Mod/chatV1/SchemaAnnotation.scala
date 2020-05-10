package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations associated with the plain-text body of the message.  Example
  * plain-text message body: ``` Hello @FooBot how are you!&quot; ```  The
  * corresponding annotations metadata: ``` &quot;annotations&quot;:[{
  * &quot;type&quot;:&quot;USER_MENTION&quot;,   &quot;startIndex&quot;:6,
  * &quot;length&quot;:7,   &quot;userMention&quot;: {     &quot;user&quot;: {
  * &quot;name&quot;:&quot;users/107946847022116401880&quot;,
  * &quot;displayName&quot;:&quot;FooBot&quot;,
  * &quot;avatarUrl&quot;:&quot;https://goo.gl/aeDtrS&quot;,
  * &quot;type&quot;:&quot;BOT&quot;     },
  * &quot;type&quot;:&quot;MENTION&quot;    } }] ```
  */
@js.native
trait SchemaAnnotation extends js.Object {
  /**
    * Length of the substring in the plain-text message body this annotation
    * corresponds to.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Start index (0-based, inclusive) in the plain-text message body this
    * annotation corresponds to.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The type of this annotation.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The metadata of user mention.
    */
  var userMention: js.UndefOr[SchemaUserMentionMetadata] = js.native
}

object SchemaAnnotation {
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  @scala.inline
  implicit class SchemaAnnotationOps[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMention(value: SchemaUserMentionMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMention")(js.undefined)
        ret
    }
  }
  
}

